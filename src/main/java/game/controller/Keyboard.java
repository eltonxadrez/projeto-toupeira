package game.controller;

import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.keyboard.event.GlobalKeyListener;

public class Keyboard  implements GlobalKeyListener {
	
//	private Integer velocidade = 1000;
	private boolean direita = false;
	@Override
	public void keyPressed(GlobalKeyEvent event) {
//		System.out.print(event.getVirtualKeyCode());
		if(event.getVirtualKeyCode()==39) {
//			System.out.print("direita aperta");
			direita = true;
//			System.out.print("\r");
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
		if(event.getVirtualKeyCode()==39) {
//			System.out.print("direita solta");
			direita = false;
//			System.out.print("\r");
		}
//		System.out.print("\r");
	}

	public boolean isDireita() {
		return direita;
	}

	public void setDireita(boolean direita) {
		this.direita = direita;
	}

}
