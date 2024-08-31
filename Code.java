import java.awt.*;
import java.awt.event.*;

class GUICounter extends Frame implements ActionListener {
    Button btnCount, btnDecrement, btnReset;
    Label msg;
    TextField numberField;
    int count;

    GUICounter() {
        super("GUI Counter App");
        setSize(400, 87);

        btnCount = new Button("Count");
        btnDecrement = new Button("Decrement");
        btnReset = new Button("Reset");
        btnCount.addActionListener(this);
        btnDecrement.addActionListener(this);
        btnReset.addActionListener(this); 

        msg = new Label("Counter");
        numberField = new TextField(10);

        setLayout(new FlowLayout());
        add(msg);
        add(numberField);
        add(btnCount);
        add(btnDecrement);
        add(btnReset);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnCount) {
            numberField.setText(++count + " ");
        } else if (event.getSource() == btnDecrement) {
            numberField.setText(--count + " ");
        } else if (event.getSource() == btnReset) { 
            count = 0;
            numberField.setText(count + " "); 
        }
    }

    public static void main(String[] args) {
        GUICounter obj = new GUICounter();

	obj.addWindowListener(new WindowAdapter() {
		public void windowClosing (WindowEvent e )  { 
			System.exit(0);
		}
	});

    }
}