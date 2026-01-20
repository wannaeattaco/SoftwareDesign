public class Paper {

    private double width;
    private double height;

    public Paper(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
