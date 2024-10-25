package com.Redscope.test.controller;

import com.Redscope.test.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parents")
public class ParentController {

    @Autowired
    private ParentService parentService;

    @PostMapping("/{parentId}/circles")
    public ResponseEntity<?> addParentToCircles(@PathVariable Long parentId) throws Exception {
        parentService.addParentToCircles(parentId);
        return ResponseEntity.ok("Parent added to circles successfully");
    }
}
