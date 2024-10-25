package com.Redscope.test.repo;

import com.Redscope.test.entity.School;
import com.Redscope.test.entity.Section;
import com.Redscope.test.entity.SocialCircle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SocialCircleRepository extends JpaRepository<SocialCircle, Long> {

    @Query("SELECT sc FROM SocialCircle sc WHERE sc.school = :school AND sc.schoolClass = :schoolClass AND sc.section = :section")
    Optional<SocialCircle> findCircleBySchoolAndClassAndSection(@Param("school") School school, @Param("schoolClass") Class schoolClass, @Param("section") Section section);

    default SocialCircle findOrCreateCircle(School school, Class schoolClass, Section section) {
        return findCircleBySchoolAndClassAndSection(school, schoolClass, section)
                .orElseGet(() -> save(new SocialCircle(school, schoolClass, section)));
    }


    SocialCircle findOrCreateCircle(School childSchool);

    SocialCircle findOrCreateCircle(School childSchool, com.Redscope.test.entity.Class childClass);
}

