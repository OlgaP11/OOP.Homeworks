import gb.GBList;
import gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList <Integer> gbList = new GBArrayList<>();
        gbList.add(1);
        gbList.add(2);
        gbList.add(3);
        gbList.add(4);
        gbList.add(5);
        gbList.add(6);
        gbList.add(7);

        System.out.printf("Size = %d\n", gbList.size());
        System.out.println(gbList);

        gbList.remove(5);
        System.out.println(gbList);

        gbList.update(3,10);
        System.out.println(gbList);
    }
}