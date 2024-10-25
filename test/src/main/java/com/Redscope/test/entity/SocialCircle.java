package com.Redscope.test.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "social_circles")
public class SocialCircle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long circleId;

    @Column(nullable = false)
    private String circleName;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class schoolClass;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToOne
    @JoinColumn(name = "society_id")
    private Society society;

    @ManyToOne
    @JoinColumn(name = "parent_circle_id")
    private SocialCircle parentCircle;  // For user-defined circles

    public Long getCircleId() {
        return circleId;
    }

    public void setCircleId(Long circleId) {
        this.circleId = circleId;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Class getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(Class schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Society getSociety() {
        return society;
    }

    public void setSociety(Society society) {
        this.society = society;
    }

    public SocialCircle getParentCircle() {
        return parentCircle;
    }

    public void setParentCircle(SocialCircle parentCircle) {
        this.parentCircle = parentCircle;
    }

    public SocialCircle(School school, java.lang.Class schoolClass, Section section) {
    }
}

