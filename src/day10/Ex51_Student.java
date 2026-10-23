package day10;

public class Ex51_Student {

	private int id = 123;
	private String name;
	private String grade;
	private char gender;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}
		else {
			System.out.println("Invalid gender input");
		}
	}

}
//access modifier
//private: access only within the class
/*
 * read - retrieve the detail write - update the id,name
 * 
 * getter and setter methods
 */
