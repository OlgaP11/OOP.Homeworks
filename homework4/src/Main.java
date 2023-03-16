import gb.GBList;
import gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList <Integer> gbList = new GBArrayList<>();
        gbList.add(1);
        gbList.add(2);
        gbList.add(3);
        gbList.add(4);
        System.out.printf("Size = %d\n", gbList.size());
        System.out.printf("Elem = %d\n", gbList.get(2));
        for (Integer num: gbList) {
            System.out.printf("%d ", num);
        }
        System.out.println();
        gbList.remove(2);
        System.out.println(gbList);
    }
}