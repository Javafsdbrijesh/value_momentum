package Basics1;

public class StudentsDetails implements Comparable<StudentsDetails>{
	private String name;
	private int age;
	private int marks;
	public StudentsDetails(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int compareTo(StudentsDetails o) {
		return this.marks - o.marks;
	}
	

}
