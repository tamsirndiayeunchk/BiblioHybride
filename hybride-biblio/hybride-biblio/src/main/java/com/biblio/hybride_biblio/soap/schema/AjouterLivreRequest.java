package com.biblio.hybride_biblio.soap.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AjouterLivreRequest", namespace = "http://biblio.hybride_biblio.com/soap")
@XmlAccessorType(XmlAccessType.FIELD)
public class AjouterLivreRequest {

    @XmlElement(namespace = "http://biblio.hybride_biblio.com/soap", required = true)
    private String titre;

    @XmlElement(namespace = "http://biblio.hybride_biblio.com/soap", required = true)
    private String auteur;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
