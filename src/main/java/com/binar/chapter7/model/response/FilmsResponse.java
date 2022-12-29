package com.binar.chapter7.model.response;

import com.binar.chapter7.model.SeatsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmsResponse {

    private Integer filmCode;

    private String filmName;

    private boolean isPlaying;

    private Integer scheduleId;

    private String playingDate;

    private String startingTime;

    private String endingTime;

    private Integer ticketPrice;

    private SeatsId seatsId;

    private Integer seatNumber;

    private String studioName;

    private String status;

}
