package com.scholly.appl.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INSTITUTE")
public class Institute {

	@Id
	private Long inst_code;

	private String inst_name;

	private String inst_type;

	private String board_name;

	private String inst_pwd;

	private String proof_of_existence;

	private String inst_state;

	private String inst_district;

	private String inst_addr;

	private String phone_no;

	public Institute() {
		super();
	}

	public Institute(Long inst_code, String inst_name, String inst_type, String board_name, String inst_pwd,
			String proof_of_existence, String inst_state, String inst_district, String inst_addr, String phone_no) {
		super();
		this.inst_code = inst_code;
		this.inst_name = inst_name;
		this.inst_type = inst_type;
		this.board_name = board_name;
		this.inst_pwd = inst_pwd;
		this.proof_of_existence = proof_of_existence;
		this.inst_state = inst_state;
		this.inst_district = inst_district;
		this.inst_addr = inst_addr;
		this.phone_no = phone_no;
	}

	public Long getInst_code() {
		return inst_code;
	}

	public void setInst_code(Long inst_code) {
		this.inst_code = inst_code;
	}

	public String getInst_name() {
		return inst_name;
	}

	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}

	public String getInst_type() {
		return inst_type;
	}

	public void setInst_type(String inst_type) {
		this.inst_type = inst_type;
	}

	public String getBoard_name() {
		return board_name;
	}

	public void setBoard_name(String board_name) {
		this.board_name = board_name;
	}

	public String getInst_pwd() {
		return inst_pwd;
	}

	public void setInst_pwd(String inst_pwd) {
		this.inst_pwd = inst_pwd;
	}

	public String getProof_of_existence() {
		return proof_of_existence;
	}

	public void setProof_of_existence(String proof_of_existence) {
		this.proof_of_existence = proof_of_existence;
	}

	public String getInst_state() {
		return inst_state;
	}

	public void setInst_state(String inst_state) {
		this.inst_state = inst_state;
	}

	public String getInst_district() {
		return inst_district;
	}

	public void setInst_district(String inst_district) {
		this.inst_district = inst_district;
	}

	public String getInst_addr() {
		return inst_addr;
	}

	public void setInst_addr(String inst_addr) {
		this.inst_addr = inst_addr;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	@Override
	public String toString() {
		return "Institute [inst_code=" + inst_code + ", inst_name=" + inst_name + ", inst_type=" + inst_type
				+ ", board_name=" + board_name + ", inst_pwd=" + inst_pwd + ", proof_of_existence=" + proof_of_existence
				+ ", inst_state=" + inst_state + ", inst_district=" + inst_district + ", inst_addr=" + inst_addr
				+ ", phone_no=" + phone_no + "]";
	}

}
