package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Employe;
import com.molkajmal.autoloc.repository.EmployeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService implements IEmployeService {

    final EmployeRepository emRepo;

    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) emRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe e) {
        return emRepo.save(e);
    }

    @Override
    public Employe updateEmploye(Employe e) {
        return emRepo.save(e);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {
        return emRepo.findById(idEmploye).orElse(null);
    }

    @Override
    public void removeEmploye(Long idEmploye) {
        emRepo.deleteById(idEmploye);
    }

    @Override
    public List<Employe> addEmployes(List<Employe> employes) {
        return (List<Employe>) emRepo.saveAll(employes);
    }
}