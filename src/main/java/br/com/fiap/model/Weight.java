package br.com.fiap.model;

import java.util.Date;

public class Weight {

  private int weightID;

  private Date date;

  private float weight;

  public Weight() {
  }

  public Weight(int weightID, Date date, float weight) {
    this.weightID = weightID;
    this.date = date;
    this.weight = weight;
  }

  public int getWeightID() {
    return weightID;
  }

  public void setWeightID(int weightID) {
    this.weightID = weightID;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

}
