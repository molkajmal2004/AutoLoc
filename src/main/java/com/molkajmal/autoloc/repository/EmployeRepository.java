package com.molkajmal.autoloc.repository;

import com.molkajmal.autoloc.domain.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Long> {
}