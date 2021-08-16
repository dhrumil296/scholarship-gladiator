package com.scholly.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INSTITUTE")
public class Institute {

	@Id
	@Column(name = "INST_CODE")
	private Long instCode;

	@Column(name = "INST_NAME")
	private String instName;

	@Column(name = "INST_TYPE")
	private String instType;

	@Column(name = "board_NAME")
	private String boardName;

	@Column(name = "INST_PWD")
	private String instPwd;

	@Column(name = "PROOF_OF_EXISTENCE")
	private String proofOfExistence;

	@Column(name = "INST_STATE")
	private String instState;

	@Column(name = "INST_DISTRICT")
	private String instDistrict;

	@Column(name = "INST_ADDR")
	private String instAddr;

	@Column(name = "PHONE_NO")
	private String phoneNo;

	public Institute() {
		super();
	}

	public Institute(Long instCode, String instName, String instType, String boardName, String instPwd,
			String proofOfExistence, String instState, String instDistrict, String instAddr, String phoneNo) {
		super();
		this.instCode = instCode;
		this.instName = instName;
		this.instType = instType;
		this.boardName = boardName;
		this.instPwd = instPwd;
		this.proofOfExistence = proofOfExistence;
		this.instState = instState;
		this.instDistrict = instDistrict;
		this.instAddr = instAddr;
		this.phoneNo = phoneNo;
	}

	public Long getInstCode() {
		return instCode;
	}

	public void setInstCode(Long instCode) {
		this.instCode = instCode;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstType() {
		return instType;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getInstPwd() {
		return instPwd;
	}

	public void setInstPwd(String instPwd) {
		this.instPwd = instPwd;
	}

	public String getProofOfExistence() {
		return proofOfExistence;
	}

	public void setProofOfExistence(String proofOfExistence) {
		this.proofOfExistence = proofOfExistence;
	}

	public String getInstState() {
		return instState;
	}

	public void setInstState(String instState) {
		this.instState = instState;
	}

	public String getInstDistrict() {
		return instDistrict;
	}

	public void setInstDistrict(String instDistrict) {
		this.instDistrict = instDistrict;
	}

	public String getInstAddr() {
		return instAddr;
	}

	public void setInstAddr(String instAddr) {
		this.instAddr = instAddr;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Institute [instCode=" + instCode + ", instName=" + instName + ", instType=" + instType + ", boardName="
				+ boardName + ", instPwd=" + instPwd + ", proofOfExistence=" + proofOfExistence + ", instState="
				+ instState + ", instDistrict=" + instDistrict + ", instAddr=" + instAddr + ", phoneNo=" + phoneNo
				+ "]";
	}

}
