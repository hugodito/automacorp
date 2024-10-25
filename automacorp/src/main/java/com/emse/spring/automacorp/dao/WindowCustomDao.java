package com.emse.spring.automacorp.dao;

import com.emse.spring.automacorp.model.WindowEntity;

import java.util.List;

public interface WindowCustomDao {
    WindowEntity findWindowById(Long searchId);
}
