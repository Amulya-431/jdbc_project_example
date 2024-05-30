package com.exampleProject.DegreeCourses.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exampleProject.DegreeCourse.DegreeCourses;
import com.exampleProject.DegreeCourses.utilities.DbConnections;

public class DegreeCoursesDaoImpl implements DegreeCoursesDao
{

	@Override
	public DegreeCourses insertCourse(DegreeCourses degreeCourse) throws SQLException, ClassNotFoundException {
		Connection con = DbConnections.getDbConnection();
		String query = "insert into degreecourses values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, degreeCourse.getCourseId());
		pst.setString(2, degreeCourse.getCourseName());
		pst.setInt(3, degreeCourse.getCourseDuration());

		int k = pst.executeUpdate();
		System.out.println("inserted record successfully");
		return degreeCourse;

	}

	@Override
	public List<DegreeCourses> displayCourses() throws SQLException, ClassNotFoundException {
		List<DegreeCourses> degreeCoursesList= new ArrayList<>();
		Connection con = DbConnections.getDbConnection();
		Statement st = con.createStatement();

		String query = "select * from degreecourses";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) 
		{			
			DegreeCourses degreeCourse=new DegreeCourses(rs.getInt(1), rs.getString(2),rs.getInt(3));
			degreeCoursesList.add(degreeCourse);			
		}

		rs.close();
		st.close();
		con.close();
		System.out.println("deleted record successfully");
		return degreeCoursesList;
	}


	@Override
	public boolean deleteCourse(int courseId) throws SQLException, ClassNotFoundException {
	
		Connection con = DbConnections.getDbConnection();
		// 3. Create the PreparedStatement Object
		String query = "delete from degreecourses where courseId=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, courseId);

		// 6. Execute the query
		int k = pst.executeUpdate();
		if(k==0)
			return false;
		else
			return true;
	}

}
