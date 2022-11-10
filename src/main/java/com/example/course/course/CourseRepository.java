package com.example.course.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
//Spring Data JPA will automatically create an implementation of this interface
public interface CourseRepository extends CrudRepository<Course, String> {
    //there is a certain naming convention that Spring Data JPA will follow to create the query
    public List<Course> findByTopicId(String topicId);
    public List<Course> findByName(String name); //this is the naming convention (findBy{property})

}
