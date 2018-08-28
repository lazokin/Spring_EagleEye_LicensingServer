package com.lazokin.eagleeye.licensing.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.lazokin.eagleeye.licensing.configuration.LicenseConfiguration;
import com.lazokin.eagleeye.licensing.models.License;
import com.lazokin.eagleeye.licensing.repository.LicenseRepository;

@Service
public class LicenseService {
	
	private LicenseRepository repository;
	
	private LicenseConfiguration configuration;

	public LicenseService(LicenseRepository repository, LicenseConfiguration configuration) {
		this.repository = repository;
		this.configuration = configuration;
	}

	public License getLicense(String organisationId, String licenseId) {
		License license = repository.findByOrganisationIdAndLicenseId(organisationId, licenseId);
		if (license == null) {
			return null;
		}
		return license.withComment(configuration.getComment());
	}
	
	public List<License> getLicensesByOrganisationId(String organisationId) {
		return repository.findByOrganisationId(organisationId);
	}
	
	public void saveLicense(License license) {
		license.withLicenseId(UUID.randomUUID().toString());
		repository.save(license);
	}

}
