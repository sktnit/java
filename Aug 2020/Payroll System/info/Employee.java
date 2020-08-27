package info; //info package 

// Employee class with the attributes: 
// employee ID, last name, first name, and social security number.
class Employee {
  private int employee_id, social_security_number;
  private String first_name, last_name;

  // set methods for employee_id
  public void setEmpolyee_ID(int employee_id) {
    this.employee_id = employee_id;
  }

  // get methods for employee_id
  public int getEmployee_ID() {
    return this.employee_id;
  }

  // set methods for social_security_number
  public void setSocial_Security_Number(int social_security_number) {
    this.social_security_number = social_security_number;
  }

  // get methods for social_security_number
  public int getSocial_Security_Number() {
    return this.social_security_number;
  }

  // set methods for first_name
  public void setFirst_Name(String first_name) {
    this.first_name = first_name;
  }

  // get methods for first_name
  public String getFirst_Name() {
    return this.first_name;
  }

  // set methods for last_name
  public void setLast_Name(String last_name) {
    this.last_name = last_name;
  }

  // get methods for last_name
  public String getLast_Name() {
    return this.last_name;
  }
}
