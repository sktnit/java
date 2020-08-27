package info;

// Salary Employee class will have the attributes: employee ID and annual salary
class SalaryEmployee extends Employee {
  private int employee_id, annual_salary;

  public void setEmployee_ID(int employee_id) {
    this.employee_id = employee_id;
  }

  public int getEmployee_ID() {
    return this.employee_id;
  }

  public void setAnnual_Salary(int annual_salary) {
    this.annual_salary = annual_salary;
  }

  public int getAnnual_Salary() {
    return this.annual_salary;
  }
}