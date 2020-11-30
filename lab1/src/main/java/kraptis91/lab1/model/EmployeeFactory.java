package kraptis91.lab1.model;

/** @author Konstantinos Raptis [kraptis at unipi.gr] on 30/11/2020. */
public class EmployeeFactory {

  public static Employee[] createDefaultEmployeeArray() {
    return new Employee[] {
      new EmployeeBuilder()
          .withFirstName("Jason")
          .withLastName("Red")
          .withSalary(5000)
          .withDepartment("IT")
          .build(),
      new EmployeeBuilder()
          .withFirstName("Ashley")
          .withLastName("Green")
          .withSalary(7600)
          .withDepartment("IT")
          .build(),
      new EmployeeBuilder()
          .withFirstName("Matthew")
          .withLastName("Indigo")
          .withSalary(3587.5)
          .withDepartment("Sales")
          .build(),
      new EmployeeBuilder()
          .withFirstName("James")
          .withLastName("Indigo")
          .withSalary(4700.77)
          .withDepartment("Marketing")
          .build(),
      new EmployeeBuilder()
          .withFirstName("Luke")
          .withLastName("Indigo")
          .withSalary(6200)
          .withDepartment("IT")
          .build(),
      new EmployeeBuilder()
          .withFirstName("Jason")
          .withLastName("Blue")
          .withSalary(3200)
          .withDepartment("Sales")
          .build(),
      new EmployeeBuilder()
          .withFirstName("Wendy")
          .withLastName("Brown")
          .withSalary(4326.4)
          .withDepartment("Marketing")
          .build()
    };
  }
}
