package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Vehicule;
import com.molkajmal.autoloc.repository.VehiculeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeService implements IVehiculeService {

    final VehiculeRepository veRepo;

    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) veRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return veRepo.save(v);
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return veRepo.save(v);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {
        return veRepo.findById(idVehicule).orElse(null);
    }

    @Override
    public void removeVehicule(Long idVehicule) {
        veRepo.deleteById(idVehicule);
    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> vehicules) {
        return (List<Vehicule>) veRepo.saveAll(vehicules);
    }
}