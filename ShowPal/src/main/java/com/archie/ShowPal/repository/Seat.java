package com.archie.ShowPal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Seat extends JpaRepository<Seat, Integer> {
}
