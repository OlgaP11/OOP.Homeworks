import drugs.impl.CatDrug;
import drugs.Component;
import drugs.impl.components.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsForCat1 = List.of(new Azitron("Azitron2", "2", 8),
                new Water("Water", "100", 1),
                new Penicillin("Penicillin1", "10", 5));
        CatDrug drug1 = new CatDrug(componentsForCat1);

        List<Component> componentsForCat2 = List.of(new Azitron("Azitron2", "5", 15),
                new Water("Water", "100", 1),
                new Penicillin("Penicillin2", "10", 5));
        CatDrug drug2 = new CatDrug(componentsForCat2);

        List<Component> componentsForCat3 = List.of(new Azitron("Azitron1", "8", 8),
                new Water("Water", "100", 1),
                new Penicillin("Penicillin1", "10", 5));
        CatDrug drug3 = new CatDrug(componentsForCat3);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug1);

        Collections.sort(drugs);
        System.out.println(drugs);

        Component component1 = new Component("Azitron2", "5", 15);
        Component component2 = new Component("Azitron2", "5", 15);
        Component component3 = new Component("Penicillin1", "10", 5);
        Component component4 = new Component("Water", "100", 1);

        Set<Component> components = new HashSet<>();
        components.add(component1);
        components.add(component2);
        components.add(component3);
        components.add(component4);

        System.out.println("Component's set:");
        for (Component component : components) {
            System.out.println(component);
        }
    }
}
