package org.molw.model;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@ApplicationScoped
public class BirdAnalysis {

    @Inject
    EntityManager em;

    @Transactional
    public String getNumberOfObservations(){
        Query query = em.createQuery("SELECT b.location FROM Birdobs b " );
        return query.getResultList().get(0).toString();
    }
}
