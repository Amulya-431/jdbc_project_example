package com.exampleProject.DegreeCourses.controller;

import com.exampleProject.service.DegreeCoursesServiceImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exampleProject.DegreeCourse.DegreeCourses;
import com.exampleProject.service.DegreeCoursesService;

public class DegreeCoursesController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DegreeCoursesService service=new DegreeCoursesServiceImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.insert records");
        System.out.println("2.display table records");
        System.out.println("3.delete records");
        System.out.println("enter 0 to exit");
        int a=sc.nextInt();
        while(a>0)
        {
        	switch(a)
        	{
        	case 1:
        	System.out.println("Enter courseid ");
    		int cId = sc.nextInt();
    		System.out.println("Enter courseName");
    		String cName = sc.next();
    		System.out.println("Enter Course duration ");
    		int cDuration = sc.nextInt();
    		DegreeCourses course=new DegreeCourses(cId,cName,cDuration);
    		service.insertCourse(course);
    		break;
        	case 2:
        		List<DegreeCourses> degreeCourses= service.displayCourses();
        		degreeCourses.forEach(System.out::println);
        		break;
        	case 3:
        		System.out.println("enter courseid");
        		int courseid=sc.nextInt();
        		service.deleteCourse(courseid);
        		break;
        	default:System.out.println("invalid option");
        	 break;       		
        	}
        	 System.out.println("1.insert records");
             System.out.println("2.display table records");
             System.out.println("3.delete records");
             System.out.println("enter 0 to exit");
             a=sc.nextInt();
        }
	}

}
