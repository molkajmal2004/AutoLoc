package com.molkajmal.autoloc.repository;

import com.molkajmal.autoloc.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {

}
