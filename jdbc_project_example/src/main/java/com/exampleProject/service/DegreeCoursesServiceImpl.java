package com.exampleProject.service;

import java.sql.SQLException;
import java.util.List;

import com.exampleProject.DegreeCourse.DegreeCourses;
import com.exampleProject.DegreeCourses.dao.DegreeCoursesDao;
import com.exampleProject.DegreeCourses.dao.DegreeCoursesDaoImpl;

public class DegreeCoursesServiceImpl implements DegreeCoursesService{

	DegreeCoursesDao dao;
	public DegreeCoursesServiceImpl()
	{
		dao=new DegreeCoursesDaoImpl();
	}
	
	
	@Override
	public DegreeCourses insertCourse(DegreeCourses degreeCourse) throws SQLException, ClassNotFoundException {
		
		return dao.insertCourse(degreeCourse);
	}

	@Override
	public List<DegreeCourses> displayCourses() throws SQLException, ClassNotFoundException {
		
		return dao.displayCourses();
	}

	@Override
	public boolean deleteCourse(int courseId) throws SQLException, ClassNotFoundException {
		return dao.deleteCourse(courseId);
	}

}
