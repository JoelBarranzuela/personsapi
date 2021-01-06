package com.everis.persons.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.everis.persons.app.entity.PersonResponse;

import io.reactivex.Single;


public interface IPersonResponseRepo extends JpaRepository<PersonResponse, Long> {
  
  @Query("SELECT p FROM persona_response p WHERE p.document_number= :documentNumber, nativeQuery=true")
  public Single<Optional<PersonResponse>> findByDocumentNumber (@Param("document_number") int documentNumber);

}
