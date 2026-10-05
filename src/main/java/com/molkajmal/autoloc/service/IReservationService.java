package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation c);
    Reservation updateReservation(Reservation c);
    Reservation retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
    List<Reservation> addReservations (List<Reservation> Reservations);
}
