package br.com.fiap.model;

import java.util.Date;

/**
 * Class of foods
 * @version 1.0
 */
public class Food {

  /**
   * food identification */
  private int foodID;

  /**
   * food name */
  private String name;

  /**
   * consumption date */
  private Date date;

  /**
   * food type */
  private String type;

  /**
   * amount of kcal */
  private float kcal;

  /**
   * food description */
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

  /**
   * @return the id of the food object
   */
  public int getFoodId() {
    return foodID;
  }

  /**
   * @param foodId the new foodId to food Object
   */
  public void setFoodId(int foodId) {
    this.foodID = foodId;
  }

  /**
   * @return the name of the food object
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the new name to food Object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the date of the food object
   */
  public Date getDate() {
    return date;
  }

  /**
   * @param date the new date to food Object
   */
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * @return the type of the food object
   */
  public String getType() {
    return type;
  }

  /**
   * @param type the new type to food Object
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * @return the kcal of the food object
   */
  public float getKcal() {
    return kcal;
  }

  /**
   * @param kcal the new kcal to food Object
   */
  public void setKcal(float kcal) {
    this.kcal = kcal;
  }

  /**
   * @return the description of the food object
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the new description to food Object
   */
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
