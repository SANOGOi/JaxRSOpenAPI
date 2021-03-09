package fr.istic.taa.jaxrs.dao.generic.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Section;

public class SectionDAO extends AbstractJpaDao<Integer, Section> {
    public SectionDAO(){
        this.setClazz(Section.class);
    }
}
