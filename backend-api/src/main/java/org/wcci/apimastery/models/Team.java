package org.wcci.apimastery.models;

import javax.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Conference conference;
    @OneToOne
    private Stats stats;

    public Team() {
    }

    public Team(Long id, String name, Conference conference, Stats stats) {
        this.conference = conference;
        this.name = name;
        this.stats = stats;
    }

    public Team(String name, Stats stats) {
        this.name = name;
        this.stats = stats;
    }

    public Team(String name, Conference conference) {
        this.name = name;
        this.conference = conference;
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(Stats stats) {
        this.stats = stats;
    }

    public Team(Conference conference) {
        this.conference = conference;
    }

    public String getName() {
        return name;
    }

    public Conference getConference() {
        return conference;
    }

    public Stats getStats() {
        return stats;
    }
}
