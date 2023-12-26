package game.screen;

import java.io.IOException;

import game.controller.Keyboard;
import game.map.Board;

public class Screen {
	
	private Board board;
//	private Keyboard keyboard;
	
	public Screen() {
		this.board = new Board();
//		this.keyboard = new Keyboard();
	}
	
	public void printarTabuleiro(int x, int y, char chara) {
//		while (true) {
			this.board.preencherTabua('·');
			this.atualizarHeroiPos( x,  y,  chara);
			this.printBoard();
//			this.pausa(1000);
//			this.cls();
//			this.printBoard('O');
//			this.pausa(100);
//			this.cls();
			
//		}
	}
	
	public void atualizarHeroiPos(int x, int y, char chara) {
//		for (int i = this.keyboard.getPosHeroiX(); i < 3; i++) {
//			for (int j = this.keyboard.getPosHeroiY(); j < 3; j++) {
//				tabua[i][j] = charactere;
				this.board.getTabua()[y][x] = chara;
//				System.out.println(x);
//				System.out.println(y);
//				System.out.println(chara);
//			}
//		}
	}
	
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void printBoard() {
//		this.board.preencherTabua(chara);
		
		System.out.println(cel(0, 0) +""+ cel(0, 1) +""+ cel(0, 2)+"\n"+
						   cel(1, 0) +""+ cel(1, 1) +""+ cel(1, 2)+"\n"+
						   cel(2, 0) +""+ cel(2, 1) +""+ cel(2, 2));
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.print(cel(i, j));
//			}
//			System.out.print("\n");
//		}
	}
	
	

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	private String cel (int x, int y) {
		return ""+this.board.getTabua()[x][y];
	}
	
//	public static void clearConsole() {
//	    try {
//
//	        if (System.getProperty("os.name").contains("Windows"))
//	            new ProcessBuilder("cmd", "/c", 
//	                     "cls").inheritIO().start().waitFor();
//	        else
//	            Runtime.getRuntime().exec("clear");
//	       } catch (IOException | InterruptedException ex) {}
//	}
	
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
