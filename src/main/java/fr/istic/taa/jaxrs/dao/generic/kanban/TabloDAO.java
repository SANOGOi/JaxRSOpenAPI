package fr.istic.taa.jaxrs.dao.generic.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Kanban;

public class TabloDAO extends AbstractJpaDao<Integer, Kanban> {
    public TabloDAO() {
        this.setClazz(Kanban.class);
    }
}