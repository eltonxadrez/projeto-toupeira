package game.screen;

import java.io.IOException;

import game.map.Board;

public class Screen {
	
	private Board board;
	
	public Screen() {
		board = new Board();
	}
	
	public void printarTabuleiro() {
		while (true) {
			this.printBoard('*');
		    System.out.flush();
//			System.out.print("\r");  
			this.pausa(100);
			System.out.print("\033[H\033[2J");  
			
		}
	}
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printBoard(char chara) {
		this.board.preencherTabua(chara);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cel(i, j));
			}
			System.out.print("\n");
		}
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
	
	public static void clearConsole() {
	    try {

	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", 
	                     "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	       } catch (IOException | InterruptedException ex) {}
	}

}
