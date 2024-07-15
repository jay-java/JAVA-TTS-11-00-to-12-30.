package com.template.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.template.model.Reservation;
import com.template.repo.ReservationRepo;

@Component
public class ReservationService {

	@Autowired
	private ReservationRepo reservationRepo;
	
	public Optional<Reservation> getById(long id){
		return reservationRepo.findById(id);
	}
	
	public List<Reservation> getAllReservations(){
		return (List<Reservation>) reservationRepo.findAll();
	}
	
	public void deleteReservation(long id) {
		this.reservationRepo.deleteById(id);
	}
	
	public Reservation saveReservation(Reservation reservation) {
		return this.reservationRepo.save(reservation);
	}
}
