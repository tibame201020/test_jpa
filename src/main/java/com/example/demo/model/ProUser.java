package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class ProUser extends BaseUser{
    private String proUserProp;

    @Override
    public ProMap getMap() {
        return (ProMap)super.getMap();
    }
}
