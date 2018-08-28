package com.lazokin.eagleeye.licensing.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {
	
	@Id
	@Column(name = "licende_id", nullable = false)
	private String licenseId;
	
	@Column(name = "organisation_id", nullable = false)
	private String organisationId;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Column(name = "comment", nullable = true)
	private String comment;
	
	public License() {
		
	}

	public License(String licenseId, String organisationId, String productName) {
		this.licenseId = licenseId;
		this.organisationId = organisationId;
		this.productName = productName;
	}

	public String getLicenseId() {
		return licenseId;
	}
	
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	
	public License withLicenseId(String id) {
		setLicenseId(id);
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public License withComment(String comment) {
		setComment(comment);
		return this;
	}
	
}
