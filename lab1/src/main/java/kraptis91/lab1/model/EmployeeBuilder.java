package kraptis91.lab1.model;

/** @author Konstantinos Raptis [kraptis at unipi.gr] on 30/11/2020. */
public class EmployeeBuilder {

  private String firstName;
  private String lastName;
  private double salary;
  private String department;

  public EmployeeBuilder withDepartment(String department) {
    this.department = department;
    return EmployeeBuilder.this;
  }

  public EmployeeBuilder withSalary(double salary) {
    this.salary = salary;
    return EmployeeBuilder.this;
  }

  public EmployeeBuilder withLastName(String lastName) {
    this.lastName = lastName;
    return EmployeeBuilder.this;
  }

  public EmployeeBuilder withFirstName(String firstName) {
    this.firstName = firstName;
    return EmployeeBuilder.this;
  }

  public Employee build() {
    return new Employee(firstName, lastName, salary, department);
  }
}
