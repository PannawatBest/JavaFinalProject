package Melody;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DarkMelody {

	ChoiceHandler cHandler = new ChoiceHandler();
	UI ui = new UI();
	VisibilityManager vm = new VisibilityManager(ui);
	Story story = new Story(this, ui, vm);

	String nextPosition1, nextPosition2, nextPosition3, nextPositionB;

	public static void main(String[] args) {
		new DarkMelody();
	}

	public DarkMelody() {
		ui.createUI(cHandler);
		story.defaulSetup();
		vm.showTitlescreen();
	}

	public class ChoiceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			String yourChoice = event.getActionCommand();

			switch (yourChoice) {
			case "start":
				vm.MainStory();
				try {
					story.heading();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "Dc":
				vm.Description();
				story.Description();
				break;
			case "cB":
				try {
					story.selectPosition(nextPositionB);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "exit":
				System.exit(0);

			case "c1":
				try {
					story.selectPosition(nextPosition1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "c2":
				try {
					story.selectPosition(nextPosition2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "c3":
				try {
					story.selectPosition(nextPosition3);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			}

		}
	}

}
