package com.campusedu.devexercise.repositories;

import com.campusedu.devexercise.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>, CourseRepositoryCustom{

    @Transactional
    @Modifying
    @Query(value = "SELECT * FROM course_details c WHERE c.course_code_prefix=?1", nativeQuery = true)
    public List<Course> findByCourse_Code_Prefix(String ccp);

    @Transactional
    @Modifying
    @Query(value = "SELECT * FROM course_details c WHERE c.course_code_number=?1", nativeQuery = true)
    public List<Course> findByCourse_Code_Number(Integer ccn);


    @Transactional
    @Modifying
    @Query(value = "SELECT * FROM course_details c WHERE c.course_code_number=?1 AND c.course_code_prefix=?2", nativeQuery = true)
    public List<Course> findByCourse_Code_Number_And_Course_code_prefix(Integer ccn, String ccp);




}
