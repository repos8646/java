package test06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	
	public Doctor(String name, String id, String special) {
		super();
		this.name = name;
		this.id = id;
		this.special = special;
		this.patients = ArrayList<>();
	}
	
	public void addPatient(Patient) {}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", special=" + special + ", patients=" + patients + "]";
	}

	
}
