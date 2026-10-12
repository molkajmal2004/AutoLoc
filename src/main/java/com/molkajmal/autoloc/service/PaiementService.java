package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Paiement;
import com.molkajmal.autoloc.repository.PaiementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementService implements IPaiementService {

    final PaiementRepository paRepo;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) paRepo.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return paRepo.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return paRepo.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return paRepo.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        paRepo.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return (List<Paiement>) paRepo.saveAll(paiements);
    }
}