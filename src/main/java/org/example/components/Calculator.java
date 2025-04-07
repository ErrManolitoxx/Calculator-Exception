package org.example.components;

import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.exceptions.DivideByZeroException;
import org.example.exceptions.EmptyArrayException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
@Data
public class Calculator {

    private final static Scanner scanner = new Scanner(System.in);

    public Double divide() throws DivideByZeroException {
        System.out.println("Introduzca dos números: ");

        System.out.println("Primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        if (num2 == 0) {
            throw new DivideByZeroException(num2);
        }
        double result = num1 / num2;

        return result;
    }

    public List<Double> doubleList() throws EmptyArrayException {
        System.out.println("Debe introducir números: ");
        List<Double> doubleNums = new ArrayList<>();

        System.out.println("Introduzca el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("¿Desea introducir otro? Y/N");
        String answ = scanner.nextLine();

        do {
            System.out.println("Introduzca otro número");
            double nums = scanner.nextDouble();
            scanner.nextLine();

            doubleNums.add(nums);

        } while (answ.equalsIgnoreCase("y"));
        if (answ.equalsIgnoreCase("n")){
            System.out.println("finalizando proceso: ");
        } else if (doubleNums.isEmpty()) {
            throw new EmptyArrayException(doubleNums);
        }

        return doubleNums;
    }
}