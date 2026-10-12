package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Agence;
import com.molkajmal.autoloc.repository.AgenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceService implements IAgenceService {

    final AgenceRepository agRepo;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) agRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return agRepo.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return agRepo.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        agRepo.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> agences) {
        return (List<Agence>) agRepo.saveAll(agences);
    }
}