package kraptis91.lab1.model;

import kraptis91.lab1.model.filters.EmployeePredicate;
import org.junit.Test;

import java.util.Arrays;

/** @author Konstantinos Raptis [kraptis at unipi.gr] on 30/11/2020. */
public class EmployeeTest {

  private Employee[] employees = EmployeeFactory.createDefaultEmployeeArray();

  @Test
  public void testToString() {
    Arrays.stream(employees).forEach(System.out::println);
  }

  @Test
  public void testSalaryPredicate() {
    Arrays.stream(employees)
        .filter(EmployeePredicate::isSalaryMoreThan4000)
        .forEach(System.out::println);
  }
}
