package com.biblio.hybride_biblio.service;

import com.biblio.hybride_biblio.entity.Livre;
import com.biblio.hybride_biblio.repository.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {
    private final LivreRepository livreRepository;

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public Optional<Livre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }

    public List<Livre> getLivresDisponibles() {
        return livreRepository.findByDisponibleTrue();
    }

    public Livre ajouterLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre modifierLivre(Long id, Livre livreModifie) {
        return livreRepository.findById(id)
                .map(livre -> {
                    livre.setTitre(livreModifie.getTitre());
                    livre.setAuteur(livreModifie.getAuteur());
                    livre.setDisponible(livreModifie.isDisponible());
                    livreRepository.save(livre);
                    return livreRepository.save(livre);
                }).orElseThrow(() -> new RuntimeException("Livre non trouvé"));
    }

    public void supprimerLivre(Long id) {
        livreRepository.deleteById(id);
    }

    public void preterLivre(Long id) {
        livreRepository.findById(id).ifPresent(livre -> {
            livre.setDisponible(false);
            livreRepository.save(livre);
        });
    }

    public void retournerLivre(Long id) {
        livreRepository.findById(id).ifPresent(livre -> {
            livre.setDisponible(true);
            livreRepository.save(livre);
        });
    }
    
}
