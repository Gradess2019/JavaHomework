package com.gradess.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private static final int SIZE_X = 500;
    private static final int SIZE_Y = 500;

    public GUI() throws HeadlessException {

        setSize(SIZE_X, SIZE_Y);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new LayoutPart(null, "CENTER"), BorderLayout.CENTER);
        add(new LayoutPart("Джидда", "WEST"), BorderLayout.WEST);
        add(new LayoutPart("Абха", "SOUTH"), BorderLayout.SOUTH);
        add(new LayoutPart(null, "NORTH"), BorderLayout.NORTH);
        add(new LayoutPart("Дахране", "EAST"), BorderLayout.EAST);

        setVisible(true);

    }
}
