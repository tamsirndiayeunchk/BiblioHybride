package com.biblio.hybride_biblio.controller;

import com.biblio.hybride_biblio.entity.Livre;
import com.biblio.hybride_biblio.service.LivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {
    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @GetMapping
    public List<Livre> getAllLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable Long id) {
        return livreService.getLivreById(id)
                .orElseThrow(() -> new RuntimeException("Livre non trouvé"));
    }

    @GetMapping("/disponibles")
    public List<Livre> getLivresDisponibles() {
        return livreService.getLivresDisponibles();
    }
}
