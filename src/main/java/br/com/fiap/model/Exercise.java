package br.com.fiap.model;

/**
 * Class of exercises
 * @version 1.0
 */
public class Exercise {

  /**
   * exercise identification */
  private int exerciseID;

  /**
   * exercise name */
  private String name;

  /**
   * exercise repetitions */
  private short repetitions;

  /**
   * exercise series */
  private short series;

  /**
   * amount of calories */
  private float calories;

  /**
   * exercise description */
  private String description;

  public Exercise() {
  }

  public Exercise(int exerciseID, String name, short repetitions, short series, float calories, String description) {
    this.exerciseID = exerciseID;
    this.name = name;
    this.repetitions = repetitions;
    this.series = series;
    this.calories = calories;
    this.description = description;
  }

  public int getExerciseID() {
    return exerciseID;
  }

  /**
  * @param exerciseID the new exerciseId to exercise Object
  */
  public void setExerciseID(int exerciseID) {
    this.exerciseID = exerciseID;
  }

  /**
   * @return the name of the exercise
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the new name to exercise Object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the repetitions of the exercise
   */
  public short getRepetitions() {
    return repetitions;
  }

  /**
   * @param repetitions the new number of repetitions to exercise Object
   */
  public void setRepetitions(short repetitions) {
    this.repetitions = repetitions;
  }

  /**
   * @return the series of the exercise
   */
  public short getSeries() {
    return series;
  }

  /**
   * @param series the new number of series to exercise Object
   */
  public void setSeries(short series) {
    this.series = series;
  }

  /**
   * @return the series of the exercise
   */
  public float getCalories() {
    return calories;
  }

  /**
   * @param calories the new calorie to exercise Object
   */
  public void setCalories(float calories) {
    this.calories = calories;
  }

  /**
   * @return the description of the exercise
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description the new description to exercise Object
   */
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Exercise{" +
      "exerciseID=" + exerciseID +
      ", name='" + name + '\'' +
      ", repetitions=" + repetitions +
      ", series=" + series +
      ", calories=" + calories +
      ", description='" + description + '\'' +
      '}';
  }

}
