import java.awt.*;

public class M2 implements Mediator{
    private Label label;
    private B1 b1;
    private B2 b2;

    public void setB1(B1 b1) {
        this.b1 = b1;
    }

    public void setB2(B2 b2) {
        this.b2 = b2;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public void notify(Component sender) {
        if(sender == b1){
            label.setText("XXX");
            b1.setEnabled(false);
            b2.setEnabled(true);
        } else if (sender == b2){
            label.setText("YYY");
            b2.setEnabled(false);
            b1.setEnabled(true);
        }

    }
}
