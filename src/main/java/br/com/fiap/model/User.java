package br.com.fiap.model;

/**
 * Class of users
 * @version 1.0
 */
public class User {

  /**
   * user identification */
  private int userID;

  /**
   * username */
  private String name;

  /**
   * user email */
  private String email;

  /**
   * user password */
  private String password;

  public User() {

  }

  public User(int userID, String name, String email, String password) {
    this.userID = userID;
    this.name = name;
    this.email = email;
    this.password = password;
  }

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
