package com.scholly.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FORM")
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_FORMID_SEQ")
	@SequenceGenerator(name = "HB_FORMID_SEQ", sequenceName = "FormId_Seq", allocationSize = 0)
	@Column(name = "FORM_ID")
	private int formId;

	@Column(name = "COMMUNITY")
	private String community;

	@Column(name = "GUARDIAN_NAME")
	private String guardianName;

	@Column(name = "FAMILY_INCOME")
	private double familyIncome;

	@Column(name = "IS_DISABLED")
	private String isDisabled;

	@Column(name = "DISABILITY_TYPE")
	private String disabilityType;

	@Column(name = "SSC_PERCENTAGE")
	private double sscPercentage;

	@Column(name = "HSC_PERCENTAGE")
	private double hscPercentage;

	@Column(name = "INST_NAME")
	private String instituteName;

	@Column(name = "CURRENT_COURSE")
	private String currentCourse;

	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "TOTAL_FEES")
	private Double totalFees;

	@Column(name = "STUD_ID")
	private Long aadharNo;

	@Column(name = "SCHEME_ID")
	private int schemeId;

	@Column(name = "BANK_PASSBOOK")
	private String bankPassbook;

	@Column(name = "SSC_MARKSHEET")
	private String sscMarksheet;

	@Column(name = "HSC_MARKSHEET")
	private String hscMarkSheet;

	@Column(name = "AADHAR_CARD")
	private String aadharCardProof;

	@Column(name = "STATE")
	private String state;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PIN_CODE")
	private int pinCode;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "FORM_SUBMISSION_YEAR")
	private String formSubmissionYear;

	@Column(name = "FORM_STATUS")
	private String formStatus;

	public Form() {
		super();
	}

	public Form(String community, String guardianName, double familyIncome, String isDisabled, String disabilityType,
			double sscPercentage, double hscPercentage, String instituteName, String currentCourse, String startDate,
			Double totalFees, Long aadharNo, int schemeId, String bankPassbook, String sscMarksheet,
			String hscMarkSheet, String aadharCardProof, String state, String district, String city, int pinCode,
			String address, String formSubmissionYear, String formStatus) {
		super();
		this.community = community;
		this.guardianName = guardianName;
		this.familyIncome = familyIncome;
		this.isDisabled = isDisabled;
		this.disabilityType = disabilityType;
		this.sscPercentage = sscPercentage;
		this.hscPercentage = hscPercentage;
		this.instituteName = instituteName;
		this.currentCourse = currentCourse;
		this.startDate = startDate;
		this.totalFees = totalFees;
		this.aadharNo = aadharNo;
		this.schemeId = schemeId;
		this.bankPassbook = bankPassbook;
		this.sscMarksheet = sscMarksheet;
		this.hscMarkSheet = hscMarkSheet;
		this.aadharCardProof = aadharCardProof;
		this.state = state;
		this.district = district;
		this.city = city;
		this.pinCode = pinCode;
		this.address = address;
		this.formSubmissionYear = formSubmissionYear;
		this.formStatus = formStatus;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getDisabilityType() {
		return disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}

	public double getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(double sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public double getHscPercentage() {
		return hscPercentage;
	}

	public void setHscPercentage(double hscPercentage) {
		this.hscPercentage = hscPercentage;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getCurrentCourse() {
		return currentCourse;
	}

	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	public String getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public String getSscMarksheet() {
		return sscMarksheet;
	}

	public void setSscMarksheet(String sscMarksheet) {
		this.sscMarksheet = sscMarksheet;
	}

	public String getHscMarkSheet() {
		return hscMarkSheet;
	}

	public void setHscMarkSheet(String hscMarkSheet) {
		this.hscMarkSheet = hscMarkSheet;
	}

	public String getAadharCardProof() {
		return aadharCardProof;
	}

	public void setAadharCardProof(String aadharCardProof) {
		this.aadharCardProof = aadharCardProof;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
	}

	public String getFormSubmissionYear() {
		return formSubmissionYear;
	}

	public void setFormSubmissionYear(String formSubmissionYear) {
		this.formSubmissionYear = formSubmissionYear;
	}

	@Override
	public String toString() {
		return "Form [formId=" + formId + ", community=" + community + ", guardianName=" + guardianName
				+ ", familyIncome=" + familyIncome + ", isDisabled=" + isDisabled + ", disabilityType=" + disabilityType
				+ ", sscPercentage=" + sscPercentage + ", hscPercentage=" + hscPercentage + ", instituteName="
				+ instituteName + ", currentCourse=" + currentCourse + ", startDate=" + startDate + ", totalFees="
				+ totalFees + ", aadharNo=" + aadharNo + ", schemeId=" + schemeId + ", bankPassbook=" + bankPassbook
				+ ", sscMarksheet=" + sscMarksheet + ", hscMarkSheet=" + hscMarkSheet + ", aadharCardProof="
				+ aadharCardProof + ", state=" + state + ", district=" + district + ", city=" + city + ", pinCode="
				+ pinCode + ", address=" + address + ", formSubmissionYear=" + formSubmissionYear + ", formStatus="
				+ formStatus + "]";
	}

}
