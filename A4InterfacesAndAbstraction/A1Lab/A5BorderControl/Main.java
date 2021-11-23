package A4InterfacesAndAbstraction.A1Lab.A5BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        List<Identifiable> identifiable = new ArrayList<>();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            if (data.length == 3) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];

                identifiable.add(new Citizen(name, age, id));
            }else if(data.length == 2){
                String model = data[0];
                String id = data[1];
                identifiable.add(new Robot(model,id));
            }

            line = scan.nextLine();
        }

        line = scan.nextLine();
        for (Identifiable identifiable1 : identifiable) {
            if(identifiable1.getId().endsWith(line)){
                System.out.println(identifiable1.getId());
            }
        }
    }
}
