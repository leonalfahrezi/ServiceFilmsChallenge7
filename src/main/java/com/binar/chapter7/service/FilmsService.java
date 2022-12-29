package com.binar.chapter7.service;

import com.binar.chapter7.model.Films;
import com.binar.chapter7.model.Schedules;
import com.binar.chapter7.model.Seats;
import com.binar.chapter7.model.request.FilmsRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FilmsService {

    Films addFilm (Films films);

    void updateFilm (FilmsRequest filmsRequest);

    void deleteFilm (Integer filmCode);

    List<Films> getFilm();

    Schedules addSchedule (Schedules schedules);

    List<Schedules> getScheduleDate();

    Schedules getSchedulesFilms();

    List<Seats> getSeat();

    List<Seats> getStudio();

    void updateStatus (String seatNumber, String studioName, String statusUpdated);
}
