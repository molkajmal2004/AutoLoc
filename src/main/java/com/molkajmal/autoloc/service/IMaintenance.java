package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.Maintenance;

import java.util.List;

public interface IMaintenance {
    List<Maintenance> retrieveAllMaintenances();
    Maintenance addMaintenance(Maintenance c);
    Maintenance updateMaintenance(Maintenance c);
    Maintenance retrieveMaintenance(Long idMaintenance);
    void removeMaintenance(Long idMaintenance);
    List<Maintenance> addMaintenances (List<Maintenance> Maintenances);
}
