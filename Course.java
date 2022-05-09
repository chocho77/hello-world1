package task01helpers;

import java.util.ArrayList;
import java.util.List;


public class Course {
	
	private String name;
	private Lecturer lecturer;
	private ArrayList<Student> students = new ArrayList<>();
	private int courseDuration;
	
	public Course(String name, Lecturer lecturer, ArrayList listBashStudents, int courseDuration) {
		
		this.name = name;
		this.lecturer = lecturer;
		this.students = listBashStudents;
		this.courseDuration = courseDuration;
	}

	public String getName() {
		return name;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public int getCourseDuration() {
		return courseDuration;
	}
	
	
	
	
}
