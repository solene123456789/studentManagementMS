package fr.insa.mas.studentManagementMS.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Student")
public class Student {
	private int id;
	
	public Student(int id) {
		this.id = id; 
	}
	
	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
