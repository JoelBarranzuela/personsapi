package com.everis.persons.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "persona_response")
@Data
public class PersonResponse {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "document_number")
  private int documentNumber;
  @Column(name = "finger_print")
  private boolean fingerprint;
  @Column(name = "black_list")
  private boolean blacklist;
}
