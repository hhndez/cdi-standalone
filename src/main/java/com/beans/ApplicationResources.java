package com.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by hhernandez on 1/07/16.
 */
@ApplicationScoped
public class ApplicationResources {
/*
    @PersistenceContext(unitName = "jpa-example")
    private EntityManager em;
   */

    @Produces
    @Dependent
    public EntityManager createEntityManager() {
        return Persistence.createEntityManagerFactory("jpa-example").createEntityManager();
    }

    public void closeEM(@Disposes EntityManager manager) {
        manager.close();
    }

}
