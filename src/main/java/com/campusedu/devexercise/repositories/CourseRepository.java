package com.campusedu.devexercise.repositories;

import com.campusedu.devexercise.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {


    List<Course> findByCourseCodePrefix(String ccp);

    List<Course> findByCourseCodeNumber(Integer ccn);

    List<Course> findByCourseCodeNumberAndCourseCodePrefix(Integer ccn, String ccp);


}
