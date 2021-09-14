package task4;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class GameHandler extends JFrame {
    private int firstTeamScore;
    private int secondTeamScore;
    private boolean isFirstTeamLastScorer;

    private JButton firstTeamButton;
    private JButton secondTeamButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private Label winnerLabel;

    public GameHandler() {
        firstTeamScore = 0;
        secondTeamScore = 0;
        isFirstTeamLastScorer = true;

        createComponents();
        configureButtons();

        setSize(1000, 1000);
        setLayout(new GridLayout(5, 1));

        addComponents();
    }

    private void createComponents() {
        firstTeamButton = new JButton("AC Milan");
        secondTeamButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new Label("Winner: DRAW");
    }

    private void configureButtons() {
        firstTeamButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                firstTeamScore++;
                isFirstTeamLastScorer = true;
                refreshGUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        secondTeamButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                secondTeamScore++;
                isFirstTeamLastScorer = false;
                refreshGUI();
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    private void addComponents() {
        add(firstTeamButton, BorderLayout.CENTER);
        add(secondTeamButton, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.CENTER);
        add(lastScorerLabel, BorderLayout.CENTER);
        add(winnerLabel, BorderLayout.CENTER);
    }

    public void refreshGUI() {
        resultLabel.setText("Result: " + firstTeamScore + " X " + secondTeamScore);
        lastScorerLabel.setText("Last Scorer: " + ((isFirstTeamLastScorer) ? ("AC Milan") : ("Real Madrid")));
        if (firstTeamScore > secondTeamScore) {
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (secondTeamScore > firstTeamScore) {
            winnerLabel.setText("Winner: Real Madrid");
        }
        else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
