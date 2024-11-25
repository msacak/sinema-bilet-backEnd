package com.ajwalker.repository;

import com.ajwalker.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat,Long> {

    List<Seat> findAllByOrderByLetterAscNoAsc();

}