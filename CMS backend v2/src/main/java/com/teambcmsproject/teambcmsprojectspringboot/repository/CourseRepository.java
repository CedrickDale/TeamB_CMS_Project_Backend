//january 13 2024
package com.teambcmsproject.teambcmsprojectspringboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.teambcmsproject.teambcmsprojectspringboot.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findAll();

    Optional<Course> findById(Long course_id);

 @Query("Select c FROM Course c WHERE c.instructor.instructor_id = :instructor_id")
    List<Course> findByInstructorId(@Param("instructor_id")Long instructor_id);
    
}
// january 13 2024