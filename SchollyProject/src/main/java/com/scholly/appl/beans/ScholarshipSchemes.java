package com.scholly.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEME")
public class ScholarshipSchemes {

	@Id
	@Column(name = "SCHEME_ID")
	private int schemeId;

	@Column(name = "SCHEME_NAME")
	private String schemeName;

	@Column(name = "SCHEME_DESC")
	private String schemeDescription;

	@Column(name = "SCHEME_AMOUNT")
	private int schemeAmount;

	public ScholarshipSchemes() {
		super();
	}

	public ScholarshipSchemes(int schemeId, String schemeName, String schemeDescription, int schemeAmount) {
		super();
		this.schemeId = schemeId;
		this.schemeName = schemeName;
		this.schemeDescription = schemeDescription;
		this.schemeAmount = schemeAmount;
	}

	public String getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(String schemeDescription) {
		this.schemeDescription = schemeDescription;
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

	public double getSchemeAmount() {
		return schemeAmount;
	}

	public void setSchemeAmount(int schemeAmount) {
		this.schemeAmount = schemeAmount;
	}

	@Override
	public String toString() {
		return "ScholarshipSchemes [schemeId=" + schemeId + ", schemeName=" + schemeName + ", schemeAmount="
				+ schemeAmount + "]";
	}

}