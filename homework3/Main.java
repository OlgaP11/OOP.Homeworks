import drugs.impl.CatDrug;
import drugs.Component;
import drugs.impl.components.Azitron;
import drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Component> componentsForCa1 = List.of(new Azitron("Azitron", "2", 8),
                new Water("Water", "100", 1));
        CatDrug drug1 = new CatDrug(componentsForCa1);
//        for (Component component:
//             drug1) {
//            System.out.println(component);
//        }
        List <Component> componentsForCat2 = List.of(new Azitron("Azitron", "5", 15),
                new Water("Water", "100", 1));
        CatDrug drug2 = new CatDrug(componentsForCat2);
        List <Component> componentsForCat3 = List.of(new Azitron("Pinicilin", "8", 15),
                new Water("Water", "100", 1));
        CatDrug drug3 = new CatDrug(componentsForCat3);

        List <CatDrug> drugs = new ArrayList<>();
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug1);

        Collections.sort(drugs);
        System.out.println(drugs);

    }
}
