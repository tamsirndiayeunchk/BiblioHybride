package com.biblio.hybride_biblio.controller;

import com.biblio.hybride_biblio.entity.Reservation;
import com.biblio.hybride_biblio.service.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return reservationService.getReservationById(id)
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée"));
    }

    @PostMapping
    public Reservation reserverLivre(@RequestBody Reservation reservation) {
        return reservationService.creerReservation(reservation);
    }
}
