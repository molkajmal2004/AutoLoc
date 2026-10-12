package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Equipement;
import com.molkajmal.autoloc.repository.EquipementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService implements IEquipementService {

    final EquipementRepository eqRepo;

    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) eqRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement e) {
        return eqRepo.save(e);
    }

    @Override
    public Equipement updateEquipement(Equipement e) {
        return eqRepo.save(e);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {
        return eqRepo.findById(idEquipement).orElse(null);
    }

    @Override
    public void removeEquipement(Long idEquipement) {
        eqRepo.deleteById(idEquipement);
    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> equipements) {
        return (List<Equipement>) eqRepo.saveAll(equipements);
    }
}