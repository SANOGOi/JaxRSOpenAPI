package fr.istic.taa.jaxrs.dao.generic.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Fiche;

public class FicheDAO extends AbstractJpaDao<Integer, Fiche> {
    public FicheDAO() {
        this.setClazz(Fiche.class);
    }
}