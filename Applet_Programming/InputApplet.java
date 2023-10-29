package Applet_Programming;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputApplet extends Applet implements ActionListener {
    TextField textField;
    Label label;

    public void init() {
        label = new Label("Enter your name: ");
        textField = new TextField(20);
        Button submitButton = new Button("Submit");

        submitButton.addActionListener(this);

        add(label);
        add(textField);
        add(submitButton);
    }

    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText();
        label.setText("You entered: " + inputText);
    }
}
