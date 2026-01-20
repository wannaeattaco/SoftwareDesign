import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private M2 m = new M2();
    private  Label label = new Label();
    private B1 b1 = new B1("Button 1", m);
    private B2 b2 = new B2("Button 2", m);

    public Window(){
        m.setLabel(label);
        m.setB1(b1);
        m.setB2(b2);

        setLayout(new FlowLayout());
        add(label);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
}
