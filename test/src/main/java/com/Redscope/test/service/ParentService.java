package com.Redscope.test.service;

import com.Redscope.test.entity.Parent;
import com.Redscope.test.entity.ParentCircle;
import com.Redscope.test.entity.ParentCircleKey;
import com.Redscope.test.entity.SocialCircle;
import com.Redscope.test.repo.ParentCircleRepository;
import com.Redscope.test.repo.ParentRepository;
import com.Redscope.test.repo.SocialCircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

    @Autowired
    private SocialCircleRepository socialCircleRepository;

    @Autowired
    private ParentCircleRepository parentCircleRepository;

    public void addParentToCircles(Long parentId) throws Exception {
        Parent parent = parentRepository.findById(parentId).orElseThrow(() -> new Exception("Parent not found"));

        // Check if social circles already exist or need to be created.
        SocialCircle schoolCircle = socialCircleRepository.findOrCreateCircle(parent.getChildSchool());
        SocialCircle classCircle = socialCircleRepository.findOrCreateCircle(parent.getChildSchool(), parent.getChildClass());
        SocialCircle sectionCircle = socialCircleRepository.findOrCreateCircle(parent.getChildSchool(), parent.getChildClass().getClass(), parent.getChildSection());

        // Add the parent to the circles.
        parentCircleRepository.save(new ParentCircle(new ParentCircleKey(parentId, schoolCircle.getCircleId()), parent, schoolCircle));
        parentCircleRepository.save(new ParentCircle(new ParentCircleKey(parentId, classCircle.getCircleId()), parent, classCircle));
        parentCircleRepository.save(new ParentCircle(new ParentCircleKey(parentId, sectionCircle.getCircleId()), parent, sectionCircle));
    }
}
