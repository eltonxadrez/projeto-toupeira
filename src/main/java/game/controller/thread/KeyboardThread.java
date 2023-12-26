package game.controller.thread;

import java.io.IOException;

import game.controller.Keyboard;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.keyboard.event.GlobalKeyListener;

public class KeyboardThread extends Thread {
	
	//37 [down]
	//37 [up]
	//40 [down]
	//40 [up]
	//39 [down]
	//39 [up]
	//38 [down]
	//38 [up]
	
	private boolean rawInput;
	private GlobalKeyboardHook keyboardHook; 
	private Keyboard keyboard = new Keyboard();
	
//	private boolean direita = false;
	
	private Integer keyPressed = 0;
	
	public void run() {
		
//		iniciar();
		
		keyboardHook.addKeyListener(keyboard);
		
//		int tecla = 0;
//		switch (tecla) {
//		case 0:
//			System.out.println("0");
//			break;
//		case 1:
//			System.out.println("1");
//			break;
//		default:
//			break;
//		}
		
		while(true) { 
			
//			switch (keyboard.teclaApertada) {
//			case 39:
//				System.out.println("direita pressed");
//				this.cls();
//				break;
//
//			default:
////				keyPressed = 0;
////				System.out.println("nada");
////				this.cls();
////				break;
//			}
			
//			if(this.keyboard.isDireita()) {
//				System.out.print("direita");
//			}
//			else if(!this.tecladoAdapter.isDireita()) {
//				System.out.print("direita off");
//			}
			
//			System.out.print("\f");
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		}
		
	}
	
	private void iniciar() {
		rawInput = true;
		keyboardHook = new GlobalKeyboardHook(rawInput);
		keyboard = new Keyboard();
	}

	public boolean isRawInput() {
		return rawInput;
	}

	public void setRawInput(boolean rawInput) {
		this.rawInput = rawInput;
	}

//	@Override
//	public void keyPressed(GlobalKeyEvent event) {
//		System.out.println(event);
//		
//	}
//
//	@Override
//	public void keyReleased(GlobalKeyEvent event) {
//		// TODO Auto-generated method stub
//		
//	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Integer getKeyPressed() {
		return keyPressed;
	}

	public void setKeyPressed(Integer keyPressed) {
		this.keyPressed = keyPressed;
	}

	
	public void cls(){
	    try {

	     if (System.getProperty("os.name").contains("Windows"))
	         new ProcessBuilder("cmd", "/c", 
	                  "cls").inheritIO().start().waitFor();
	     else
	         Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}
}
