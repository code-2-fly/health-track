package br.com.fiap.model;

/**
 * Class of blood pressures
 * @version 1.0
 */
public class BloodPressure {

  /**
   * blood pressure identification */
  private int bloodPressureID;

  /**
   * systolic number */
  private short systolic;

  /**
   * diastolic number */
  private short diastolic;

  public BloodPressure() {
  }

  public BloodPressure(int bloodPressureID, short systolic, short diastolic) {
    this.bloodPressureID = bloodPressureID;
    this.systolic = systolic;
    this.diastolic = diastolic;
  }

  /**
   * @return the id of the bloodPressure object
   */
  public int getBloodPressureID() {
    return bloodPressureID;
  }

  /**
   * @param bloodPressureID the new id to bloodPressure Object
   */
  public void setBloodPressureID(int bloodPressureID) {
    this.bloodPressureID = bloodPressureID;
  }

  /**
   * @return the systolic of the bloodPressure object
   */
  public short getSystolic() {
    return systolic;
  }

  /**
   * @param systolic the new systolic number to bloodPressure Object
   */
  public void setSystolic(short systolic) {
    this.systolic = systolic;
  }

  /**
   * @return the diastolic of the bloodPressure object
   */
  public short getDiastolic() {
    return diastolic;
  }

  /**
   * @param diastolic the new diastolic to bloodPressure Object
   */
  public void setDiastolic(short diastolic) {
    this.diastolic = diastolic;
  }

}
