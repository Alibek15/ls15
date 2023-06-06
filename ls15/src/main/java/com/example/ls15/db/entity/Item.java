package com.example.ls15.db.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

    private Long id; //getId(); Thymeleaf -> id;

    private String name; //getName(); Thymeleaf -> name;

    private Integer price;//getPrice(); Thymeleaf -> price;

}
