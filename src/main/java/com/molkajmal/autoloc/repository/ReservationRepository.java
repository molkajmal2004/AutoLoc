package com.molkajmal.autoloc.repository;

import com.molkajmal.autoloc.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}