package com.biblio.hybride_biblio.soap;

import com.biblio.hybride_biblio.entity.Livre;
import com.biblio.hybride_biblio.service.LivreService;
import com.biblio.hybride_biblio.soap.schema.AjouterLivreRequest;
import com.biblio.hybride_biblio.soap.schema.AjouterLivreResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LivreEndpoint {

    private static final String NAMESPACE_URI = "http://biblio.hybride_biblio.com/soap";

    private final LivreService livreService;

    public LivreEndpoint(LivreService livreService) {
        this.livreService = livreService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AjouterLivreRequest")
    @ResponsePayload
    public AjouterLivreResponse ajouterLivre(@RequestPayload AjouterLivreRequest request) {
        Livre livre = new Livre();
        livre.setTitre(request.getTitre());
        livre.setAuteur(request.getAuteur());
        livre.setDisponible(true);

        livreService.ajouterLivre(livre);

        AjouterLivreResponse response = new AjouterLivreResponse();
        response.setMessage("Livre ajouté avec succès !");
        return response;
    }

    
}
