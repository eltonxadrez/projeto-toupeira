package game.map;

public class Board {
	
	private char tabua [][];
	
	public Board() {
		tabua = new char [3][3];
		preencherTabua('X');
	}
	
	public void preencherTabua(char charactere) {
		
		for (int i = 0; i < tabua.length; i++) {
			for (int j = 0; j < tabua.length; j++) {
				tabua[i][j] = charactere;
			}
		}
		
	}
	
	public char[][] getTabua() {
		return tabua;
	}

	public void setTabua(char[][] tabua) {
		this.tabua = tabua;
	}

}
