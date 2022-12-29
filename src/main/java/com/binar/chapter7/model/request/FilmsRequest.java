package com.binar.chapter7.model.request;

import com.binar.chapter7.model.SeatsId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmsRequest {

    @NonNull
    private Integer filmCode;

    @NonNull
    @Schema(example = "Jokowi")
    private String filmName;

    private boolean isPlaying;

    @NonNull
    private Integer scheduleId;

    @NonNull
    @Schema(example = "12 November 2022")
    private String playingDate;

    @NonNull
    @Schema(example = "15:00")
    private String startingTime;

    @NonNull
    @Schema(example = "20:00")
    private String endingTime;

    @NonNull
    @Schema(example = "30000")
    private Integer ticketPrice;

    @NonNull
    private SeatsId seatsId;

    @NonNull
    @Schema(example = "1")
    private Integer seatNumber;

    @NonNull
    @Schema(example = "A")
    private String studioName;

    private String status;

}
