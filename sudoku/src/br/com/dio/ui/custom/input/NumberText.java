package br.com.dio.ui.custom.input;

import br.com.dio.model.Space;
import javax.swing.JTextField;

public class NumberText extends JTextField {
    private final Space space;

    public NumberText(final Space space) {
        this.space = space;
        setHorizontalAlignment(JTextField.CENTER);
        setDocument(new NumberTextLimit());
        setText(space.getValue() == 0 ? "" : String.valueOf(space.getValue()));
        setEditable(!space.isFixed());
        setEnabled(!space.isFixed());
        getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updateSpace();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updateSpace();
            }
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updateSpace();
            }
            private void updateSpace() {
                String text = getText();
                if (text.matches("[1-9]")) {
                    space.setValue(Integer.parseInt(text));
                } else {
                    space.setValue(0);
                }
            }
        });
    }
}
