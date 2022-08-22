package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class ProMap extends BaseMap implements Serializable {
    private String proMapProp;

}
