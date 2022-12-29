package com.binar.chapter7.repository;

import com.binar.chapter7.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmsRepository extends JpaRepository<Films, Integer> {
    @Query(value = "select * from films", nativeQuery = true)
    List<Films> getFilmsByName();

    @Query(value = "select film_code from films", nativeQuery = true)
    Films getFilmsById(Integer filmCode);

    @Modifying
    @Query(value = "update films set films.film_name where films.film_name=:film_name", nativeQuery = true)
    Films updateFilmByName(@Param("film_name") String filmName);
}
