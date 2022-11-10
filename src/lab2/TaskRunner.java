package lab2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Быстродействие системы. На вход подается массив объекта класса операций,
 * содержащий их время выполнения и стоимость выполнения. Необходимо найти суммарное
 * время и стоимость выполнения всех операций, представить цепочки времени выполнения
 * и стоимости, а так же посчитать время и стоимость на каждый вид операции.
 */

public class TaskRunner {

    public static void main(String[] args) {

        Operation[] operations = new Operation[]{
                new Operation(10, 100),
                new Operation(30, 300),
                new Operation(25, 400),
                new Operation(15, 100),
                new Operation(15, 100),
                new Operation(10, 100),
                new Operation(5, 20),
                new Operation(15, 100),
                new Operation(5, 20),
                new FreeOperation(300),
                new FreeOperation(99)
        };

        Employee[] employee = new Employee[] {
                new Employee("Рома"),
                new Employee("Витя"),
                new Employee("Рома"),
                new Employee("Андрей"),
                new Employee("Рома"),
                new Employee("Саша"),
                new Employee("Леша"),
                new Employee("Рома"),
                new Employee("Леша"),
                new Employee("Рома"),
                new Employee("Саша")
        };

        Map<Operation, Employee> map = new LinkedHashMap<>();
        for (int i = 0; i < operations.length; i++) {
            map.put(operations[i], employee[i]);
        }

        int i = 0;
        for (Map.Entry<Operation, Employee> entry : map.entrySet())
        {
            System.out.println("Операция " + (i + 1) + ": " + entry.getKey().getInfo() + " " + entry.getValue().getInfo());
            i++;
        }

        Test.printSums(operations);

        Test.printTimeTrace(operations);
        Test.printCostTrace(operations);

        Test.printOperationsStat(operations);
    }
}