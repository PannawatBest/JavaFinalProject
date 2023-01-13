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
		ui.hpNumberLabel.setText(""+player.hp);
	}
	public void selectPosition(String nextPosition) {
		
		switch(nextPosition) {
		case "townGate":	townGate(); break;
		case "talkGuard" : 	talkGuard(); break;
		case "attackGuard" :attackGuard(); break;
		case "crossRoad" :  crossRoad(); break;
		}
		
	}
	
	
	public void townGate() {
		ui.mainTextArea.setText("You are at the gate of the town.");
		ui.choice1.setText("talk");
		ui.choice2.setText("attack");
		ui.choice3.setText("cross");
		
		game.nextPosition1 = "talkGuard";
		game.nextPosition2 = "attackGuard";
		game.nextPosition3 = "crossRoad";
	}
	public void talkGuard() {
		ui.mainTextArea.setText("Guard: Hello");
		ui.choice1.setText(">");
		ui.choice2.setText("");
		ui.choice3.setText("");
		
		game.nextPosition1 = "townGate";
		game.nextPosition2 = "";
		game.nextPosition3 = "";
		
	}
	public void attackGuard() {
		
	}
	public void crossRoad() {
	
}
	

}
