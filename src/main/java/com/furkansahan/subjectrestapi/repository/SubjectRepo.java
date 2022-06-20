package com.furkansahan.subjectrestapi.repository;

import com.furkansahan.subjectrestapi.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepo extends JpaRepository <Subject,Long> {

}
