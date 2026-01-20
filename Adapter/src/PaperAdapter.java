public class PaperAdapter implements Object3D{
    private Paper adaptee;
    private  double paperThickness = 0.0001;

    private PaperAdapter(Paper adapter){
        this.adapter = adaptee;
    }

    @Override
    public double getVolume(){
        return  adaptee.getArea() * paperThickness;
    }

}
