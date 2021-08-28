package br.com.fiap.model;

import java.util.Date;

public class Food {

  private int foodID;
  private String name;
  private Date date;
  private String type;
  private float kcal;
  private String description;

  public Food () {
  }

  public Food(int foodId, String name, Date date, String type, float kcal, String description) {
    this.foodID = foodId;
    this.name = name;
    this.date = date;
    this.type = type;
    this.kcal = kcal;
    this.description = description;
  }

  public int getFoodId() {
    return foodID;
  }

  public void setFoodId(int foodId) {
    this.foodID = foodId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public float getKcal() {
    return kcal;
  }

  public void setKcal(float kcal) {
    this.kcal = kcal;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Food{" +
      "foodID=" + foodID +
      ", name='" + name + '\'' +
      ", date=" + date +
      ", type='" + type + '\'' +
      ", kcal=" + kcal +
      ", description='" + description + '\'' +
      '}';
  }

}
