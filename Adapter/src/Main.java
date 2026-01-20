public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addObject(new Parcel(2, 3, 4));
        warehouse.addObject(new Parcel(1, 1, 1));
        warehouse.addObject(new Sphere(1));
        warehouse.addObject(new PaperAdapter(new Paper(5, 5)));
        System.out.println("Total volume: " + warehouse.totalVolume());
    }
}