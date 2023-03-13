package Melody;

import java.io.*;

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
		player.rl = 0;
		ui.hpNumberLabel.setText("" + player.rl);
	}

	public void selectPosition(String nextPosition) throws IOException {

		switch (nextPosition) {
		case "main":
			mainStory();
			break;
		case "Next1":
			storyLine1();
			break;
		case "Next2":
			storyLine2();
			break;
		case "Next3":
			storyLine3();
			break;
		case "scene2_1":
			scene2_1();
			break;
		case "scene2_2":
			scene2_2();
			break;
		case "scene3_1":
			scene3_1();
			break;
		case "scene3_2":
			scene3_2();
			break;
		case "scene4_1":
			scene4_1();
			break;
		case "scene5_1":
			scene5_1();
			break;
		case "scene5_2":
			scene5_2();
			break;
		case "scene5_3":
			scene5_3();
			break;
		case "scene6_1":
			scene6_1();
			break;
		case "scene6_2":
			scene6_2();
			break;
		case "scene7_1":
			scene7_1();
			break;
		case "scene7_2":
			scene7_2();
			break;
		case "scene8_1":
			scene8_1();
			break;
		case "scene8_2":
			scene8_2();
			break;
		case "Back1":
			heading();
			break;
		case "Back":
			vm.showTitlescreen();
			break;
		}
	}

	public void Description() {
		ui.mainTextArea.setText("——————————————| แนวทางการเล่น |——————————————\r\n\n"
								+"เกมจะมีเนื้อหาให้ตัวผู้เล่นอ่าน และเมื่อผู้เล่นอ่านจบแล้ว ต้องตัดสินใจเพื่อเลือกตัวเลือกที่ต้องการ"
								+"ซึ่งตัวเลือกแต่ละตัวเลือกจะส่งผลต่อความสัมพันธ์ของตัวละคร\r\n"
								+ "และเส้นทางการดำเนินเรื่องจนถึงตอนจบของเรื่อง" );
		ui.choiceB.setText("ย้อนกลับ");

		game.nextPositionB = "Back";
	}

	public void heading() throws IOException {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src/Story/storyLine"));
			StringBuilder sb = new StringBuilder();
			String line = reader.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = reader.readLine();
			}
			reader.close();
			ui.mainTextArea.setText(sb.toString());
		} catch (IOException e) {
			// handle exception
			System.out.println("Error reading file: " + e.getMessage());
		}
		player.rl = player.rl = 0;
		ui.hpNumberLabel.setText("" + player.rl);
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText(">>");

		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "main";
	}

	public void mainStory() {
		ui.choice1.setVisible(true);
		ui.choice2.setVisible(true);
		ui.mainTextArea
				.setText("ม : หวัดดี นายชื่อไร \r\n" + "ซ : เราเซฟ นายอะ\r\n" + "ม : เรามาร์ค ไปคณะด้วยกันมั้ยเซฟ ");
		ui.choice1.setText("ได้ไปดิ");
		ui.choice2.setText("\"มาร์ค\" ไปก่อนเลย");
		ui.choice3.setText("ไม่อ่ะ ไม่เป็นไร");

		game.nextPosition1 = "Next1";
		game.nextPosition2 = "Next2";
		game.nextPosition3 = "Next3";
	}

	public void storyLine1() {
		ui.mainTextArea.setText("ห้อง709\r\n" + "ม : นั่งด้วยได้มั้ย\r\n" + "ซ : อืมได้\r\n"
				+ "ม : ว่าแต่เซฟมีเพื่อนคนอื่นอีกมั้ย\r\n" + "ซ : ไม่มีอะ เรามาคนเดียว\r\n"
				+ "ม : ช้าไปหน่อยแต่ยินดีที่ได้รู้จักนะ ตอนนั้นเรามัวแต่ชวนเดินด้วยกัน\r\n" + "ซ : ยินดีเช่นกัน\r\n"
				+ "ม : งั้นเราขอไลน์ไว้ได้มั้ย\r\n" + "ซ : ได้");
		player.rl = player.rl + 1;
		ui.hpNumberLabel.setText("" + player.rl);
		ui.choice1.setText("ชวนมาร์คไปทานข้าว");
		ui.choice2.setText("ไม่ชวน");
		ui.choice3.setVisible(false);
		// ui.choice3.setText("Back");

		game.nextPosition1 = "scene2_1";
		game.nextPosition2 = "scene2_2";
		// game.nextPosition3 = "Back1";
	}

	public void storyLine2() {
		ui.mainTextArea.setText("ห้อง709\r\n" + "ม : นั่งด้วยได้มั้ย\r\n" + "ซ : นั่งดิ\r\n"
				+ "ม : ว่าแต่เซฟมีเพื่อนคนอื่นอีกมั้ย\r\n" + "ซ : ไม่มีอะ เรามาคนเดียว\r\n"
				+ "ม : ช้าไปหน่อยแต่ยินดีที่ได้รู้จักนะ ตอนนั้นเรามัวแต่ชวนเดินด้วยกัน\r\n" + "ซ : ยินดีเช่นกัน\r\n"
				+ "ม : งั้นเราขอไลน์ไว้ได้มั้ย\r\n" + "ซ : ได้");
		
		ui.choice1.setText("ชวนมาร์คไปทานข้าว");
		ui.choice2.setText("ไม่ชวน");
		// ui.choice3.setText("Back");
		ui.choice3.setVisible(false);

		game.nextPosition1 = "scene2_1";
		game.nextPosition2 = "scene2_2";
		// game.nextPosition3 = "Back1";
	}

	public void storyLine3() {
		ui.mainTextArea.setText("ห้อง709 \r\n" + "ม: เซฟๆเราขอไลน์ไว้ติดต่อหน่อยดิ\r\n" + "ซ:โอเค");
		player.rl = player.rl - 1;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText(">>>");
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "scene3_1";
	}

	public void scene2_1() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ณ โรงอาหาร \r\n" + "ม : นายจะกินไร \r\n"
				+ "ซ : กินก๋วยเตี๋ยวร้านนั้น นายจะกินด้วยมั้ย\r\n" + "ม : โอเค\r\n" + "(หลังจากที่กินข้าวกันเสร็จ)\r\n"
				+ "ซ : เจอกันพรุ่งนี้นะ\r\n" + "ม : บายครับ");
		player.rl = player.rl + 1;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText(">>>");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "scene3_1";

	}

	public void scene2_2() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ซ : เจอกันพรุ่งนี้นะ\r\n" + "ม : บาย");
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText(">>>");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "scene3_1";

	}

	public void scene3_1() {
		// ui.choice1.setVisible(true);
		// ui.choice2.setVisible(true);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("——————————————| วันต่อมา |——————————————\r\n" + "\r\n" + "มหาลัยxxx 08:00น.\r\n"
				+ "ซ : มานานยัง\r\n" + "ม : สักพักแล้ว \r\n" + " \" 2 หนุ่มกำลังคุยกัน จู่ๆก็มีผญ.เข้ามาทัก \"\r\n"
				+ "??? :ชื่อไรกันอะ \r\n" + "ซ : เซฟครับ\r\n" + "ม : เรามาร์ค แล้วเธอชื่ออะไร\r\n"
				+ "??? : เฌอ ยินดีที่ได้รู้จัก\r\n" + "ซ,ม : ยินดีที่ได้รู้จัก\r\n" + "ม : เรียนคณะไร\r\n"
				+ "ฌ : คณะเดียวกันไง เมื่อวานก็เห็นหน้ากันอยู่\r\n" + "ม :ใครมันจะไปจำได้ \r\n"
				+ "ซ : อ่อ ที่อยู่นั่งข้างหน้าปะ\r\n" + "ฌ : เห้ย เรานั่งหลังจำผิดปะเนี่ย\r\n"
				+ "ซ : (งุนงง) อ้าว นั้นไม่ใช่เฌอหรอ\r\n" + "ม : อ้าวๆ ไปจำสาวที่ไหนมา\r\n"
				+ "ฌ : 555555 หยอกเล่นจ้าา เราเอง ปะขึ้นเรียนกัน");
		// ui.choice1.setText("f");
		// ui.choice2.setText("f");
		ui.choice3.setText(">>>");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "scene3_2";

	}

	public void scene3_2() {
		// ui.choice1.setVisible(true);
		// ui.choice2.setVisible(true);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("——————————————| จบคาบ |——————————————\r\n"
				+ "ฌ : โห่ มาคาบแรกก็ให้งานเลยหรอ ยังเรียนไม่รู้เรื่องเลยอะ\r\n"
				+ "ม : (ผู้ที่หลับทั้งคาบ) อ่าวชห.ละ มีงานด้วยหรอ\r\n" + "ฌ : เล่นหลับทั้งคาบเลยนะ มาร์คคุง\r\n"
				+ "ม : อ้าวๆคุณเฌอ จะมากล่าวหากันอย่างงี้ไม่ได้นะค้าบบ\r\n"
				+ "ซ : พอเลยทั้ง 2 คน อาจารย์เค้าให้จับกลุ่ม 3 คน ทำเกี่ยวกับxxx \r\n"
				+ "ม : เค้าให้ส่งวันไหน ค่อยทำก็ได้เนาะ\r\n" + "ฌ : ชิวสุดๆเลยนะ อาจารย์ให้ส่งเดือนหน้า\r\n"
				+ "ซ : เรื่องงานเราไว้คุยกันก็ได้ วันนี้เราเรียนกันเหนื่อยแล้ว\r\n"
				+ "ม : จริงที่สุดเลยค้าบเพื่อนเซฟ งั้นเราต้องไปหาอะไรกินกันแล้ว\r\n" + "ฌ : เอาดิ อยากกินอะไรหวานๆ\r\n"
				+ "ม :  งั้นก็ต้องเป็นมาร์คแล้วมั้ย\r\n" + "ฌ :ไม่อะ เราว่าเซฟหวานกว่า\r\n"
				+ "ซ : อะไรกัน หน้ามอมีร้านบิงซูอยู่ ไปมั้ย\r\n" + "ม,ฌ : ไปปปป");
		// ui.choice1.setText("f");
		// ui.choice2.setText("f");
		ui.choice3.setText(">>>");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "scene4_1";
	}

	public void scene4_1() {
		ui.choice1.setVisible(true);
		ui.choice2.setVisible(true);
		ui.mainTextArea.setText(" ——————————————| 1 ปีผ่านไป |——————————————\r\n" + "\r\n"
				+ "ความสัมพันธ์ของทั้ง 3 คน ก็เริ่มลึกซึ้งกันมากขึ้น สนิทสนมกันมากขึ้นจนทำให้เกิดความรู้สึกดีต่อกัน \r\n"
				+ "\r\n" + "เซฟชวนทั้ง2ไปเที่ยวแต่ว่าทั้งคู่ว่างไม่ตรงกัน ");
		ui.choice1.setText("ไปกับมาร์ค");
		ui.choice2.setText("ไปกับเฌอ");
		ui.choice3.setText("ไม่ไป นอนๆ");

		game.nextPosition1 = "scene5_1";
		game.nextPosition2 = "scene5_2";
		game.nextPosition3 = "scene5_3";

	}

	public void scene5_1() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.mainTextArea.setText(" ///โทรไปชวนมาร์ค///\r\n" + "ซ: ไปทะเลด้วยกันมั้ย \r\n" + "ม: ไปดิ กำลังเหงาเลย\r\n"
				+ "\r\n" + "ม : ช่วงนี้ไม่ค่อยได้เจอเลย ไปเที่ยวด้วยกันก็ดีนะ\r\n" + "ซ : อืม มีไรคุยด้วยเยอะเลย\r\n"
				+ "ม : งั้นเก็บกระเป๋ารอนะ  เจอกัน\r\n" + "ซ : คับ เจอกัน");
		player.rl = player.rl + 1;
		ui.hpNumberLabel.setText("" + player.rl);
		ui.choice3.setText(">>>");

		game.nextPosition3 = "scene6_1";

	}

	public void scene5_2() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.mainTextArea.setText("///โทรไปชวนเฌอ///\r\n" + "ซ: ไปทะเลด้วยกันมั้ย \r\n"
				+ "ฌ: ไปๆๆ กำลังหาคนไปเที่ยวด้วยพอดี\r\n" + "ฌ : ช่วงนี้ไม่ค่อยได้เจอเลย ไปเที่ยวด้วยกันก็ดีนะ\r\n"
				+ "ซ : คับ มีไรคุยด้วยเยอะเลย\r\n" + "ฌ : งั้นเก็บกระเป๋ารอนะ  เจอกันค่ะ\r\n" + "ซ : คับ เจอกัน");
		player.rl = player.rl - 1;
		ui.hpNumberLabel.setText("" + player.rl);
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText(">>>");
		

		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "scene6_2";
	}

	public void scene5_3() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.mainTextArea.setText(
				"สุดท้ายแล้วถึงแม้ทั้ง 3 คนจะไม่ได้ไปเที่ยวด้วยกัน แต่ก็ยังเป็นเพื่อนที่ดีต่อกัน ส่วนเฌอกับมาร์คทั้งคู่ได้ตกลงที่จะคบกัน ทั้งคู่ไปด้วยกันได้ดีแต่ตีกันทุกวัน ทำให้เซฟต้องคอยห้ามศึกอยู่เสมอ\r\n"
						+ "\n\n\rEnd");
		ui.choice1.setText("");
		ui.choice2.setText("");
		ui.choice3.setText("Main");

		game.nextPosition1 = "";
		game.nextPosition2 = "";
		game.nextPosition3 = "Back";
	}

	public void scene6_1() {
		ui.choice1.setVisible(true);
		ui.choice2.setVisible(true);
		ui.choice3.setVisible(false);
		ui.mainTextArea.setText("(ทั้ง 2 คนออกมานั่งดูท้องฟ้ายามค่ำคืนด้วยกัน)\r\n"
				+ "ม : วันนี้พระจันทร์สวยมากเลยเนอะ\r\n" + "ซ : (หันไปมองมาร์ค)มันก็สวยมานานแล้วนะ\r\n"
				+ "ม : อันนี้คือบอกชอบหรอ \r\n"
				+ "ซ :  อืม แอบชอบมาสักพักแล้ว ทั้งรอยยิ้ม ความใจดี ความใส่ใจ ทุกสิ่งทุกอย่างของมาร์ค มันทำให้เซฟรู้สึกดีที่มีมาร์คอยู่ข้างๆ มาร์ครู้มั้ยว่าตัวเองทำให้คนรอบข้างมีความสุขมากแค่ไหน แล้วมันก็ทำให้เซฟตกหลุมรักคนๆนี้ ตอนแรกเซฟก็ไม่รู้ว่าความรู้สึกนี้คืออะไรกันแน่ เพราะว่าพวกเราเป็นเพื่อนสนิทกัน มาร์คจะโอเคมั้ยถ้าเซฟจะขอเป็นมากกว่าเพื่อนสนิท(ชุบแป้งทอด)\r\n"
				+ "ม : (อึ้ง) โหเล่นใหญ่เลยนะเนี่ย เอาซะตั้งตัวไม่ทันเลย มาร์คก็พอจะดูออกอยู่บ้าง มาร์คโอเค มาร์คดีใจนะที่มาร์คได้เป็นเรื่องราวดีๆในชีวิตเซฟ \r\n"
				+ "ซ : ขอบคุณนะมาร์ค ");
		ui.choice1.setText("จับมือ");
		ui.choice2.setText("หอมแก้ม");
		ui.choice3.setText("");

		game.nextPosition1 = "scene7_1";
		game.nextPosition2 = "scene7_2";
		game.nextPosition3 = "";
	}

	public void scene7_1() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ม : แหนะ เนียนแต๊ะอั๋งหรอ\r\n" + "ซ : \"\"ยิ้มเขิน\"\" ");
		player.rl = player.rl + 1;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText("Main");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "Back";
	}

	public void scene7_2() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ม  : เอางี้หรอ ~~หอมแก้มคืน~~)\r\n" + "ซ : \"\"เขิน\"\" \r\n" + "\n\n\rEnd");
		player.rl = player.rl + 2;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText("Main");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "Back";
	}

	public void scene6_2() {
		ui.choice1.setVisible(true);
		ui.choice2.setVisible(true);
		ui.choice3.setVisible(false);
		ui.mainTextArea.setText("——————————————| ริมชายหาดตอนกลางคืน |——————————————\r\n"
				+ "(ทั้ง2คนออกมานั่งดูท้องฟ้ายามค่ำคืนด้วยกัน)\r\n" + "ฌ : วันนี้พระจันทร์สวยมากเลยเนอะ\r\n"
				+ "ซ : (หันไปมองเฌอ)มันก็สวยมานานแล้วนะ\r\n" + "ฌ : หะ คิดอะไรกับเฌอปะเนี่ย\r\n"
				+ "ซ :  อืม แอบชอบมาสักพักแล้ว ทั้งรอยยิ้ม ความใจดี ความใส่ใจ ทุกสิ่งทุกอย่างของเฌอ มันทำให้เซฟรู้สึกดีที่มีเฌออยู่ข้างๆ เฌอรู้มั้ยว่าตัวเองทำให้คนรอบข้างมีความสุขมากแค่ไหน แล้วมันก็ทำให้เซฟตกหลุมรักคนๆนี้ ตอนแรกเซฟก็ไม่รู้ว่าความรู้สึกนี้คืออะไรกันแน่ เพราะว่าพวกเราเป็นเพื่อนสนิทกัน เฌอจะโอเคมั้ยถ้าเซฟจะขอเป็นมากกว่าเพื่อนสนิท(ชุบแป้งทอด)\r\n"
				+ "ฌ : โอ๊ย เขินนะเนี่ยอยู่ดีๆก็มีหนุ่มมาบอกชอบ แต่เฌอก็รู้สึกดีกับเซฟเหมือนกันค่ะ เฌอดีใจนะที่จะได้เป็นคนนั้นของเซฟ \r\n"
				+ "ซ : ขอบคุณนะคะ");
		
		ui.choice1.setText("จับมือ");
		ui.choice2.setText("หอมแก้ม");
		// ui.choice3.setText("");

		game.nextPosition1 = "scene8_1";
		game.nextPosition2 = "scene8_2";
		// game.nextPosition3 = "";
	}

	public void scene8_1() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ฌ : แหนะ เนียนแต๊ะอั๋งหรอ\r\n" + "ซ : \"\"ยิ้มเขิน\"\" " + "\n\n\rEnd");
		player.rl = player.rl - 1;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText("Main");

		// game.nextPosition1 = "";
		// game.nextPosition2 = "";
		game.nextPosition3 = "Back";
	}

	public void scene8_2() {
		ui.choice1.setVisible(false);
		ui.choice2.setVisible(false);
		ui.choice3.setVisible(true);
		ui.mainTextArea.setText("ฌ  : ~~ตีแขนเซฟ~~ เซฟฟฟฟฟ~~~\r\n" + "ซ : \"\"ยิ้มกรุ้มกริ่ม\"\" \r\n" + "\r\n" + "End ");
		player.rl = player.rl - 2;
		ui.hpNumberLabel.setText("" + player.rl);
		// ui.choice1.setText("");
		// ui.choice2.setText("");
		ui.choice3.setText("Main");

		// game.nextPosition1 = "";
		/// game.nextPosition2 = "";
		game.nextPosition3 = "Back";
	}
}
