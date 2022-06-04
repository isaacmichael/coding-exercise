package com.campusedu.devexercise.controller;

import com.campusedu.devexercise.entity.Course;
import com.campusedu.devexercise.repositories.CourseRepository;

import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;



@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @GetMapping("/{ccp}")
    public List<Course> getCourseByCCP(@PathVariable String ccp) {
        Iterable<Course> course = courseRepository.findByCourse_Code_Prefix(ccp);
        return (List<Course>) course;
    }



        //return (List<Course>) course;




    @Autowired
    CourseRepository service;
    @PostMapping("/upload")
    public String uploadData(@RequestParam("file") MultipartFile file) throws Exception {
        List<Course> courseList = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        TsvParserSettings setting = new TsvParserSettings();
        setting.setHeaderExtractionEnabled(true);
        TsvParser parser = new TsvParser(setting);
        List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
        parseAllRecords.forEach(record -> {
            Course course = new Course();
            course.setAdvising_requisite_code(record.getString("advising_requisite_code"));
            course.setCore_literature_requirement(record.getString("core_literature_requirement"));
            course.setCourse_catalog_text(record.getString("course_catalog_text"));
            course.setCourse_code(record.getString("course_code"));
            course.setCourse_code_number(Integer.parseInt(record.getString("course_code_number")));
            course.setCourse_code_prefix(record.getString("course_code_prefix"));
            course.setCourse_code_sanitized(record.getString("course_code_sanitized"));
            course.setCourse_fees(Integer.parseInt(record.getString("course_fees")));
            course.setCourse_title(record.getString("course_title"));
            course.setDefault_credit_hours(record.getString("default_credit_hours"));
            course.setDivision_code(record.getString("division_code"));
            course.setFee_type(record.getString("fee_type"));
            course.setFixed_variable_credit(record.getString("fixed_variable_credit"));
            course.setMax_credit_hours(Integer.parseInt(record.getString("max_credit_hours")));
            course.setMin_credit_hourse(Integer.parseInt(record.getString("min_credit_hourse")));

            courseList.add(course);
        });
        service.saveAll(courseList);
        return "Upload Sucessful!";
    }



}

