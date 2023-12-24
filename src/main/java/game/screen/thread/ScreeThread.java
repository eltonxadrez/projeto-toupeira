package game.screen.thread;

public class ScreeThread extends Thread{

public int velocidade = 100;
	
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
	
	public void run() {
		
		System.out.println("[Tarefa começou]");
//		printar(inicio);
		while (flag) {
			try {
//				giroCompleto();
//				printar(pedaco);
				printar(inicio);
				for (int i = 0; i < tamanho; i++) {
					printar(barra1);
				}
				for (int i = 100; i > tamanho; i--) {
					printar(espaco);
				}
				printar(termino);
				printar(espaco);
				for (int i = 0; i < tamanho; i++) {
					
				}
				printar(Integer.toString(tamanho));
				printar(porcento);
				
				resetar();
				if (tamanho == 100) {
					flag = false;
				}
				tamanho += 1;
				Thread.sleep(velocidade);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
//		printar(termino);
		System.out.println("\n[Tarefa terminou...]");
		
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
		printar(elemento);
		apagar();
		Thread.sleep(50);
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

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
