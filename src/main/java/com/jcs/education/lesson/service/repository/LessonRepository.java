package com.jcs.education.lesson.service.repository;

import com.jcs.education.lesson.service.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity, Integer> {
    List<LessonEntity> findAllByCourseUnitId(Integer courseUnitId);
}
