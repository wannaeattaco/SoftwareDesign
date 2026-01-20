import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Object3D> objects = new ArrayList<>();

    public void addObject(Object3D object3D){
        objects.add(Object3D);
    }

    public double totalVolume(){
        double total = 0;
        for(Object3D obj : objects){
            total += obj.getVolume();
        }
        return total;
    }
}
