package kraptis91.lab1.model.filters;

import jakarta.validation.constraints.NotNull;
import kraptis91.lab1.model.Employee;

import java.util.function.Predicate;

/** @author Konstantinos Raptis [kraptis at unipi.gr] on 30/11/2020. */
public class EmployeePredicate {

  public static Predicate<Employee> isSalaryMoreThan4000() {
    return EmployeePredicate::isSalaryMoreThan4000;
  }

  public static boolean isSalaryMoreThan4000(@NotNull Employee employee) {
    return employee.getSalary() > 4000;
  }
}
