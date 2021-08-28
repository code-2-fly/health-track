package br.com.fiap.model;

public class BloodPressure {

  private int bloodPressureID;

  private short systolic;

  private short diastolic;

  public BloodPressure() {
  }

  public BloodPressure(int bloodPressureID, short systolic, short diastolic) {
    this.bloodPressureID = bloodPressureID;
    this.systolic = systolic;
    this.diastolic = diastolic;
  }

  public int getBloodPressureID() {
    return bloodPressureID;
  }

  public void setBloodPressureID(int bloodPressureID) {
    this.bloodPressureID = bloodPressureID;
  }

  public short getSystolic() {
    return systolic;
  }

  public void setSystolic(short systolic) {
    this.systolic = systolic;
  }

  public short getDiastolic() {
    return diastolic;
  }

  public void setDiastolic(short diastolic) {
    this.diastolic = diastolic;
  }

}
