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
    private int safeties;
    private int intFor;
    private int intAgainst;
    private int totalYards;
    
    protected Stats() {
    }
    
    public Stats(int games) {
        this.games = games;
    }
    
    public Stats(int games, int tdFor) {
        this.games = games;
        this.tdFor = tdFor;
    }
    
    public Stats(int games, int tdFor, int tdAgainst) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
    }
    
    public Stats(int games, int tdFor, int tdAgainst, int extraPoints) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
        this.extraPoints = extraPoints;
    }
    
    public Stats(int games, int tdFor, int tdAgainst, int extraPoints, int safeties) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
        this.extraPoints = extraPoints;
        this.safeties = safeties;
    }
    
    public Stats(int games, int tdFor, int tdAgainst, int extraPoints, int safeties, int intFor) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
        this.extraPoints = extraPoints;
        this.safeties = safeties;
        this.intFor = intFor;
    }
    
    public Stats(int games, int tdFor, int tdAgainst, int extraPoints, int safeties, int intFor, int intAgainst) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
        this.extraPoints = extraPoints;
        this.safeties = safeties;
        this.intFor = intFor;
        this.intAgainst = intAgainst;
    }
    
    public Stats(int games, int tdFor, int tdAgainst, int extraPoints, int safeties, int intFor, int intAgainst, int totalYards) {
        this.games = games;
        this.tdFor = tdFor;
        this.tdAgainst = tdAgainst;
        this.extraPoints = extraPoints;
        this.safeties = safeties;
        this.intFor = intFor;
        this.intAgainst = intAgainst;
        this.totalYards = totalYards;
    }
    
    public int getGames() {
        return games;
    }
    
    public int getTdFor() {
        return tdFor;
    }
    
    public int getTdAgainst() {
        return tdAgainst;
    }
    
    public int getExtraPoints() {
        return extraPoints;
    }
    
    public int getSafeties() {
        return safeties;
    }
    
    public int getIntFor() {
        return intFor;
    }
    
    public int getIntAgainst() {
        return intAgainst;
    }
    
    public int getTotalYards() {
        return totalYards;
    }
}
