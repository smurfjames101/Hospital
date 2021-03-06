package com.qa.quickstart.Persons;

import java.util.Date;

public class Patient extends Stakeholder {
	private int patientID;
	private String doctor, ailment, pastTreatments, bloodType, treatment = "None";

	public Patient(String bloodType, String DOB, String name, String NIN) {

		super(name, DOB, NIN);
		this.bloodType = bloodType;
	}
	@Override
	public String toString()
	{
		return "Blood Type: \t" +this.getBloodType() + "\nDate Of Birth: \t"+this.getDOB() + "\nName: \t\t"+this.getName() + "\nNIN: \t\t"+ this.getNIN();
	}
	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getAilment() {
		return ailment;
	}

	public void setAilment(String ailment) {
		this.ailment = ailment;
	}

	public String getPastTreatments() {
		return pastTreatments;
	}

	public void setPastTreatments(String pastTreatments) {
		this.pastTreatments = pastTreatments;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
}
