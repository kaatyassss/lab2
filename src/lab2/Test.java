package lab2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public static void printSums(Operation[] operations) {
        int sumTime = 0;
        int sumCost = 0;
        for (Operation operation : operations) {
            sumTime += operation.getTime();
            sumCost += operation.getCost();
        }
        System.out.println("Суммарное время: " + sumTime);
        System.out.println("Суммарные затраты: " + sumCost);
    }

    public static void printTimeTrace(Operation[] operations) {
        String stringOfTime = Arrays.stream(operations)
                .map(Operation::getTime)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Цепочка времени: { " + stringOfTime + " }");
    }

    public static void printCostTrace(Operation[] operations) {
        String stringOfTime = Arrays.stream(operations)
                .map(Operation::getCost)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Цепочка затрат: { " + stringOfTime + " }");
    }

    public static void printOperationsStat(Operation[] operations) {
        int[] uniqueTime = Arrays.stream(operations)
                .map(Operation::getTime)
                .distinct()
                .mapToInt(Integer::valueOf)
                .toArray();

        int oldN = Operation.n;
        Operation.n = 0; //+
        for (int i = 0; i < uniqueTime.length; i++) {
            int sumTime = 0;
            int sumMoney = 0;
            Operation uniqueOperation;
            for (Operation operation : operations) {
                if (operation.getTime() == uniqueTime[i]) {
                    sumTime += operation.getTime();
                    sumMoney += operation.getCost();
                }
            }
            if (sumMoney == 0) {
                uniqueOperation = new FreeOperation(sumTime);
            } else {
                uniqueOperation = new Operation(sumTime, sumMoney);
            }

            System.out.println(uniqueOperation.getInfo());
        }
        Operation.n = oldN;
    }
}
