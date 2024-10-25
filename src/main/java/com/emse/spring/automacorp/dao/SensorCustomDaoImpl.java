package com.emse.spring.automacorp.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.emse.spring.automacorp.model.SensorEntity;

import java.util.List;


@Repository
public class SensorCustomDaoImpl implements SensorCustomDao {

    @PersistenceContext
    private EntityManager em;

    public List<SensorEntity> findBySiteText(String searchText) {
        return em.createQuery("select c from SensorEntity c inner join c.site s where lover(s.name) like :searchText",
                        SensorEntity.class)
                .setParameter("searchText", "%" + searchText.toLowerCase() + "%")
                .getResultList();
    }

}
