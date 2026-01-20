import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Window extends JFrame implements Observer{
    private JLabel label = new JLabel();

    public Window(){
        label.setPreferredSize(new Dimension(190, 40));
        add(label);
        pack();
        setVisible(true);
        setAlwaysOnTop(true);
    }
    public void setLabelText(String text){
        label.setText(text);
    }

    @Override
    public void update(Object changed){
        label.setText(changed + "");
    }
}