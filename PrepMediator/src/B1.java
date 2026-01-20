import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B1 extends JButton {
    private Mediator mediator;

    public B1(String text, Mediator mediator){
        super(text);
        this.mediator = mediator;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.notify(B1.this);
            }
        });
    }

}
