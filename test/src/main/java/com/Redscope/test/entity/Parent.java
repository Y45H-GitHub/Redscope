package com.Redscope.test.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "parents")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parentId;

    @Column(nullable = false)
    private String parentName;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School childSchool;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Class childClass;

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section childSection;

    @ManyToOne
    @JoinColumn(name = "society_id")
    private Society society;  // Optional

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public School getChildSchool() {
        return childSchool;
    }

    public void setChildSchool(School childSchool) {
        this.childSchool = childSchool;
    }

    public Class getChildClass() {
        return childClass;
    }

    public void setChildClass(Class childClass) {
        this.childClass = childClass;
    }

    public Section getChildSection() {
        return childSection;
    }

    public void setChildSection(Section childSection) {
        this.childSection = childSection;
    }

    public Society getSociety() {
        return society;
    }

    public void setSociety(Society society) {
        this.society = society;
    }
}


