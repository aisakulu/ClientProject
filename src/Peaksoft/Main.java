package Peaksoft;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<Client> linkedList = new LinkedList<>();

        linkedList.add(new Client("Altin", "Notebook", 1));
        linkedList.add(new Client("Bakyt", "Bread", 3));
        linkedList.add(new Client("Camat", "Pencil", 10));
        linkedList.add(new Client("Sultan", "Fish", 5));
        linkedList.add(new Client("Aynura", "Chocolate", 2));
        linkedList.add(new Client("Kanykei", "Cola", 8));
        linkedList.add(new Client("Musab", "Glue", 15));
        linkedList.add(new Client("Umar", "Mobile Phone", 1));

        printLinkedList(linkedList);

        System.out.println("\nClients sorted by First Characters starts with 'A', 'B', 'C'\n");

        LinkedList<Client> sortedClientByName = sortByName(linkedList);
        printLinkedList(sortedClientByName);

        System.out.println("\nClients list have more than 5 items\n");

        LinkedList<Client> moreThanFive = moreThanFiveItem(linkedList);
        printLinkedList(moreThanFive);

    }

    private static void printLinkedList(LinkedList<Client> linkedList) {
        for (Client client : linkedList) {
            System.out.println(client);
        }
    }

    private static LinkedList<Client> sortByName(LinkedList<Client> linkedList) {
        LinkedList<Client> sortName = new LinkedList<>();
        for (Client sorted : linkedList) {
            if (sorted.getName().charAt(0) == 'A') {
                sortName.add(sorted);
            } else if (sorted.getName().charAt(0) == 'B') {
                sortName.add(sorted);
            } else if (sorted.getName().charAt(0) == 'C')
                sortName.add(sorted);
        }
        return sortName;
    }

    private static LinkedList<Client> moreThanFiveItem(LinkedList<Client> linkedList) {
        LinkedList<Client> moreItem = new LinkedList<>();
        for (Client item : linkedList) {
            if (item.getAmount() >= 5) {
                moreItem.add(item);
            }
        }
        return moreItem;
    }
}
