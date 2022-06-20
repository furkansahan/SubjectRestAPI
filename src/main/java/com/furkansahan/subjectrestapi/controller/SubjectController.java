package com.furkansahan.subjectrestapi.controller;

import com.furkansahan.subjectrestapi.model.Subject;
import com.furkansahan.subjectrestapi.repository.SubjectRepo;
import com.furkansahan.subjectrestapi.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllsubjects() {

        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/subjects")
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/subjects/{id}")
    public void updateSubject(@PathVariable Long id, @RequestBody Subject subject) {
        subjectService.updateSubject(id, subject);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
    public void deleteSubject(@PathVariable Long id, Subject subject) {
        subjectService.deleteSubject(id);


    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/subjects")
    public void deleteAllSubject() {

        subjectService.deleteAllSubject();

    }
}





