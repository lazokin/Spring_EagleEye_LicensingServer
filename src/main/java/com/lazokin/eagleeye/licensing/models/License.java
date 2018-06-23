package com.lazokin.eagleeye.licensing.models;

public class License {
	
	private String id;
	private String productName;
	private String licenseType;
	private String organisationId;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public License withId(String id) {
		setId(id);
		return this;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public License withProductName(String productName) {
		setProductName(productName);
		return this;
	}
	
	public String getLicenseType() {
		return licenseType;
	}
	
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
	public License withLicenseType(String licenseType) {
		setLicenseType(licenseType);
		return this;
	}
	
	public String getOrganisationId() {
		return organisationId;
	}
	
	public void setOrganisationId(String organisationId) {
		this.organisationId = organisationId;
	}
	
	public License withOrganisationId(String organisationId) {
		setOrganisationId(organisationId);
		return this;
	}
	
}
