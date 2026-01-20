public class Sphere implements Object3D{
    private double r;
    public Sphere(double r){
        this.r = r;
    }

    @Override
    public double getVolume(){
        return 4*pi*r**3;
    }

}
