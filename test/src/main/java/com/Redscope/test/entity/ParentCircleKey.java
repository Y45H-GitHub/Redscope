package com.Redscope.test.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

//import javax.persistence.Embeddable
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ParentCircleKey implements Serializable {

    private Long parentId;
    private Long circleId;

    // Default constructor
    public ParentCircleKey() {}

    // Parameterized constructor
    public ParentCircleKey(Long parentId, Long circleId) {
        this.parentId = parentId;
        this.circleId = circleId;
    }

    // Getters and Setters
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getCircleId() {
        return circleId;
    }

    public void setCircleId(Long circleId) {
        this.circleId = circleId;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentCircleKey that = (ParentCircleKey) o;
        return Objects.equals(parentId, that.parentId) &&
                Objects.equals(circleId, that.circleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, circleId);
    }
}

