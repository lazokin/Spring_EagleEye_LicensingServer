package com.lazokin.eagleeye.licensing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lazokin.eagleeye.licensing.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
	
	public List<License> findByOrganisationId(String organisationId);
	
	public License findByOrganisationIdAndLicenseId(String organisationId, String licenseId);

}
