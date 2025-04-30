package com.biblio.hybride_biblio.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long livreId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
}
