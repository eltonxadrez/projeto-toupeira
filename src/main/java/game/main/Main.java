package game.main;

import game.controller.Keyboard;
import game.controller.thread.KeyboardThread;
import game.screen.Screen;
import game.screen.thread.ScreenThread;

public class Main {

	public static void main(String[] args) {
//		Screen screen = new Screen();
//		screen.printarTabuleiro();
		
// 		int teste[][] = new int[3][3];
//		teste[0][0] = 1;
//		teste[0][1] = 2;
//		teste[0][2] = 3;
//		
//		teste[1][0] = 4;
//		teste[1][1] = 5;
//		teste[1][2] = 6;
//		
//		teste[2][0] = 7;
//		teste[2][1] = 8;
//		teste[1][2] = 9;
//		
//		
//		System.out.println(teste[0][0] +""+ teste[0][1] +""+ teste[0][2]);
		
		ScreenThread screenThread = new ScreenThread();
		screenThread.start();
		
//		KeyboardThread keyboardThread = new KeyboardThread();
//		keyboardThread.start();

	}

}
