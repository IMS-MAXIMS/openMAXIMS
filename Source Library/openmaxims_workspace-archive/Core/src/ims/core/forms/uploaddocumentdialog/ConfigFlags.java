//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
package ims.core.forms.uploaddocumentdialog;

import java.io.Serializable;

public final class ConfigFlags extends ims.framework.FormConfigFlags implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final RELEASE_MODEClass RELEASE_MODE;
	public final FILE_UPLOAD_DIRClass FILE_UPLOAD_DIR;
	public final UPLOAD_URLClass UPLOAD_URL;
	public final OPENOFFICE_URLClass OPENOFFICE_URL;
	public final OPENOFFICE_PORTClass OPENOFFICE_PORT;
	public final PDF_UPLOAD_URLClass PDF_UPLOAD_URL;
	public final APPLICATION_URLClass APPLICATION_URL;

	public ConfigFlags(ims.framework.ConfigFlag configFlags)
	{
		super(configFlags);

		RELEASE_MODE = new RELEASE_MODEClass(configFlags);
		FILE_UPLOAD_DIR = new FILE_UPLOAD_DIRClass(configFlags);
		UPLOAD_URL = new UPLOAD_URLClass(configFlags);
		OPENOFFICE_URL = new OPENOFFICE_URLClass(configFlags);
		OPENOFFICE_PORT = new OPENOFFICE_PORTClass(configFlags);
		PDF_UPLOAD_URL = new PDF_UPLOAD_URLClass(configFlags);
		APPLICATION_URL = new APPLICATION_URLClass(configFlags);
	}

	public final class RELEASE_MODEClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public RELEASE_MODEClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public Boolean getValue()
		{
			return (Boolean)configFlags.get("RELEASE_MODE");
		}
	}
	public final class FILE_UPLOAD_DIRClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public FILE_UPLOAD_DIRClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("FILE_UPLOAD_DIR");
		}
	}
	public final class UPLOAD_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public UPLOAD_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("UPLOAD_URL");
		}
	}
	public final class OPENOFFICE_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OPENOFFICE_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("OPENOFFICE_URL");
		}
	}
	public final class OPENOFFICE_PORTClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public OPENOFFICE_PORTClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("OPENOFFICE_PORT");
		}
	}
	public final class PDF_UPLOAD_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public PDF_UPLOAD_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("PDF_UPLOAD_URL");
		}
	}
	public final class APPLICATION_URLClass implements Serializable
	{
		private static final long serialVersionUID = 1L;
		private final ims.framework.ConfigFlag configFlags;

		public APPLICATION_URLClass(ims.framework.ConfigFlag configFlags)
		{
			this.configFlags = configFlags;
		}

		public String getValue()
		{
			return (String)configFlags.get("APPLICATION_URL");
		}
	}
}
