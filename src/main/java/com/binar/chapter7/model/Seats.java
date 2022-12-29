package com.binar.chapter7.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seats {

    @EmbeddedId
    private SeatsId seatsId;

//    @Column(name = "seats_id")
//    private Integer seatsId;

    @Column(name = "seat_number")
    private String seatNumber;

    @Column(name = "studio_name")
    private String studioName;

    @Column(name = "status")
    private String status;

}
