import java.util.Random;

public class Engine {

    private int state;

    public void process() {
        state = new Random().nextInt(100);
    }

    public void  debugInternalState(){
        System.out.println();
    }

    public int getState() {
        return state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void load(Memento memento){
        state =  memento.getSavedState();
    }

//    public int setState(int state) {
//        this.state = state;
//    }

    public static class Memento {
        private int savedState;


        private Memento(int savedState){
            this.savedState = savedState;
        }

        private int getSavedState(){
            return savedState;
        }
    }
}
