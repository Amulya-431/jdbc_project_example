package com.exampleProject.DegreeCourses.dao;

import java.sql.SQLException;
import java.util.List;

import com.exampleProject.DegreeCourse.DegreeCourses;

public interface DegreeCoursesDao {
	public DegreeCourses insertCourse(DegreeCourses degreeCourse) throws SQLException,ClassNotFoundException;
	public List<DegreeCourses> displayCourses() throws SQLException,ClassNotFoundException;
    public boolean deleteCourse(int courseId) throws SQLException,ClassNotFoundException;


}
