package com.emse.spring.automacorp.dao ;

import com.emse.spring.automacorp.model.SensorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SensorDao extends JpaRepository<SensorEntity, Long>, SensorCustomDao {

    @Modifying // (3)
    @Query("delete from SensorEntity c where c.name = ?1")
    void deleteByName(String name);

}