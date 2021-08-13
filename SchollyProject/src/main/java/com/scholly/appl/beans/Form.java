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

	@Column(name = "RELIGION")
	private String religion;

	@Column(name = "COMMUNITY")
	private String community;

	@Column(name = "FATHER_NAME")
	private String fatherName;

	@Column(name = "MOTHER_NAME")
	private String motherName;

	@Column(name = "FAMILY_INCOME")
	private double familyIncome;

	@Column(name = "IS_DISABILITY")
	private String isDisability;

	@Column(name = "DISABILITY_TYPE")
	private String disabilityType;

	@Column(name = "PARENT_PROFESSION")
	private String parentProfession;

	@Column(name = "SSC_YEAR")
	private int sscPassingYear;

	@Column(name = "SSC_PERCENTAGE")
	private double sscPercentage;

	@Column(name = "HSC_YEAR")
	private int hscPassingYear;

	@Column(name = "HSC_PERCENTAGE")
	private double hscPercentage;

	@Column(name = "INSTITUTE_NAME")
	private String instituteName;

	@Column(name = "CURRENT_COURSE")
	private String currentCourse;

	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "UNIVERSITY_NAME")
	private String universityName;

	@Column(name = "TOTAL_FEES")
	private Double totalFees;

	@Column(name = "STUD_ID")
	private Long aadhar_no;

	@Column(name = "SCHEME_ID")
	private int schemeId;

	public Form() {
		super();
	}

	public Form(int formId, String religion, String community, String fatherName, String motherName,
			double familyIncome, String isDisability, String disabilityType, String parentProfession,
			int sscPassingYear, double sscPercentage, int hscPassingYear, double hscPercentage, String instituteName,
			String currentCourse, String startDate, String universityName, Double totalFees, Long aadhar_no,
			int schemeId) {
		super();
		this.formId = formId;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.familyIncome = familyIncome;
		this.isDisability = isDisability;
		this.disabilityType = disabilityType;
		this.parentProfession = parentProfession;
		this.sscPassingYear = sscPassingYear;
		this.sscPercentage = sscPercentage;
		this.hscPassingYear = hscPassingYear;
		this.hscPercentage = hscPercentage;
		this.instituteName = instituteName;
		this.currentCourse = currentCourse;
		this.startDate = startDate;
		this.universityName = universityName;
		this.totalFees = totalFees;
		this.aadhar_no = aadhar_no;
		this.schemeId = schemeId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public double getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getIsDisability() {
		return isDisability;
	}

	public void setIsDisability(String isDisability) {
		this.isDisability = isDisability;
	}

	public String getDisabilityType() {
		return disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}

	public String getParentProfession() {
		return parentProfession;
	}

	public void setParentProfession(String parentProfession) {
		this.parentProfession = parentProfession;
	}

	public int getSscPassingYear() {
		return sscPassingYear;
	}

	public void setSscPassingYear(int sscPassingYear) {
		this.sscPassingYear = sscPassingYear;
	}

	public double getSscPercentage() {
		return sscPercentage;
	}

	public void setSscPercentage(double sscPercentage) {
		this.sscPercentage = sscPercentage;
	}

	public int getHscPassingYear() {
		return hscPassingYear;
	}

	public void setHscPassingYear(int hscPassingYear) {
		this.hscPassingYear = hscPassingYear;
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

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(Double totalFees) {
		this.totalFees = totalFees;
	}

	public Long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(Long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public int getSchemeId() {
		return schemeId;
	}

	public void setSchemeId(int schemeId) {
		this.schemeId = schemeId;
	}

	@Override
	public String toString() {
		return "Form [formId=" + formId + ", religion=" + religion + ", community=" + community + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", familyIncome=" + familyIncome + ", isDisability="
				+ isDisability + ", disabilityType=" + disabilityType + ", parentProfession=" + parentProfession
				+ ", sscPassingYear=" + sscPassingYear + ", sscPercentage=" + sscPercentage + ", hscPassingYear="
				+ hscPassingYear + ", hscPercentage=" + hscPercentage + ", instituteName=" + instituteName
				+ ", currentCourse=" + currentCourse + ", startDate=" + startDate + ", universityName=" + universityName
				+ ", totalFees=" + totalFees + ", aadhar_no=" + aadhar_no + ", schemeId=" + schemeId + "]";
	}

}
