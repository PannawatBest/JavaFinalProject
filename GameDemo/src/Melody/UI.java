package Melody;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Melody.DarkMelody.ChoiceHandler;

public class UI {
	JFrame window;
	JPanel titleNamePanel, subtitleNamePanel, startButtonPanel, howToButtonPanel, exitButtonPanel, mainTextPanel,
			choiceButtonPanel, choiceBackPanel, playerPanel;
	JLabel titleNameLabel, subtitleNameLabel, hpLabel, hpNumberLabel;
	JButton startButton, howToButton, exitButton, choice1, choice2, choice3, choiceB;
	JTextArea mainTextArea;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 120);
	Font subtitleFont = new Font("Times New Roman", Font.PLAIN, 40);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	Font thaiFont = new Font("Angsana New", Font.PLAIN, 26);

	public void createUI(ChoiceHandler cHandler) {
		// Window
		window = new JFrame();
		window.setSize(1000, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

		// Title screen
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(90, 50, 800, 140);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Dark Melody");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		titleNamePanel.add(titleNameLabel);

		subtitleNamePanel = new JPanel();
		subtitleNamePanel.setBounds(680, 180, 150, 110);
		subtitleNamePanel.setBackground(Color.black);
		subtitleNameLabel = new JLabel("DEMO");
		subtitleNameLabel.setForeground(Color.white);
		subtitleNameLabel.setFont(subtitleFont);
		subtitleNamePanel.add(subtitleNameLabel);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(400, 300, 200, 100);
		startButtonPanel.setBackground(Color.black);
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(cHandler);
		startButton.setActionCommand("start");
		startButtonPanel.add(startButton);

		howToButtonPanel = new JPanel();
		howToButtonPanel.setBounds(400, 350, 200, 100);
		howToButtonPanel.setBackground(Color.black);
		howToButton = new JButton("How To?");
		howToButton.setBackground(Color.black);
		howToButton.setForeground(Color.white);
		howToButton.setFont(normalFont);
		howToButton.setFocusPainted(false);
		howToButton.addActionListener(cHandler);
		howToButton.setActionCommand("howTo");
		howToButtonPanel.add(howToButton);

		exitButtonPanel = new JPanel();
		exitButtonPanel.setBounds(400, 400, 200, 100);
		exitButtonPanel.setBackground(Color.black);
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(normalFont);
		exitButton.setFocusPainted(false);
		exitButton.addActionListener(cHandler);
		exitButton.setActionCommand("exit");
		exitButtonPanel.add(exitButton);

		// ADD to show screen
		window.add(titleNamePanel);
		window.add(subtitleNamePanel);
		window.add(startButtonPanel);
		window.add(howToButtonPanel);
		window.add(exitButtonPanel);

		// Game screen
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		window.add(mainTextPanel);

		mainTextArea = new JTextArea("This is the main thext area เกมนี้มันสุดยอด");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(thaiFont);
		mainTextArea.setLineWrap(true);
		mainTextArea.setWrapStyleWord(true);
		mainTextArea.setEditable(false);
		mainTextPanel.add(mainTextArea);

		// Choice
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(15, 490, 950, 50);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(1, 3));
		window.add(choiceButtonPanel);

		choiceBackPanel = new JPanel();
		choiceBackPanel.setBounds(810, 490, 150, 50);
		choiceBackPanel.setBackground(Color.black);
		choiceBackPanel.setLayout(new GridLayout(1, 1));
		window.add(choiceBackPanel);

		choice1 = new JButton("Choice1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(thaiFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(cHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Choice2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(thaiFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(cHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("Choice3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(thaiFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(cHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);

		choiceB = new JButton("ChoiceB");
		choiceB.setBackground(Color.black);
		choiceB.setForeground(Color.white);
		choiceB.setFont(thaiFont);
		choiceB.setFocusPainted(false);
		choiceB.addActionListener(cHandler);
		choiceB.setActionCommand("cB");
		choiceBackPanel.add(choiceB);

		// HP
		playerPanel = new JPanel();
		playerPanel.setBounds(10, 15, 100, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1, 1));
		window.add(playerPanel);

		hpLabel = new JLabel("HP");
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		hpNumberLabel = new JLabel();
		hpNumberLabel.setForeground(Color.white);
		hpNumberLabel.setFont(normalFont);
		playerPanel.add(hpNumberLabel);

		window.setVisible(true);

	}

}
