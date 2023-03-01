package oop.practice.classes.phone;

public class Phone {
    private String number, model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling {" + name + "} ");
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Calling {" + name + "}, "
                + "Phone number: " + phoneNumber);
    }

    public void sendMessage(Phone... phones) {
        boolean isSend = false;
        for (Phone phone : phones) {
            if (!isSend) {
                System.out.println("Phone number: " + number);
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "number: " + number +
                ", model: " + model +
                ", weight: " + weight;
    }
}
