package com.exampleProject.DegreeCourse;

public class DegreeCourses 
{
	private Integer courseId;
	private String courseName;
	private Integer courseDuration;
	DegreeCourses()
	{
		
	}
	public DegreeCourses(Integer courseId, String courseName, Integer courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "DegreeCourses [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + "]";
	}
	

}
