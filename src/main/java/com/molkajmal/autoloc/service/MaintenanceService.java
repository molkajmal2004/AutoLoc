package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Maintenance;
import com.molkajmal.autoloc.repository.MaintenanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    final MaintenanceRepository maRepo;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) maRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maRepo.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return maRepo.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return maRepo.findById(idMaintenance).orElse(null);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        maRepo.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) maRepo.saveAll(maintenances);
    }
}