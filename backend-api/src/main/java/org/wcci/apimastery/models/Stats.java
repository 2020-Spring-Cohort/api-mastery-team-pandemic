package org.wcci.apimastery.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stats {

    @Id
    @GeneratedValue
    private Long id;
    private int games;
    private int tdFor;
    private int tdAgainst;
    private int extraPoints;
    private int safetys;
    private int intFor;
    private int intAgainst;
    private int totalYards;
}
