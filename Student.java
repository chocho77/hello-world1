package task01helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person{
	private String name;
	private List<programinglanguages> listCourses = new ArrayList<>();
	private List<Double> listAverageSucces = new ArrayList<>();
	
	Map<programinglanguages,Double> studentMap = new HashMap<programinglanguages, Double>();
	public Student(String name, List<programinglanguages> listCourses, List<Double> listAverageSuccess) {
		super(name);
		this.name = name;
		this.listCourses = listCourses;
		this.listAverageSucces = listAverageSuccess;
		for(int i = 0; i < listCourses.size(); i++) {
		studentMap.put(this.listCourses.get(i), this.listAverageSucces.get(i));
		}
	}


	public List<programinglanguages> getListCourses() {
		return listCourses;
	}


	public void setListCourses(List<programinglanguages> listCourses) {
		this.listCourses = listCourses;
	}
	
	public void getInfo() {
		System.out.println(studentMap);
	}
	
	public String getName() {
		return name;
	}


}
