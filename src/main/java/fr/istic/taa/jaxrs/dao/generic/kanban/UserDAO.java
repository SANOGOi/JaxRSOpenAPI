package fr.istic.taa.jaxrs.dao.generic.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Utilisateur;

public class UserDAO extends AbstractJpaDao<Integer, Utilisateur> {
    public UserDAO() {
        this.setClazz(Utilisateur.class);
    }
}
