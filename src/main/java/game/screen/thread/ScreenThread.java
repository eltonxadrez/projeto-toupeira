package game.screen.thread;

import java.io.IOException;

import game.controller.Keyboard;
import game.screen.Screen;
import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyEvent;
import lc.kra.system.keyboard.event.GlobalKeyListener;

public class ScreenThread extends Thread{

	public int velocidade = 75;
	
	String pedaco = "=";
	String espaco = " ";
	
	String inicio = "[";
	String termino = "]";
	
	String zero = "0";
	String um = "1";
	String dois = "2";
	String tres = "3";
	String quatro = "4";
	String cinco = "5";
	String seis = "6";
	String sete = "7";
	String oito = "8";
	String nove = "9";
	
	String porcento = "%";
	
	String barra1 = "-";
	String barra2 = "\\";
	String barra3 = "|";
	String barra4 = "/";
			
	int tamanho = 0;
	boolean flag = true;
	
	private Screen screen = new Screen();
	
	private boolean rawInput;
	private GlobalKeyboardHook keyboardHook; 
	private Keyboard keyboard = new Keyboard();
	
	private void iniciar() {
		rawInput = true;
		keyboardHook = new GlobalKeyboardHook(rawInput);
		keyboard = new Keyboard();
	}
	
	public void run() {
		iniciar();
//		this.keyboard.start();
//		keyboard = new Keyboard();
		keyboardHook.addKeyListener(keyboard);
//		System.out.println("[Tarefa começou]");
//		printar(inicio);
		while (flag) {
			cls();
			screen.printarTabuleiro(keyboard.getPosHeroiX(), keyboard.getPosHeroiY(), keyboard.getHeroi());
			try {
//				giroCompleto();
//				printar(pedaco);
//				printar(inicio);
//				for (int i = 0; i < tamanho; i++) {
//					printar(barra1);
//				}
//				for (int i = 100; i > tamanho; i--) {
//					printar(espaco);
//				}
//				printar(termino);
//				printar(espaco);
//				for (int i = 0; i < tamanho; i++) {
//					
//				}
//				printar(Integer.toString(tamanho));
//				printar(porcento);
//				
//				resetar();
//				if (tamanho == 100) {
//					flag = false;
//				}
//				tamanho += 1;
				Thread.sleep(velocidade);
			} catch (InterruptedException e) {
//				 TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
//		printar(termino);
//		System.out.println("\n[Tarefa terminou...]");
		
	}
	
	public void addLine(String texto, String particula) {
		texto = texto + particula;
	}
	public void printar(String texto) {
		System.out.print(texto);
	}
	public void apagar() {
		System.out.print("\b");
	}
	public void giro(String elemento) throws InterruptedException {
//		printar(elemento);
//		apagar();
//		Thread.sleep(50);
	}
	public void giroCompleto() throws InterruptedException {
		giro(barra1);
		giro(barra2);
		giro(barra3);
		giro(barra4);
		giro(barra1);
	}
	public void resetar() {
		printar("\r");
	}

//	public int getVelocidade() {
//		return velocidade;
//	}
//
//	public void setVelocidade(int velocidade) {
//		this.velocidade = velocidade;
//	}

//	@Override
//	public void keyPressed(GlobalKeyEvent event) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyReleased(GlobalKeyEvent event) {
//		// TODO Auto-generated method stub
//		
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
