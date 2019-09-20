package com.gradess.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI(final String PATH_TO_IMAGE) throws HeadlessException {
        addImage(PATH_TO_IMAGE);
        initWindow();
    }

    private void addImage(final String PATH_TO_IMAGE) {
        ImageIcon image = new ImageIcon(PATH_TO_IMAGE);
        JLabel imageContainer = new JLabel(image);
        add(imageContainer);

        checkImageLoadStatus(PATH_TO_IMAGE, image);
    }

    private void checkImageLoadStatus(String PATH_TO_IMAGE, ImageIcon image) {
        if (MediaTracker.COMPLETE == image.getImageLoadStatus()) {
            setTitle(PATH_TO_IMAGE);
            setSize(image.getIconWidth(), image.getIconHeight());
        } else {
            setTitle("Картинка не найдена!");
            setSize(400, 100);
        }
    }

    private void initWindow() {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
