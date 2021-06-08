package com.example.CRUDSpringbootReactjs.models;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String email;

    // getter, setters, contructors
}
