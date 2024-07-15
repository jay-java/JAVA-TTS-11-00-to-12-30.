package com.template.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.template.model.Reservation;

public interface ReservationRepo extends CrudRepository<Reservation, Long>{

}
