package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class ProUser extends BaseUser implements Serializable {
    private String proUserProp;

    @Override
    public ProMap getMap() {
        return (ProMap)super.getMap();
    }
}
