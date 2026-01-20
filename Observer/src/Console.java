public class Console implements Observer{
    @Override
    public void update(Object changed){
        System.out.println(changed + "");
    }
}