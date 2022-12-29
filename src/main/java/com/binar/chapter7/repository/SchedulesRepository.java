package com.binar.chapter7.repository;

import com.binar.chapter7.model.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchedulesRepository extends JpaRepository<Schedules, Integer> {
    @Query(value = "select * from schedules", nativeQuery = true)
    List<Schedules> getSchedules();

    @Query(value = "select playing_date from schedules", nativeQuery = true)
    List<Schedules> getSchedulesDate();

    @Query(value = "select s.playing_date, s.starting_time, s.ending_time, f.film_name from schedules s, films f where s.film_code = f.film_code", nativeQuery = true)
    Schedules getSchedulesFilms();
}
