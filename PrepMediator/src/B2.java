import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B2  extends JButton {
    private Mediator mediator;

    public B2(String text, Mediator mediator){
        super(text);
        this.mediator = mediator;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mediator.notify(B2.this);
            }
        });
    }

}
