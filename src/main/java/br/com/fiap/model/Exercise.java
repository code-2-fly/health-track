package br.com.fiap.model;

public class Exercise {

  private int exerciseID;

  private String name;

  private short repetitions;

  private short series;

  private float calories;

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
  * @param exerciseID Set an exerciseId for exercise Object
  * @return void
  */
  public void setExerciseID(int exerciseID) {
    this.exerciseID = exerciseID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public short getRepetitions() {
    return repetitions;
  }

  public void setRepetitions(short repetitions) {
    this.repetitions = repetitions;
  }

  public short getSeries() {
    return series;
  }

  public void setSeries(short series) {
    this.series = series;
  }

  public float getCalories() {
    return calories;
  }

  public void setCalories(float calories) {
    this.calories = calories;
  }

  public String getDescription() {
    return description;
  }

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
