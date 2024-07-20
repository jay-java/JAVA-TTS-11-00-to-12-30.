package com.template.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int acc_id;
	private String nameString;
	private long contact;
	private String emailString;
	private String passwordString;
	
	@OneToMany(mappedBy = "account")
	private List<Reservation> reservationsList;

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public List<Reservation> getReservationsList() {
		return reservationsList;
	}

	public void setReservationsList(List<Reservation> reservationsList) {
		this.reservationsList = reservationsList;
	}

	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", nameString=" + nameString + ", contact=" + contact + ", emailString="
				+ emailString + ", passwordString=" + passwordString + ", reservationsList=" + reservationsList + "]";
	}
	
	
}
