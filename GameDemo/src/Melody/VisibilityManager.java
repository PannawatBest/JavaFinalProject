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
		ui.howToButtonPanel.setVisible(true);
		ui.choiceBackPanel.setVisible(false);

		// Hide the game screen
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
	}

	public void MainStory() {

		// Hide the title screen
		ui.titleNamePanel.setVisible(false);
		ui.subtitleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(false);
		ui.howToButtonPanel.setVisible(false);
		ui.choiceBackPanel.setVisible(false);

		// Show the game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
	}

	public void Description() {
		// Hide the title screen
		ui.titleNamePanel.setVisible(false);
		ui.subtitleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.exitButtonPanel.setVisible(false);
		ui.howToButtonPanel.setVisible(false);
		ui.choiceBackPanel.setVisible(true);

		// Show the game screen
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
	}
}
