package bo;

import java.util.Date;

public class Claims {
	String id;
	Patient patient;
	Provider provider;
	Date dateOfService;
	double amountBilled;
	Status state;
	Status stage;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Date getDateOfService() {
		return dateOfService;
	}
	public void setDateOfService(Date dateOfService) {
		this.dateOfService = dateOfService;
	}
	public double getAmountBilled() {
		return amountBilled;
	}
	public void setAmountBilled(double amountBilled) {
		this.amountBilled = amountBilled;
	}
	public Status getState() {
		return state;
	}
	public void setState(Status state) {
		this.state = state;
	}
	public Status getStage() {
		return stage;
	}
	public void setStage(Status stage) {
		this.stage = stage;
	}
	
}


