package A4InterfacesAndAbstraction.A2Exercises.A5Тelephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> phoneNumbers = Arrays.asList(scan.nextLine().split("\\s+"));
        List<String> sites = Arrays.asList(scan.nextLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(phoneNumbers,sites);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
