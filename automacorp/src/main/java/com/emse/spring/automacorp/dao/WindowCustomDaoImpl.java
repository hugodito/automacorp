package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.WindowEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;
/*
public class WindowCustomDaoImpl implements WindowCustomDao {

    @PersistenceContext
    private EntityManager em;

    public WindowEntity findWindowById(Long searchId) {
        Query query = em.createQuery("select c from WindowEntity c inner join c.site s where lover(s.id) equals :searchId",
                WindowEntity.class);
        query.setParameter("searchId", "%" + searchId + "%");
    }

}
*/