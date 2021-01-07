package com.everis.persons.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.persons.app.entity.PersonResponse;




public interface IPersonResponseRepo extends JpaRepository<PersonResponse, Long> {
  
   PersonResponse findByDocumentNumber(String documentNumber);
  
;

}
