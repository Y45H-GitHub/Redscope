package com.Redscope.test.repo;

import com.Redscope.test.entity.ParentCircle;
import com.Redscope.test.entity.ParentCircleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParentCircleRepository extends JpaRepository<ParentCircle, ParentCircleKey> {

    // Custom query to find all circles that a parent is part of
    @Query("SELECT pc FROM ParentCircle pc WHERE pc.parent.parentId = :parentId")
    List<ParentCircle> findAllByParentId(@Param("parentId") Long parentId);

    // Optionally, you could also define a method to find all parents in a particular circle
    @Query("SELECT pc FROM ParentCircle pc WHERE pc.circle.circleId = :circleId")
    List<ParentCircle> findAllByCircleId(@Param("circleId") Long circleId);
}
