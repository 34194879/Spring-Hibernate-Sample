package id.ac.uad.tot.service;

import id.ac.uad.tot.domain.Trip;
import id.ac.uad.tot.domain.TripType;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Deny Prasetyo,S.T
 * Java(Script) Developer and Trainer
 * Co-Founder | 2ndStack Studio
 * jasoet87@gmail.com
 * <p/>
 * http://github.com/jasoet
 * http://bitbucket.com/jasoet
 * <p/>
 * [at]jasoet
 */

@Service
public class TripService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveTripType(TripType tripType) {
        entityManager.persist(tripType);
    }

    public List<TripType> findAllTripType() {
        return entityManager.createQuery("SELECT o FROM TripType o", TripType.class).getResultList();
    }

    public void saveTrip(Trip trip) {
        entityManager.persist(trip);
    }

    public List<Trip> findAllTrip() {
        return entityManager.createQuery("SELECT o FROM Trip o", Trip.class).getResultList();
    }

}