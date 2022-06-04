package com.campusedu.devexercise.repositories;
import com.campusedu.devexercise.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;



@Repository
@Transactional(readOnly = true)
public class CourseRepositoryImpl implements CourseRepositoryCustom {


    }



