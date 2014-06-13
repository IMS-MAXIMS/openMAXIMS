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

/*
 * This code was generated.
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:38
 */
package ims.correspondence.vo.lookups;

import ims.domain.lookups.LookupService;

/**
 * This is a generated interface.
 * Provides methods to get the ValueObject Lookup types of this namespace.
 * 
 */
public final class LookupHelper {
	public static RecipientTypeCollection getRecipientType(LookupService lookupService) {
		RecipientTypeCollection collection =
			(RecipientTypeCollection) lookupService.getLookupCollection(RecipientType.TYPE_ID, 
				RecipientTypeCollection.class, RecipientType.class);
		return collection;
	}

	public static RecipientType getRecipientTypeInstance(LookupService lookupService, int id) 
	{
		return (RecipientType)lookupService.getLookupInstance(RecipientType.class, RecipientType.TYPE_ID, id);
	}
	

	public static AssociationSpecifierCollection getAssociationSpecifier(LookupService lookupService) {
		AssociationSpecifierCollection collection =
			(AssociationSpecifierCollection) lookupService.getLookupCollection(AssociationSpecifier.TYPE_ID, 
				AssociationSpecifierCollection.class, AssociationSpecifier.class);
		return collection;
	}

	public static AssociationSpecifier getAssociationSpecifierInstance(LookupService lookupService, int id) 
	{
		return (AssociationSpecifier)lookupService.getLookupInstance(AssociationSpecifier.class, AssociationSpecifier.TYPE_ID, id);
	}
	

	public static NoLetterIsRequiredSpecifierCollection getNoLetterIsRequiredSpecifier(LookupService lookupService) {
		NoLetterIsRequiredSpecifierCollection collection =
			(NoLetterIsRequiredSpecifierCollection) lookupService.getLookupCollection(NoLetterIsRequiredSpecifier.TYPE_ID, 
				NoLetterIsRequiredSpecifierCollection.class, NoLetterIsRequiredSpecifier.class);
		return collection;
	}

	public static NoLetterIsRequiredSpecifier getNoLetterIsRequiredSpecifierInstance(LookupService lookupService, int id) 
	{
		return (NoLetterIsRequiredSpecifier)lookupService.getLookupInstance(NoLetterIsRequiredSpecifier.class, NoLetterIsRequiredSpecifier.TYPE_ID, id);
	}
	

	public static YesCollection getYes(LookupService lookupService) {
		YesCollection collection =
			(YesCollection) lookupService.getLookupCollection(Yes.TYPE_ID, 
				YesCollection.class, Yes.class);
		return collection;
	}

	public static Yes getYesInstance(LookupService lookupService, int id) 
	{
		return (Yes)lookupService.getLookupInstance(Yes.class, Yes.TYPE_ID, id);
	}
	

	public static AccessCollection getAccess(LookupService lookupService) {
		AccessCollection collection =
			(AccessCollection) lookupService.getLookupCollection(Access.TYPE_ID, 
				AccessCollection.class, Access.class);
		return collection;
	}

	public static Access getAccessInstance(LookupService lookupService, int id) 
	{
		return (Access)lookupService.getLookupInstance(Access.class, Access.TYPE_ID, id);
	}
	

	public static SpecialInterestTypeCollection getSpecialInterestType(LookupService lookupService) {
		SpecialInterestTypeCollection collection =
			(SpecialInterestTypeCollection) lookupService.getLookupCollection(SpecialInterestType.TYPE_ID, 
				SpecialInterestTypeCollection.class, SpecialInterestType.class);
		return collection;
	}

	public static SpecialInterestType getSpecialInterestTypeInstance(LookupService lookupService, int id) 
	{
		return (SpecialInterestType)lookupService.getLookupInstance(SpecialInterestType.class, SpecialInterestType.TYPE_ID, id);
	}
	

	public static ProfileTypeCollection getProfileType(LookupService lookupService) {
		ProfileTypeCollection collection =
			(ProfileTypeCollection) lookupService.getLookupCollection(ProfileType.TYPE_ID, 
				ProfileTypeCollection.class, ProfileType.class);
		return collection;
	}

	public static ProfileType getProfileTypeInstance(LookupService lookupService, int id) 
	{
		return (ProfileType)lookupService.getLookupInstance(ProfileType.class, ProfileType.TYPE_ID, id);
	}
	

	public static GlossaryCategoryCollection getGlossaryCategory(LookupService lookupService) {
		GlossaryCategoryCollection collection =
			(GlossaryCategoryCollection) lookupService.getLookupCollection(GlossaryCategory.TYPE_ID, 
				GlossaryCategoryCollection.class, GlossaryCategory.class);
		return collection;
	}

	public static GlossaryCategory getGlossaryCategoryInstance(LookupService lookupService, int id) 
	{
		return (GlossaryCategory)lookupService.getLookupInstance(GlossaryCategory.class, GlossaryCategory.TYPE_ID, id);
	}
	

	public static HeaderCollection getHeader(LookupService lookupService) {
		HeaderCollection collection =
			(HeaderCollection) lookupService.getLookupCollection(Header.TYPE_ID, 
				HeaderCollection.class, Header.class);
		return collection;
	}

	public static Header getHeaderInstance(LookupService lookupService, int id) 
	{
		return (Header)lookupService.getLookupInstance(Header.class, Header.TYPE_ID, id);
	}
	

	public static GlossarySpecifierCollection getGlossarySpecifier(LookupService lookupService) {
		GlossarySpecifierCollection collection =
			(GlossarySpecifierCollection) lookupService.getLookupCollection(GlossarySpecifier.TYPE_ID, 
				GlossarySpecifierCollection.class, GlossarySpecifier.class);
		return collection;
	}

	public static GlossarySpecifier getGlossarySpecifierInstance(LookupService lookupService, int id) 
	{
		return (GlossarySpecifier)lookupService.getLookupInstance(GlossarySpecifier.class, GlossarySpecifier.TYPE_ID, id);
	}
	
}



