package com.biblio.hybride_biblio.soap.schema;

import com.biblio.hybride_biblio.entity.Livre;

public class ModifierLivreRequest {
    private Long livreID;
    private Livre livre;

    public Long getLivreID() {
        return livreID;
    }

    public void setLivreID(Long livreID) {
        this.livreID = livreID;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}
