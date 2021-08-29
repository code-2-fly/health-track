package br.com.fiap.model;

import java.util.Date;

/**
 * Class of weights
 * @version 1.0
 */
public class Weight {

  /**
   * weight identification */
  private int weightID;

  /**
   * weighing date */
  private Date date;

  /**
   * weight number */
  private float weight;

  public Weight() {
  }

  public Weight(int weightID, Date date, float weight) {
    this.weightID = weightID;
    this.date = date;
    this.weight = weight;
  }

  /**
   * @return the id of the weight object
   */
  public int getWeightID() {
    return weightID;
  }

  /**
   * @param weightID the new id to weight Object
   */
  public void setWeightID(int weightID) {
    this.weightID = weightID;
  }

  /**
   * @return the date of the weight object
   */
  public Date getDate() {
    return date;
  }

  /**
   * @param date the new date to weight Object
   */
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * @return the weight of the weight object
   */
  public float getWeight() {
    return weight;
  }

  /**
   * @param weight the new weight to weight Object
   */
  public void setWeight(float weight) {
    this.weight = weight;
  }

}
