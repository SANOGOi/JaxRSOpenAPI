package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.dao.generic.kanban.FicheDAO;
import fr.istic.taa.jaxrs.domain.*;

/**
 * Classe de génération de la bd selon le modèle
 */
public class GenerateDB {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Insert one fiche to retrieve it via postman
         */

        FicheDAO ficheDAO = new FicheDAO();
        Fiche f = new Fiche();
        f.setLibelle("Fiche3");
        Section s1 = new Section();
        s1.setKanban(new Kanban());
        f.setSection(s1);
        //create user which will work on this fiche
        Utilisateur us1 = new Utilisateur();
        us1.setSpeudo("Oklin");
        us1.setPoste("Ing Dev");
        //add user to this card
        us1.addFiches(f);
        //saved all objects linked to c in db
        ficheDAO.save(f);
    }
}