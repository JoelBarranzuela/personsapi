package com.everis.persons.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.persons.app.config.NotFoundException;
import com.everis.persons.app.entity.PersonResponse;
import com.everis.persons.app.repository.IPersonResponseRepo;

import io.reactivex.Single;

@Service
public class PersonResponseServiceImpl implements IPersonResponseService {

  @Autowired
  IPersonResponseRepo repo;

  @Override
  public Single<PersonResponse> findByDocumentNumber(String documentNumber) {
    PersonResponse dni = repo.findByDocumentNumber(documentNumber);
    if (dni.isBlacklist())
      throw new NotFoundException("DNI INVALIDO Y/O BLOQUEADO : " + documentNumber);
    return Single.just(dni);
  }

}
