package com.Redscope.test.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "parent_circles")
public class ParentCircle {
    @EmbeddedId
    private ParentCircleKey id;

    @ManyToOne
    @MapsId("parentId")
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @ManyToOne
    @MapsId("circleId")
    @JoinColumn(name = "circle_id")
    private SocialCircle circle;

    public ParentCircle(ParentCircleKey parentCircleKey, Parent parent, SocialCircle schoolCircle) {

    }

    public ParentCircleKey getId() {
        return id;
    }

    public void setId(ParentCircleKey id) {
        this.id = id;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public SocialCircle getCircle() {
        return circle;
    }

    public void setCircle(SocialCircle circle) {
        this.circle = circle;
    }
}

