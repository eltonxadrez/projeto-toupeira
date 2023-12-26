package game.controller;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.keyboard.event.GlobalKeyListener;

public class Keyboard implements GlobalKeyListener {
	
//	private Integer velocidade = 1000;
//	private boolean direita = false;
//	public Integer teclaApertada = 0;
	
	private char heroi;
	private int posHeroiX;
	private int posHeroiY;
	
//	private boolean rawInput;
//	private GlobalKeyboardHook keyboardHook; 
	
	public Keyboard() {
//		this.keyboardHook.addKeyListener(this);
		this.heroi = '█';
		this.posHeroiX = 0;
		this.posHeroiY = 0;
	}
	
	@Override
	public void keyPressed(GlobalKeyEvent event) {
//		System.out.print(event.getVirtualKeyCode());
//		if(event.getVirtualKeyCode()==39) {
//			this.posHeroiX++;
//			System.out.println("heroi" + posHeroiX);
//			System.out.print("direita aperta");
//			direita = true;
//			System.out.print("\r");
//		}
		switch (event.getVirtualKeyCode()) {
		case 37://ESQUERDA
			if (this.posHeroiX > 0 ) {
				this.posHeroiX--;
			}
//			System.out.println("heroi" + posHeroiX);
			break;
		case 38://CIMA
			if (this.posHeroiY > 0 ) {
				this.posHeroiY--;
			}
//			System.out.println("heroi" + posHeroiY);
			break;
		case 39://DIREITA
			if (this.posHeroiX < 2 ) {
				this.posHeroiX++;
			}
//			System.out.println("heroi" + posHeroiX);
			break;
		case 40://BAIXO
			if (this.posHeroiY < 2 ) {
				this.posHeroiY++;
			}
//			System.out.println("heroi" + posHeroiY);
			break;
		}
//		try {
//			Thread.sleep(velocidade);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//teste
	}

	@Override
	public void keyReleased(GlobalKeyEvent event) {
//		System.out.print(event.getVirtualKeyCode());
//		if(event.getVirtualKeyCode()==39) {
//			System.out.print("direita solta");
//			direita = false;
//			System.out.print("\r");
//		}
//		System.out.print("\r");
	}

//	public boolean isDireita() {
//		return direita;
//	}
//
//	public void setDireita(boolean direita) {
//		this.direita = direita;
//	}

	public char getHeroi() {
		return heroi;
	}

	public void setHeroi(char heroi) {
		this.heroi = heroi;
	}

	public int getPosHeroiX() {
		return posHeroiX;
	}

	public void setPosHeroiX(int posHeroiX) {
		this.posHeroiX = posHeroiX;
	}

	public int getPosHeroiY() {
		return posHeroiY;
	}

	public void setPosHeroiY(int posHeroiY) {
		this.posHeroiY = posHeroiY;
	}
	
}
