package com.binar.chapter7.repository;

import com.binar.chapter7.model.Seats;
import com.binar.chapter7.model.SeatsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SeatsRepository extends JpaRepository<Seats, SeatsId> {

    @Query(value = "select seat_number from seats", nativeQuery = true)
    List<Seats> getSeat ();

    @Query(value = "select studio_name from seats", nativeQuery = true)
    List<Seats> getStudio();

    @Modifying
    @Query(value = "update seats set status where seat_number=:seat_number, studio_name=:studio_name, statusUpdated=:statusUpdated", nativeQuery = true)
    void updateStatus (@Param("seat_number") String seatNumber, @Param("studio_name") String studioName, @Param("statusUpdated") String statusUpdated);
}
