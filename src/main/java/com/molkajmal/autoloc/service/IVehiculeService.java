package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule c);
    Vehicule updateVehicule(Vehicule c);
    Vehicule retrieveVehicule(Long idVehicule);
    void removeVehicule(Long idVehicule);
    List<Vehicule> addVehicules (List<Vehicule> Vehicules);
}
