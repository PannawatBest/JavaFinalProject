import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dark_Melody {

	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
	JLabel titleNameLabel;
	Font titleFont 	= new Font("Times New Roman", Font.PLAIN, 150);
	Font StartFont 	= new Font("Times New Roman", Font.PLAIN, 80);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);
	JButton startButton, choice1, choice2, choice3;
	JTextArea mainTextArea;
	String position;

	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler  = new ChoiceHandler();

	public static void main(String[] args) {

		new Dark_Melody();
	}

	public Dark_Melody() {

		window = new JFrame();
		window.setSize(1280, 720);// กำหนดขนาดหน้าต่าง
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();

		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(250, 100, 800, 200);// กำหนดขนาดกรอบข้อความ
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Dark Melody");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(485, 350, 300, 150);
		startButtonPanel.setBackground(Color.black);

		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(StartFont);
		startButton.addActionListener(tsHandler);// รับข้อมูล "คลิก*คลิก*"

		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);

		con.add(titleNamePanel);
		con.add(startButtonPanel);
	}

	public void GameScreen() {

		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);

		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(10, 450, 1245, 90);//กำหนดขนาดกรอบ
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);

		mainTextArea = new JTextArea("This is the main text are.This game is going to be great. I'm sure of it!!!!!!");
		mainTextArea.setBounds(100, 100, 600, 250);// กำหนดขนาดกรอบข้อความ
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);

		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(10, 550, 1245, 120);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(1, 3));
		con.add(choiceButtonPanel);

		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);

		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);

		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		Story();

	}

	public void Story() {
		position = "town";
		mainTextArea.setText("Talk?");

		choice1.setText("No comment");
		choice2.setText("Attack");
		choice3.setText("Talk");
	}

	public void talk() {
		position = "talk";
		mainTextArea.setText("??");

		choice1.setText("Leave");
		choice2.setText("");
		choice3.setText("Fight?");
	}

	public void fight() {
		position = "fight";
		mainTextArea.setText("Um..");

		choice1.setText("Leave");
		choice2.setText("");
		choice3.setText(">");
	}

	public void NOT() {
		position = "Not";
		mainTextArea.setText("....");

		choice1.setText("Leave");
		choice2.setText("");
		choice3.setText(">");
	}

	public class TitleScreenHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			GameScreen();

		}
	}

	public class ChoiceHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			String yourChoice = event.getActionCommand();

			/*while (true) {
				if (yourChoice.equals("c1")) {
					talkGuard();
					break;
				}
				if (yourChoice.equals("c2")) {
					fightGuard();
					break;
				}
				if (yourChoice.equals("c3")) {
					Guard();
					break;
				}
			}*/

			switch (position) {
			case "town":
				switch (yourChoice) {
				case "c3":
					talk();
					break;
				case "c2":
					fight();
					break;
				case "c1":
					NOT();
					break;
				}
				break;
			case "talk":
				switch (yourChoice) {
				case "c3":
					fight();
					break;
				case "c1":
					Story();
					break;
				}
				break;
			case "fight":
				switch (yourChoice) {
				case "c1":
					Story();
					break;
				}
				break;
			case "Not":
				switch (yourChoice) {
				case "c1":
					Story();
					break;
				}
			}
		}
	}
}
