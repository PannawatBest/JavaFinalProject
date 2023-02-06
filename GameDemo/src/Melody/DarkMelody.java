package Melody;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				vm.titleToTown();
				story.townGate();
				break;
			case "howTo":
				vm.howToBack();
				story.howTo();
				break;
			case "exit":
				System.exit(0);
			case "c1":
				story.selectPosition(nextPosition1);
				break;
			case "c2":
				story.selectPosition(nextPosition2);
				break;
			case "c3":
				story.selectPosition(nextPosition3);
				break;

			case "cB":
				story.selectPosition(nextPositionB);
				break;
			}

		}
	}

}
