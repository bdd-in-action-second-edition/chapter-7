package com.examplcom.manning.bddinaction.frequentflyer.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class RecordedFlight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private FrequentFlyerMember member;

    private LocalDate date;
    private String departure;
    private String destinaton;
    @Enumerated(EnumType.ORDINAL)
    private CabinClass cabinClass;
    private int pointsEarned;

    public RecordedFlight() {
    }

    public RecordedFlight(LocalDate date, FrequentFlyerMember member, String departure, String destinaton, CabinClass cabinClass, int pointsEarned) {
        this.date = date;
        this.member = member;
        this.departure = departure;
        this.destinaton = destinaton;
        this.cabinClass = cabinClass;
        this.pointsEarned = pointsEarned;
    }

    public FrequentFlyerMember getMember() {
        return member;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestinaton() {
        return destinaton;
    }

    public CabinClass getCabinClass() {
        return cabinClass;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }
}
