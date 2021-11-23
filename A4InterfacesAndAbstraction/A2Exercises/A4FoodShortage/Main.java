package A4InterfacesAndAbstraction.A2Exercises.A4FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();

        while (N-- > 0) {
            String[] people = scan.nextLine().split("\\s+");
            String name = people[0];
            int age = Integer.parseInt(people[1]);
            if (people.length == 4) {
                String id = people[2];
                String birthdate = people[3];
                personList.add(new Citizen(name, age, id, birthdate));

            } else if (people.length == 3) {
                String group = people[2];
                personList.add(new Rebel(name, age, group));
            }
        }
        String buyerName = scan.nextLine();
        int foodCitizen = 0;
        int foodRebel = 0;

        while (!buyerName.equals("End")) {
            for (Person person : personList) {
                if (buyerName.equals(person.getName())) {
                    if (person instanceof Citizen) {
                        ((Citizen) person).buyFood();
                        foodCitizen = ((Citizen) person).getFood();
                    } else if (person instanceof Rebel) {
                        ((Rebel) person).buyFood();
                        foodRebel = ((Rebel) person).getFood();
                    }

                }
            }
            buyerName = scan.nextLine();
        }
        System.out.println(foodCitizen + foodRebel);
    }
}
