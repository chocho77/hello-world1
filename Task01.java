package task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import task01helpers.Course;
import task01helpers.Lecturer;
import task01helpers.Student;
import task01helpers.programinglanguages;

public class Task01 {
	
	     
	public static void main(String[] args) {
		// info student 1
		List<programinglanguages> listStudent1 = new ArrayList<>();
		listStudent1.add(programinglanguages.Bash);
		List<Double> listAverageSuccesStudent1  = new ArrayList<>();
		listAverageSuccesStudent1.add(3.50);
		// info student 2
		List<programinglanguages> listStudent2 = new ArrayList<>();
		listStudent2.add(programinglanguages.HamiltonCshell);
		List<Double> listAverageSuccesStudent2  = new ArrayList<>();
		listAverageSuccesStudent2.add(5.50);
		// info student 3
		List<programinglanguages> listStudent3 = new ArrayList<>();
		listStudent3.add(programinglanguages.Haskell);
		List<Double> listAverageSuccesStudent3  = new ArrayList<>();
		listAverageSuccesStudent3.add(4.50);
		// info student 4
		List<programinglanguages> listStudent4 = new ArrayList<>();
		listStudent4.add(programinglanguages.Bash);
		listStudent4.add(programinglanguages.HamiltonCshell);
		List<Double> listAverageSuccesStudent4  = new ArrayList<>();
		listAverageSuccesStudent4.add(5.50);
		listAverageSuccesStudent4.add(4.30);
		// info student 5
		List<programinglanguages> listStudent5 = new ArrayList<>();
		listStudent5.add(programinglanguages.Bash);
		listStudent5.add(programinglanguages.Haskell);
		List<Double> listAverageSuccesStudent5  = new ArrayList<>();
		listAverageSuccesStudent5.add(6.0);
		listAverageSuccesStudent5.add(5.30);
		// info student 6
		List<programinglanguages> listStudent6 = new ArrayList<>();
		listStudent6.add(programinglanguages.HamiltonCshell);
		listStudent6.add(programinglanguages.Haskell);
		List<Double> listAverageSuccesStudent6  = new ArrayList<>();
		listAverageSuccesStudent6.add(3.50);
		listAverageSuccesStudent6.add(4.30);
		// info student 7
		List<programinglanguages> listStudent7 = new ArrayList<>();
		listStudent7.add(programinglanguages.Bash);
		listStudent7.add(programinglanguages.HamiltonCshell);
		listStudent7.add(programinglanguages.Haskell);
		List<Double> listAverageSuccesStudent7  = new ArrayList<>();
		listAverageSuccesStudent7.add(5.50);
		listAverageSuccesStudent7.add(4.30);
		listAverageSuccesStudent7.add(3.60);
		
		Lecturer lecturer1 = new Lecturer("Petar", 500);
		Lecturer lecturer2 = new Lecturer("Stojan", 800);
		
		Student student1 = new Student("Petar",listStudent1,listAverageSuccesStudent1);
		Student student2 = new Student("Ivan",listStudent2,listAverageSuccesStudent2);
		Student student3 = new Student("Ivailo",listStudent3,listAverageSuccesStudent3);
		Student student4 = new Student("Kalojan",listStudent4,listAverageSuccesStudent4);
		Student student5 = new Student("Misho",listStudent5,listAverageSuccesStudent5);
		Student student6 = new Student("Stefan",listStudent6,listAverageSuccesStudent6);
		Student student7 = new Student("Kristo",listStudent7,listAverageSuccesStudent7);
		
		System.out.println("Student 1 Name: " + student1.getName() + "\nCourses : ");
		student1.getInfo();
		System.out.println();
		System.out.println("Student 2 Name: " + student2.getName() + "\nCourses : ");
		student2.getInfo();
		System.out.println();
		System.out.println("Student 3 Name: " + student3.getName() + "\nCourses : ");
		student3.getInfo();
		System.out.println();
		System.out.println("Student 4 Name: " + student4.getName() + "\nCourses : ");
		student4.getInfo();
		System.out.println();
		System.out.println("Student 5 Name: " + student5.getName() + "\nCourses : ");
		student5.getInfo();
		System.out.println();
		System.out.println("Student 6 Name: " + student6.getName() + "\nCourses : ");
		student6.getInfo();
		System.out.println();
		System.out.println("Student 7 Name: " + student7.getName() + "\nCourses : ");
		student7.getInfo();
		System.out.println("-------------------");
		ArrayList listBashStudents = new ArrayList<>();
		ArrayList listHaskellStudents = new ArrayList<>();
		ArrayList listHamiltonCshellStudents = new ArrayList<>();
		
		System.out.println();
		Student[] arrStudents = {student1,student2,student3,student4,student5,student6,student7};
		for(Student element:arrStudents) {
			if(element.getListCourses().contains(programinglanguages.Bash)) {
				listBashStudents.add(element);
			} else if(element.getListCourses().contains(programinglanguages.Haskell)) {
				listHaskellStudents.add(element);
			} else if(element.getListCourses().contains(programinglanguages.HamiltonCshell)) {
				listHamiltonCshellStudents.add(element);
			}
			
		}
		System.out.println("Programing Courses : ");
		Course bashCourse = new Course("Bash", lecturer1, listBashStudents, 6);
		System.out.println("Name : " + bashCourse.getName() + " Lecturer Name: " + bashCourse.getLecturer().getName() + " Duration : " + bashCourse.getCourseDuration());
		for(Student element: bashCourse.getStudents()) {
			System.out.println(element.getName());
		}
		System.out.println("------------------------------");
		Course haskellCourse = new Course("Haskell", lecturer1, listHaskellStudents, 8);
		System.out.println("Name : " + haskellCourse.getName() + " Lecturer Name: " + haskellCourse.getLecturer().getName() + " Duration : " + haskellCourse.getCourseDuration());
		for(Student element: haskellCourse.getStudents()) {
			System.out.println(element.getName());
		}
		System.out.println("------------------------------");
		Course HamiltonCshellCourse = new Course("HamiltonCshell", lecturer2, listHamiltonCshellStudents, 10);
		System.out.println("Name : " + HamiltonCshellCourse.getName() + " Lecturer Name: " + HamiltonCshellCourse.getLecturer().getName() + " Duration : " + HamiltonCshellCourse.getCourseDuration());
		for(Student element: HamiltonCshellCourse.getStudents()) {
			System.out.println(element.getName());
		}
		

	}

}
