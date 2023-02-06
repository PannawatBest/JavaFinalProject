package Melody;

public class Story {

	DarkMelody game;
	UI ui;
	VisibilityManager vm;
	Player player = new Player();

	public Story(DarkMelody g, UI userTnterface, VisibilityManager vManager) {

		game = g;
		ui = userTnterface;
		vm = vManager;

	}

	public void defaulSetup() {
		player.hp = 0;
		ui.hpNumberLabel.setText("" + player.hp);
	}

	public void selectPosition(String nextPosition) {

		switch (nextPosition) {
		case "talkGuard":
			talkGuard();
			break;
		case "attackGuard":
			attackGuard();
			break;
		case "crossRoad":
			crossRoad();
			break;
		case "punchGuard":
			attackGuard();
			break;
		case "backRoad":
			townGate();
			break;
		case "Back":
			vm.showTitlescreen();
			break;
		}
	}

	public void howTo() {
		ui.mainTextArea.setText("วิธีการเล่น");
		ui.choiceB.setText("Back");

		game.nextPositionB = "Back";
	}

	public void townGate() {
		ui.mainTextArea.setText("Talk>Attack<Cross");
		ui.choice1.setText("Talk");
		ui.choice2.setText("Attack");
		ui.choice3.setText("Cross");

		game.nextPosition1 = "talkGuard";
		game.nextPosition2 = "attackGuard";
		game.nextPosition3 = "crossRoad";
	}

	public void talkGuard() {
		ui.mainTextArea.setText("Open it");
		ui.choice1.setText("Punch");
		ui.choice2.setText("Stay");
		ui.choice3.setText("Back");

		game.nextPosition1 = "punchGuard";
		game.nextPosition2 = "stayGuard";
		game.nextPosition3 = "backRoad";
	}

	public void attackGuard() {
		ui.mainTextArea.setText("HIT");
		player.hp = player.hp + 10;
		ui.hpNumberLabel.setText("" + player.hp);
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("Back");

		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "backRoad";
	}

	public void crossRoad() {
		ui.mainTextArea.setText("GG GUY");
		ui.choice1.setText("GG");
		ui.choice2.setText("GGG");
		ui.choice3.setText("GGGG");

		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
	}

}
