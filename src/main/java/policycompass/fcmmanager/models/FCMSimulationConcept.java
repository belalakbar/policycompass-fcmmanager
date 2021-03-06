package policycompass.fcmmanager.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class FCMSimulationConcept {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	@Column(name = "FCMSimulation_id", nullable = false)
	private int FCMSimulation_id;
	@Column(name = "Concept_id", nullable = false)
	private int Concept_id;
	@Column(name = "ScaleValue", nullable = false)
	private double ScaleValue;
	@Column(name = "FixedOutput", nullable = false)
	private boolean FixedOutput;
	@Column(name = "Metric_id", nullable = false)
	private int Metric_id;
	@Column(name = "UserID", nullable = false)
	private int UserID;
	@Column(name = "DateAddedtoPC", nullable = false)
	private Date DateAddedtoPC;
	@Column(name = "DateModified", nullable = true)
	private Date DateModified;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFCMSimulation_id() {
		return FCMSimulation_id;
	}

	public void setFCMSimulation_id(int fCMSimulation_id) {
		FCMSimulation_id = fCMSimulation_id;
	}

	public int getConceptID() {
		return Concept_id;
	}

	public void setConceptID(int conceptID) {
		Concept_id = conceptID;
	}

	public double getScaleValue() {
		return ScaleValue;
	}

	public void setScaleValue(double scaleValue) {
		ScaleValue = scaleValue;
	}

	public boolean getFixedOutput() {
		return FixedOutput;
	}

	public void setFixedOutput(boolean fixedOutput) {
		FixedOutput = fixedOutput;
	}

	public int getMetricID() {
		return Metric_id;
	}

	public void setMetricID(int metricID) {
		Metric_id = metricID;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public Date getDateAddedtoPC() {
		return DateAddedtoPC;
	}

	public void setDateAddedtoPC(Date dateAddedtoPC) {
		DateAddedtoPC = dateAddedtoPC;
	}

	public Date getDateModified() {
		return DateModified;
	}

	public void setDateModified(Date dateModified) {
		DateModified = dateModified;
	}
}
