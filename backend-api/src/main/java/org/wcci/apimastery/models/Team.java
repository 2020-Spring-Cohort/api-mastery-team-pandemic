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
