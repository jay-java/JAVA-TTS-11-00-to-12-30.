package com.template.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reservation_id;
	private String purpose;
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name="account_id",nullable = false)
	private Account account;

	public long getReservation_id() {
		return reservation_id;
	}

	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", purpose=" + purpose + ", createdAt=" + createdAt
				+ ", account=" + account + "]";
	}
	

}
