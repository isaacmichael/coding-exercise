package com.campusedu.devexercise.entity;


import javax.persistence.*;

@Entity
@Table(name = "COURSES")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name="advising_requisite_code")
    private String advising_requisite_code;

    @Column(name="core_literature_requirement")
    private String core_literature_requirement;

    @Column(name="course_catalog_text")
    private String course_catalog_text;

    @Column(name="course_code")
    private int course_code;

    @Column(name="course_code_number")
    private int course_code_number;

    @Column(name="course_code_prefix")
    private String course_code_prefix;

    @Column(name="course_code_sanitized")
    private String course_code_sanitized;

    @Column(name="course_fees")
    private int course_fees;

    @Column(name="course_title")
    private String course_title;

    @Column(name="default_credit_hours")
    private String default_credit_hours;

    @Column(name="division_code")
    private String division_code;

    @Column(name="fee_type")
    private String fee_type;

    @Column(name="fixed_variable_credit")
    private int fixed_variable_credit;

    @Column(name="max_credit_hours")
    private int max_credit_hours;

    @Column(name="min_credit_hourse")
    private int min_credit_hourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdvising_requisite_code() {
        return advising_requisite_code;
    }

    public void setAdvising_requisite_code(String advising_requisite_code) {
        this.advising_requisite_code = advising_requisite_code;
    }

    public String getCore_literature_requirement() {
        return core_literature_requirement;
    }

    public void setCore_literature_requirement(String core_literature_requirement) {
        this.core_literature_requirement = core_literature_requirement;
    }

    public String getCourse_catalog_text() {
        return course_catalog_text;
    }

    public void setCourse_catalog_text(String course_catalog_text) {
        this.course_catalog_text = course_catalog_text;
    }

    public Integer getCourse_code() {
        return course_code;
    }

    public void setCourse_code(Integer course_code) {
        this.course_code = course_code;
    }

    public Integer getCourse_code_number() {
        return course_code_number;
    }

    public void setCourse_code_number(Integer course_code_number) {
        this.course_code_number = course_code_number;
    }

    public String getCourse_code_prefix() {
        return course_code_prefix;
    }

    public void setCourse_code_prefix(String course_code_prefix) {
        this.course_code_prefix = course_code_prefix;
    }

    public String getCourse_code_sanitized() {
        return course_code_sanitized;
    }

    public void setCourse_code_sanitized(String course_code_sanitized) {
        this.course_code_sanitized = course_code_sanitized;
    }

    public Integer getCourse_fees() {
        return course_fees;
    }

    public void setCourse_fees(Integer course_fees) {
        this.course_fees = course_fees;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getDefault_credit_hours() {
        return default_credit_hours;
    }

    public void setDefault_credit_hours(String default_credit_hours) {
        this.default_credit_hours = default_credit_hours;
    }

    public String getDivision_code() {
        return division_code;
    }

    public void setDivision_code(String division_code) {
        this.division_code = division_code;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public Integer getFixed_variable_credit() {
        return fixed_variable_credit;
    }

    public void setFixed_variable_credit(Integer fixed_variable_credit) {
        this.fixed_variable_credit = fixed_variable_credit;
    }

    public Integer getMax_credit_hours() {
        return max_credit_hours;
    }

    public void setMax_credit_hours(Integer max_credit_hours) {
        this.max_credit_hours = max_credit_hours;
    }

    public Integer getMin_credit_hourse() {
        return min_credit_hourse;
    }

    public void setMin_credit_hourse(Integer min_credit_hourse) {
        this.min_credit_hourse = min_credit_hourse;
    }
}