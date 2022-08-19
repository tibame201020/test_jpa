package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BaseMap{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mapId;
    private String mapName;

}
