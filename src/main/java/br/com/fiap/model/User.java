package br.com.fiap.model;

public class User {

  private int userID;

  private String name;

  private String email;

  private String password;

  /**
   * @return the id of the user object
   */
  public int getUserID() {
    return userID;
  }

  /**
   * @param userID the new id to user Object
   */
  public void setUserID(int userID) {
    this.userID = userID;
  }

  /**
   * @return the name of the user object
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the new name to user Object
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the email of the user object
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the new email to user Object
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the password of the user object
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the new password to user Object
   */
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
      "userID=" + userID +
      ", name='" + name + '\'' +
      ", email='" + email + '\'' +
      ", password='" + password + '\'' +
      '}';
  }

}
