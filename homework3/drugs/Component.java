package drugs;

import java.util.Objects;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, weight: %s, power: %d", getName(),getWeight(),getPower());
    }

    @Override
    public boolean equals(Object o) {
        Component c = (Component) o;
        return this.name == c.name
                && this.weight == c.weight
                && this.power == c.power;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, power);
    }
}

