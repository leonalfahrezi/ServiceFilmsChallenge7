package com.binar.chapter7.service;

import com.binar.chapter7.model.Films;
import com.binar.chapter7.model.Schedules;
import com.binar.chapter7.model.Seats;
import com.binar.chapter7.model.request.FilmsRequest;
import com.binar.chapter7.repository.FilmsRepository;
import com.binar.chapter7.repository.SchedulesRepository;
import com.binar.chapter7.repository.SeatsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {
    private static final Logger logger = LoggerFactory.getLogger(FilmsServiceImpl.class);

    @Autowired
    FilmsRepository filmsRepository;
    @Autowired
    SchedulesRepository schedulesRepository;
    @Autowired
    SeatsRepository seatsRepository;

    @Override
    public Films addFilm(Films films) {
        return filmsRepository.save(films);
    }

    @Override
    public void updateFilm(FilmsRequest filmsRequest) {
        Films filmExist = filmsRepository.getFilmsById(filmsRequest.getFilmCode());
        Films update = new Films();
        if (filmExist == null) {
            logger.info("Film not registered yet, please try again");
        } else
            update.setFilmName(filmsRequest.getFilmName());
            filmsRepository.updateFilmByName(update.getFilmName());
    }

    @Override
    public void deleteFilm(Integer filmCode) {
        filmsRepository.deleteById(filmCode);
    }

    @Override
    public List<Films> getFilm() {
        return filmsRepository.getFilmsByName();
    }


    @Override
    public Schedules addSchedule(Schedules schedules) {
        return schedulesRepository.save(schedules);
    }

    @Override
    public List<Schedules> getScheduleDate() {
        return schedulesRepository.getSchedulesDate();
    }

    @Override
    public Schedules getSchedulesFilms() {
        return schedulesRepository.getSchedulesFilms();
    }

    @Override
    public List<Seats> getSeat() {
        return seatsRepository.getSeat();
    }

    @Override
    public List<Seats> getStudio() {
        return seatsRepository.getStudio();
    }

    @Override
    public void updateStatus(String seatNumber, String studioName, String statusUpdated) {
        seatsRepository.updateStatus(seatNumber, studioName, statusUpdated);
    }
}
