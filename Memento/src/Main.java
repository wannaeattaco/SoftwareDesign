

public class Main {
    public static void main(String[] args)
    {
        Engine.Memento memento = engine.save();
        engine.process();
        en
        System.out.println("1 :"+ engine.getState());


        engine.process();
        System.out.println("2 : "+engine.getState());

        //Todo : Load
//        engine.setState(saved);
        memento = new Engine.Memento(99999);
        engine.load(memento);

        System.out.println("3 : "+engine.getState());
    }
}