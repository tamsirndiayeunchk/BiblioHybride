package com.biblio.hybride_biblio.repository;

import com.biblio.hybride_biblio.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByDisponibleTrue();
}
