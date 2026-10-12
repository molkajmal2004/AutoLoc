package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Contrat;
import com.molkajmal.autoloc.repository.ContratRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratService implements IContratService {

    final ContratRepository coRepo;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) coRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return coRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return coRepo.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return coRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        coRepo.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {
        return (List<Contrat>) coRepo.saveAll(contrats);
    }
}