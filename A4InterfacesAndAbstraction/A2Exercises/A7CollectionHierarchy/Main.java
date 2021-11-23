package A4InterfacesAndAbstraction.A2Exercises.A7CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] elements = scan.nextLine().split("\\s+");
        int number = Integer.parseInt(scan.nextLine());

        AddCollection addCollection = new AddCollection();
        AddRemovable addRemoveCollection = new AddRemoveCollection();
        MyList myList = new MyListImpl();

        printArray(elements, addCollection);
        printArray(elements, addRemoveCollection);
        printArray(elements, myList);


        printRemovedElement(addRemoveCollection, number);
        printRemovedElement(myList, number);
    }

    private static void printRemovedElement(AddRemovable addRemoveCollection, int number) {
        for (int n = 0; n < number; n++) {
            System.out.print(addRemoveCollection.remove() + " ");
        }
        System.out.println();
    }

    private static void printArray(String[] elements, Addable addable) {
        for (String element : elements) {
            System.out.print(addable.add(element) + " ");
        }
        System.out.println();
    }
}
