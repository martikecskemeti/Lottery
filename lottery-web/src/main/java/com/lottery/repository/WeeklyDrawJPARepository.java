package com.lottery.repository;

import com.lottery.model.WeeklyDraw;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface WeeklyDrawJPARepository extends JpaRepository<WeeklyDraw, Long> {

}
