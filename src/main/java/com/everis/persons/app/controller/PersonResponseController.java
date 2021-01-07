package com.everis.persons.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.persons.app.entity.PersonResponse;
import com.everis.persons.app.service.PersonResponseServiceImpl;

import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/core/persons")
@Api("/core/persons")
public class PersonResponseController {

  @Autowired
  PersonResponseServiceImpl service;

 
  @ApiOperation(value = "Se obtuvo informacion de la persona", response = PersonResponse.class)
  @ApiResponse(code = 200, message = "Operacion ok", response = PersonResponse.class)
  @GetMapping
  public Single<PersonResponse> findByDocumentNumber(@RequestParam(name = "documentNumber") String documentNumber) {
    return service.findByDocumentNumber(documentNumber);
  }

}
