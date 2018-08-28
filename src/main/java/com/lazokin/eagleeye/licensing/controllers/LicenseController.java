package com.lazokin.eagleeye.licensing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lazokin.eagleeye.licensing.models.License;
import com.lazokin.eagleeye.licensing.service.LicenseService;

@RestController
@RequestMapping(value="/v1/organisations/{organisationId}/licenses")
public class LicenseController {
	
	private LicenseService service;

	public LicenseController(LicenseService service) {
		this.service = service;
	}

	@RequestMapping(value="/{licenseId}", method = RequestMethod.GET)
	public License getLicenses(@PathVariable("organisationId") String organisationId, @PathVariable("licenseId") String licenseId) {
		return this.service.getLicense(organisationId, licenseId);
	}

}
