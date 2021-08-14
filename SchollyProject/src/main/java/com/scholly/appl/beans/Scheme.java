package com.scholly.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEME")
public class Scheme {

	@Id
	@Column(name = "SCHEME_ID")
	private int schemeId;

	@Column(name = "SCHEME_NAME")
	private String schemeName;

	@Column(name = "SCHEME_DESC")
	private String schemeDescription;

	@Column(name = "SCHEME_AMT")
	private int schemeAmount;

	@Column(name = "APPLICABLE_GENDER")
	private String applicableGender;

	@Column(name = "SSC_PERCENTAGE")
	private String sscPercentage;

	@Column(name = "HSC_PERCENTAGE")
	private String hscPercentage;

	public Scheme() {
		super();
	}

	public Scheme(int schemeId, String schemeName, String schemeDescription, int schemeAmount, String applicableGender,
			String sscPercentage, String hscPercentage) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
		this.schemeDescription = schemeDescription;
		this.schemeAmount = schemeAmount;
		this.applicableGender = applicableGender;
		this.sscPercentage = sscPercentage;
		this.hscPercentage = hscPercentage;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

	public int getSchemeAmount() {
		return schemeAmount;
	}

	public void setSchemeAmount(int schemeAmount) {
		this.schemeAmount = schemeAmount;
	}

	public String getApplicableGender() {
		return applicableGender;
	}

	public void setApplicableGender(String applicableGender) {
		this.applicableGender = applicableGender;
	}

	public String getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(String sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public String getHscPercentage() {
		return hscPercentage;
	}

	public void setHscPercentage(String hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	@Override
	public String toString() {
		return "Scheme [schemeId=" + schemeId + ", schemeName=" + schemeName + ", schemeDescription="
				+ schemeDescription + ", schemeAmount=" + schemeAmount + ", applicableGender=" + applicableGender
				+ ", sscPercentage=" + sscPercentage + ", hscPercentage=" + hscPercentage + "]";
	}

}