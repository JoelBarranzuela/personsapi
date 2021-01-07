package com.everis.persons.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person_response")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("respuesta persona")
public class PersonResponse {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @ApiModelProperty(example = "1", position = 1)
  private Long id;
  
  @Column(name = "document_number")
  @ApiModelProperty(example = "10000000", position = 2)
  private String documentNumber;
  @Column(name = "finger_print")
  @ApiModelProperty(example = "true", position = 3)
  private boolean fingerprint;
  @Column(name = "black_list")
  @ApiModelProperty(example = "false", position = 4)
  private boolean blacklist;
}
