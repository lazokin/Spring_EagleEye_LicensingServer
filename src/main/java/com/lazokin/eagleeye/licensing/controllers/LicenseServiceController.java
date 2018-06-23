package com.lazokin.eagleeye.licensing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lazokin.eagleeye.licensing.models.License;

@RestController
@RequestMapping(value="/v1/organisations/{organisationId}/licenses")
public class LicenseServiceController {
	
	@RequestMapping(value="/{licenseId}", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organisationId") String organisationId, @PathVariable("licenseId") String licenseId) {
		return new License()
				.withId(licenseId)
				.withProductName("Telco")
				.withLicenseType("Seat")
				.withOrganisationId(organisationId);
	}

}
