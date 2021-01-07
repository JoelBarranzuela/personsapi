package com.everis.persons.app.service;


import com.everis.persons.app.entity.PersonResponse;

import io.reactivex.Single;

public interface IPersonResponseService {
    Single<PersonResponse> findByDocumentNumber(String documentNumber);
}
