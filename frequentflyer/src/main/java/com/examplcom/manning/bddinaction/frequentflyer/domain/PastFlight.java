package com.examplcom.manning.bddinaction.frequentflyer.domain;

import java.time.Duration;
import java.time.LocalDate;

public class PastFlight {
    private String flightNumber;
    private LocalDate scheduledDate;
    private FlightStatus status;
    private Boolean wasDelayed;
    private Duration delayedBy;

    public PastFlight(String flightNumber, LocalDate scheduledDate, FlightStatus status, Boolean wasDelayed, Duration delayedBy) {
        this.flightNumber = flightNumber;
        this.scheduledDate = scheduledDate;
        this.status = status;
        this.wasDelayed = wasDelayed;
        this.delayedBy = delayedBy;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDate getScheduledDate() {
        return scheduledDate;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public Boolean getWasDelayed() {
        return wasDelayed;
    }

    public Duration getDelayedBy() {
        return delayedBy;
    }
}
