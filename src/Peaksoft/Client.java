package Peaksoft;

import java.util.Objects;

public class Client {
    private String name;
    private String peackItem;
    private int amount;

    public Client() {
    }

    public Client(String name, String peackItem, int amount) {
        this.name = name;
        this.peackItem = peackItem;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeackItem() {
        return peackItem;
    }

    public void setPeackItem(String peackItem) {
        this.peackItem = peackItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return amount == client.amount && Objects.equals(name, client.name) && Objects.equals(peackItem, client.peackItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, peackItem, amount);
    }

    @Override
    public String toString() {
        return "Client [ " +
                "name='" + name + '\'' +
                ", peackItem='" + peackItem + '\'' +
                ", amount=" + amount +
                ']';
    }
}
