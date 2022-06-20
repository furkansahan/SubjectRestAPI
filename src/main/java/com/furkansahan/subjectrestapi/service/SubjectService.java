package com.furkansahan.subjectrestapi.service;

import com.furkansahan.subjectrestapi.model.Subject;
import com.furkansahan.subjectrestapi.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepo subjectRepo;

    public   List<Subject> getAllSubjects(){
     List<Subject> subjects= new ArrayList<>();
     subjectRepo.findAll().forEach(subjects::add);
     return subjects;
  }


    public void addSubject(Subject subject) {
        subjectRepo.save(subject);

    }

    public void updateSubject(Long id, Subject subject) {
        subjectRepo.findById(id);
        subjectRepo.save(subject);
    }



    public void deleteSubject(Long id) {
        subjectRepo.deleteById(id);


    }

    public void deleteAllSubject() {
        subjectRepo.deleteAll();
    }
}
