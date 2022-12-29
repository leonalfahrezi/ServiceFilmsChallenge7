package com.binar.chapter7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "schedule_id")
    private Integer scheduleId;

    @Column(name = "film_code")
    private Integer filmCode;

    @Column(name = "playing_date")
    private String playingDate;

    @Column(name = "starting_time")
    private String startingTime;

    @Column(name = "ending_time")
    private String endingTime;

    @Column(name = "ticket_price")
    private Integer ticketPrice;

}
