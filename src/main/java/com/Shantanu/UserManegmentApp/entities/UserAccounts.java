package com.Shantanu.UserManegmentApp.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "USER_ACCOUNTS")
public class UserAccounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID" )
	private Integer user_id;
	@Column(name = "USER_FIRSTNAME" )
	private String fname;
	@Column(name = "USER_LASTNAME" )
	private String lname;
	@Column(name ="USER_EMAILID", unique = true)
	private String email;
	@Column(name = "USER_PASSWORD")
	private String password;
	@Column(name ="USER_DOB")
	private String dob;
	@Column(name ="USER_NUMBER" )
	private long num;
	@Column(name ="USER_GENDAR" )
	private String gendar;
	@Column(name ="USER_CITYID" )
	private Integer city_id;
	@Column(name ="USER_STATEID" )
	private Integer state_id;
	@Column(name ="USER_COUNTRYID" )
	private Integer country_id;
	@Column(name = "ACCOUNTSTATUS")
	private String accStatus;
	@Column(name ="CREATE_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdate;
	@Column(name ="UPDATE_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public Integer getCity_id() {
		return city_id;
	}
	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public Integer getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}
	public String getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	public LocalDate getCreatedate() {
		return createdate;
	}
	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}
	public LocalDate getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "UserAccounts [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", num=" + num + ", gendar=" + gendar + ", city_id="
				+ city_id + ", state_id=" + state_id + ", country_id=" + country_id + ", accStatus=" + accStatus
				+ ", createdate=" + createdate + ", updatedate=" + updatedate + "]";
	}
	
	
	

}
