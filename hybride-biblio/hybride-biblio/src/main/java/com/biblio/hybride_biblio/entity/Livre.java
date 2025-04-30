package com.biblio.hybride_biblio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String auteur;
    private boolean disponible = true; // true si disponible
}
