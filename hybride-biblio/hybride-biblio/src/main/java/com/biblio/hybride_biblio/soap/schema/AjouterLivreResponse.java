package com.biblio.hybride_biblio.soap.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AjouterLivreResponse", namespace = "http://biblio.hybride_biblio.com/soap")
@XmlAccessorType(XmlAccessType.FIELD)
public class AjouterLivreResponse {

    @XmlElement(namespace = "http://biblio.hybride_biblio.com/soap", required = true)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
