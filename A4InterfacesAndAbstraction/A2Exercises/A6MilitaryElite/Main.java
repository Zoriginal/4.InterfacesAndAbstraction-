package A4InterfacesAndAbstraction.A2Exercises.A6MilitaryElite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<PrivateImpl> privates = new ArrayList<>();

        while (!input.equals("End")) {
            String[] info = input.split("\\s+");
            String soldierType = info[0];
            int id = Integer.parseInt(info[1]);
            String firstName = info[2];
            String lastName = info[3];
            double salary = 0.0;

            switch (soldierType) {
                case "Private":
                    salary = Double.parseDouble(info[4]);
                    PrivateImpl prv = new PrivateImpl(id, firstName, lastName, salary);
                    privates.add(prv);
                    System.out.println(prv);
                    break;
                case "Engineer":
                    try {
                        salary = Double.parseDouble(info[4]);
                        String corps1 = info[5];
                        EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, Corps.parseCorps(corps1));

                        for (int i = 6; i < info.length; i += 2) {
                            String partName = info[i];
                            int hoursWorked = Integer.parseInt(info[i + 1]);
                            Repair repair = new Repair(partName, hoursWorked);
                            engineer.addRepair(repair);
                        }
                        System.out.println(engineer);
                        for (Repair repair : engineer.getRepairs()) {
                            System.out.println(repair);
                        }
                    } catch (IllegalArgumentException ex) {
                        input = scan.nextLine();
                        continue;
                    }
                    break;
                case "Commando":
                    try {
                        salary = Double.parseDouble(info[4]);
                        String corps = info[5];
                        CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, Corps.parseCorps(corps));
                        for (int i = 6; i < info.length; i += 2) {
                            try {
                                String missionCodeName = info[i];
                                State missionState = State.parseState(info[i + 1]);
                                Mission mission = new Mission(missionCodeName, missionState);
                                commando.addMission(mission);
                            } catch (Exception e) {
                                continue;
                            }
                        }
                        System.out.println(commando);
                        commando.getMissions().forEach(System.out::println);
                    } catch (IllegalArgumentException e) {
                        input = scan.nextLine();
                        continue;
                    }

            break;
            case "LieutenantGeneral":
                salary = Double.parseDouble(info[4]);
                LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
                for (int i = 5; i < info.length; i++) {
                    for (PrivateImpl aPrivate : privates) {
                        if (aPrivate.getId() == Integer.parseInt(info[i])) {
                            lieutenantGeneral.addPrivate(aPrivate);
                            privates.remove(aPrivate);
                            break;
                        }
                    }
                }
                System.out.println(lieutenantGeneral.toString());
                break;
            case "Spy":
                String codeNumber = info[4];
                SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
                System.out.println(spy);
                break;
        }
        input = scan.nextLine();
    }
}
}