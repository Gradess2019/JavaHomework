package com.gradess.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LayoutPart extends JButton {

    private final String REGION_NAME;

    public LayoutPart(final String REGION_NAME, final String PART_NAME) {
        this.REGION_NAME = REGION_NAME;

        JLabel text = new JLabel(PART_NAME, SwingConstants.CENTER);
        setLayout(new BorderLayout());
        add(text);

        addMouseListener(new PanelListener());
        setSize(getSize().width, 100);
    }

    class PanelListener extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent mouseEvent) {
            super.mouseEntered(mouseEvent);

            JOptionPane.showMessageDialog(null, "Добро пожаловать в " + (REGION_NAME == null ? "" : REGION_NAME));
        }
    }
}
