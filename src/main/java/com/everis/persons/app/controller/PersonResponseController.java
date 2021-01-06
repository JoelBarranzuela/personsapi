package com.everis.persons.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.persons.app.entity.PersonResponse;
import com.everis.persons.app.service.PersonResponseServiceImpl;

import io.reactivex.Single;


@RestController
public class PersonResponseController {
     
    @Autowired
    PersonResponseServiceImpl service;
    
    @GetMapping("/persons")
    public ResponseEntity<Single<PersonResponse>> getDocumentNumber(@RequestParam(name = "documentNumber") int documentNumber){
        
        return  new ResponseEntity<>(service.getDocumentNumber(documentNumber), HttpStatus.ACCEPTED);
      
    }
  
}
