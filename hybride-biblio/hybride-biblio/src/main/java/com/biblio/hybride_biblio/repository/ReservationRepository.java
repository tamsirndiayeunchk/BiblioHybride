package com.biblio.hybride_biblio.repository;

import com.biblio.hybride_biblio.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
