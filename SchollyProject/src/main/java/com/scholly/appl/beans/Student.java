package com.scholly.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@Column(name = "STUD_ID")
	private Long studId;

	@Column(name = "STUD_NAME")
	private String studName;

	@Column(name = "DOB")
	private String dob;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "MOB_NO")
	private String mobNo;

	@Column(name = "STUD_EMAIL_ID")
	private String studEmailId;

	@Column(name = "STUD_PWD")
	private String studPwd;

	@Column(name = "STATE_OF_DOMICILE")
	private String stateOfDomicile;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "BANK_ACC_NO")
	private String bankAccNo;

	@Column(name = "BANK_IFSC")
	private String bankIfsc;

	@Column(name = "INST_CODE")
	private Long instCode;

	public Student() {
		super();
	}

	public Student(Long studId, String studName, String dob, String gender, String mobNo, String studEmailId,
			String studPwd, String stateOfDomicile, String district, String bankAccNo, String bankIfsc, Long instCode) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.dob = dob;
		this.gender = gender;
		this.mobNo = mobNo;
		this.studEmailId = studEmailId;
		this.studPwd = studPwd;
		this.stateOfDomicile = stateOfDomicile;
		this.district = district;
		this.bankAccNo = bankAccNo;
		this.bankIfsc = bankIfsc;
		this.instCode = instCode;
	}

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getStudEmailId() {
		return studEmailId;
	}

	public void setStudEmailId(String studEmailId) {
		this.studEmailId = studEmailId;
	}

	public String getStudPwd() {
		return studPwd;
	}

	public void setStudPwd(String studPwd) {
		this.studPwd = studPwd;
	}

	public String getStateOfDomicile() {
		return stateOfDomicile;
	}

	public void setStateOfDomicile(String stateOfDomicile) {
		this.stateOfDomicile = stateOfDomicile;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBankAccNo() {
		return bankAccNo;
	}

	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public Long getInstCode() {
		return instCode;
	}

	public void setInstCode(Long instCode) {
		this.instCode = instCode;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", dob=" + dob + ", gender=" + gender
				+ ", mobNo=" + mobNo + ", studEmailId=" + studEmailId + ", studPwd=" + studPwd + ", stateOfDomicile="
				+ stateOfDomicile + ", district=" + district + ", bankAccNo=" + bankAccNo + ", bankIfsc=" + bankIfsc
				+ ", instCode=" + instCode + "]";
	}

}
