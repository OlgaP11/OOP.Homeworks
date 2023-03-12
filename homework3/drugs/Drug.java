package drugs;

import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterable <Component>, Comparable<Drug> {
    private List <Component> components;
    int index;

    public Drug(List<Component> components) {
        this.components = components;
        this.index = 0;
    }


    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index<components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component:
                components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public int compareTo(Drug o) {
        int power = getDrugPower();
        return Integer.compare(power, o.getDrugPower());
    }

    @Override
    public String toString() {
        return "Drug{" +
                "components=" + components +
                ", index=" + index +
                '}'+getDrugPower()+"\n";
    }
}



