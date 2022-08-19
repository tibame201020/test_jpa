package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class UserI {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mapId")
    BaseMap map;
}
