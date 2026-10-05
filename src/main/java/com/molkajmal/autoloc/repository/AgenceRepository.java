package com.molkajmal.autoloc.repository;

import com.molkajmal.autoloc.domain.Agence;
import com.molkajmal.autoloc.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface AgenceRepository extends CrudRepository<Agence,Long> {
}
