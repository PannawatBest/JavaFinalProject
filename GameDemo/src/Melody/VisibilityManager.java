package Melody;

public class VisibilityManager {
	UI ui;

	public VisibilityManager(UI userInterface) {
		ui = userInterface;
	}

	public void showTitlescreen() {

		// Show the title screen
		ui.titleNamePanel.setVisible(true);
		ui.subtitleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		ui.exitButtonPanel.setVisible(true);

		// Hide the game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
	}

	public void titleToTown() {

		// Hide the title screen
		ui.titleNamePanel.setVisible(false);
		ui.subtitleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(false);

		// Show the game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
	}
}
