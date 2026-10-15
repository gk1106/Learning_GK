import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPro {
    
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John", "IT", 50000),
            new Employee("Alice", "HR", 60000),
            new Employee("Bob", "Finance", 70000),
            new Employee("Eve", "Marketing", 55000),
            new Employee("Charlie", "IT", 65000),
            new Employee("David", "HR", 75000),
            new Employee("Frank", "Finance", 80000),
            new Employee("Grace", "Marketing", 60000)

        };


        // Map<String,Employee> result=Arrays.stream(employees)
        //                   .collect(Collectors.groupingBy(
        //                                                 Employee::getDepartment,
        //                                                 Collectors.collectingAndThen(
        //                                                         Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
        //                                                         Optional::get
        //                                                 )
        //                   ));

        //                   System.out.println(result);

                Map<String,Optional<Employee>> result=Arrays.stream(employees)
                          .collect(Collectors.groupingBy(
                                                        Employee::getDepartment,
                                                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                                                     
                                                        
                          ));

                          System.out.println(result);
    }

}
