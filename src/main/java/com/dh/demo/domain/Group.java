package com.dh.demo.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 6/17/2017.
 */
@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String logo;
    private String creation_date;
    @OneToMany
    private User owner;



}
