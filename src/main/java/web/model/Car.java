package web.model;

public class Car {
    private String model;
    private int RegistrationNumber;
    private String color;

    public Car(String model, int registrationNumber, String color) {
        this.model = model;
        this.RegistrationNumber = registrationNumber;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
