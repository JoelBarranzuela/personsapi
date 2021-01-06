package com.everis.persons.app.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.persons.app.entity.PersonResponse;
import com.everis.persons.app.repository.IPersonResponseRepo;

import io.reactivex.Single;

@Service
public class PersonResponseServiceImpl implements IPersonResponseService {
  
  @Autowired
  IPersonResponseRepo repo;
  
  @Override
  public Single<PersonResponse> getDocumentNumber(int documentNumber) {
        
      return repo.findByDocumentNumber(documentNumber).map(r->r.filter(q->q.getDocumentNumber()==documentNumber).get());
       
                
  }

}