package com.Redscope.test.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "grade_history")
public class GradeHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Class oldClass;

    @ManyToOne
    @JoinColumn(name = "new_class_id", nullable = false)
    private Class newClass;

    private LocalDateTime changeDate = LocalDateTime.now();

    public LocalDateTime getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
}

