package ims.restoration.tests;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ims.core.generic.domain.objects.PersonName;
import ims.core.patient.domain.objects.Patient;
import ims.domain.DomainSession;
import ims.domain.Transaction;
import ims.domain.hibernate3.DomainFactory;

/**
 * Test-only endpoint injected temporarily into the deployed application.
 * It exercises the application's own Hibernate domain layer, not raw JDBC.
 */
public final class PersistenceSmokeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain; charset=UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();
        try {
            String marker = "RESTORATION_TEST_" + UUID.randomUUID().toString().replace('-', '_');
            int patientId = createPatient(marker);
            verifyPatient(patientId, marker);
            String updatedMarker = marker + "_UPDATED";
            updatePatient(patientId, updatedMarker);
            verifyPatient(patientId, updatedMarker);
            deletePatient(patientId);
            out.println("PASS application-persistence " + patientId);
        } catch (Throwable failure) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            failure.printStackTrace(out);
        }
    }

    private int createPatient(String marker) throws Exception {
        DomainFactory factory = factory();
        Transaction transaction = factory.beginTransaction();
        try {
            Patient patient = new Patient();
            PersonName name = new PersonName();
            name.setSurname(marker);
            name.setForename("Restoration");
            patient.setName(name);
            patient.setIsActive(Boolean.TRUE);
            factory.save(patient);
            transaction.commit();
            return patient.getId().intValue();
        } catch (Exception failure) {
            transaction.rollback();
            throw failure;
        } finally {
            factory.close();
        }
    }

    private void verifyPatient(int patientId, String expectedSurname) {
        DomainFactory factory = factory();
        try {
            Patient patient = (Patient) factory.getDomainObject(Patient.class, patientId);
            if (patient == null || patient.getName() == null
                    || !expectedSurname.equals(patient.getName().getSurname())) {
                throw new IllegalStateException("Patient reload did not preserve expected surname");
            }
        } finally {
            factory.close();
        }
    }

    private void updatePatient(int patientId, String surname) throws Exception {
        DomainFactory factory = factory();
        Transaction transaction = factory.beginTransaction();
        try {
            Patient patient = (Patient) factory.getDomainObject(Patient.class, patientId);
            if (patient == null || patient.getName() == null) {
                throw new IllegalStateException("Patient disappeared before update");
            }
            patient.getName().setSurname(surname);
            factory.save(patient);
            transaction.commit();
        } catch (Exception failure) {
            transaction.rollback();
            throw failure;
        } finally {
            factory.close();
        }
    }

    private void deletePatient(int patientId) throws Exception {
        DomainFactory factory = factory();
        Transaction transaction = factory.beginTransaction();
        try {
            Patient patient = (Patient) factory.getDomainObject(Patient.class, patientId);
            if (patient != null) {
                factory.delete(patient);
            }
            transaction.commit();
        } catch (Exception failure) {
            transaction.rollback();
            throw failure;
        } finally {
            factory.close();
        }
    }

    private DomainFactory factory() {
        DomainSession session = new DomainSession();
        DomainFactory factory = new DomainFactory();
        factory.setDomainSession(session);
        return factory;
    }
}
