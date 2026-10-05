package com.molkajmal.autoloc.service;

import com.molkajmal.autoloc.domain.ModePaiement;

import java.util.List;

public interface IModePaiementService {
    List<ModePaiement> retrieveAllModePaiements();
    ModePaiement addModePaiement(ModePaiement c);
    ModePaiement updateModePaiement(ModePaiement c);
    ModePaiement retrieveModePaiement(Long idModePaiement);
    void removeModePaiement(Long idModePaiement);
    List<ModePaiement> addModePaiements (List<ModePaiement> ModePaiements);
}
