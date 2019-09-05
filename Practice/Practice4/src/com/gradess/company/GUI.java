package com.gradess.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame  implements ActionListener {

    private JButton milanButton;
    private JButton madridButton;

    private static final String MILAN_NAME = "AC Milan";
    private static final String REAL_MADRID_NAME = "ReaL Madrid";
    private final static int MAX_GOALS = 5;

    private JLabel result;
    private JLabel lastScorer;
    private JLabel winner;

    private int milanPoints;
    private int madridPoints;

    public GUI() {
        super("Teams");

        initWindow();

        initButtons();
        addButtonToPanel();

        initLabels();
        addLabelsToLayout();
    }

    private void initWindow() {
        setSize(400, 200);
        setLayout(new BorderLayout());
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initButtons() {
        milanButton = new JButton(MILAN_NAME);
        madridButton = new JButton(REAL_MADRID_NAME);

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);
    }

    private void addButtonToPanel() {
        JPanel panelButtons = new JPanel(new GridLayout());

        panelButtons.add(milanButton);
        panelButtons.add(madridButton);

        add(panelButtons, BorderLayout.SOUTH);
    }

    private void initLabels() {
        result = new JLabel();
        result.setHorizontalAlignment(SwingConstants.CENTER);
        updateResult();

        lastScorer = new JLabel("Last Scorer: N/A");
        lastScorer.setHorizontalAlignment(SwingConstants.LEFT);

        winner = new JLabel("Winner: DRAW");
    }

    private void updateResult() {
        result.setText("Result: " + milanPoints + " x " + madridPoints);
    }

    private void addLabelsToLayout() {
        add(lastScorer, BorderLayout.EAST);
        add(winner, BorderLayout.WEST);
        add(result, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == milanButton) {
            milanPoints++;
            setData(milanPoints, MILAN_NAME);
        } else if (actionEvent.getSource() == madridButton) {
            madridPoints++;
            setData(madridPoints, REAL_MADRID_NAME);
        }
    }

    private void setData(final int CURRENT_POINTS, final String TEAM_NAME) {
        lastScorer.setText("Last Scorer: " + TEAM_NAME);
        updateResult();
        if (CURRENT_POINTS >= MAX_GOALS) {
            winner.setText("Winner: " + TEAM_NAME);
            disableButtons();
        }
    }

    private void disableButtons() {
        milanButton.setEnabled(false);
        madridButton.setEnabled(false);
    }
}
