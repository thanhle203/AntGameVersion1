package com.mycompany.a1prj;

import com.codename1.ui.Form;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;

public class Game extends Form {
	
	private GameWorld gw;
	
	public Game() {
		gw = new GameWorld();
		gw.init();
		play();
	}
	
	@SuppressWarnings("rawtypes")
	private void play() {
		
		Label myLabel = new Label ("Enter a Command: ");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		
		myTextField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				if(sCommand.length() != 0) {
					switch(sCommand.charAt(0)) {
						case 'x':
							gw.exit();
							break;
						case 'a':
							gw.accelerate();
							break;
						case 'b':
							gw.brake();
							break;
						case 'l':
							gw.left();
							break;
						case 'r':
							gw.right();
							break;
						case 'f':
							gw.foodCollision();
							break;
						case 'g':
							gw.spiderCollision();
							break;
						case 't':
							gw.clock();
							break;
						case 'd':
							gw.display();
							break;
						case 'm':
							gw.map();
							break;
						case '1':
							gw.flag(1);
							break;
						case '2':
							gw.flag(2);
							break;
						case '3':
							gw.flag(3);
							break;
						case '4':
							gw.flag(4);
							break;
						case '5':
							gw.flag(5);
							break;
						case '6':
							gw.flag(6);
							break;
						case '7':
							gw.flag(7);
							break;
						case '8':
							gw.flag(8);
							break;
						case '9':
							gw.flag(9);
							break;
						default :
							System.out.println("Error: Unknown Command");
							break;
					}
				
				} 
				
			}
			
		});
		
	}
	
	
	
}

