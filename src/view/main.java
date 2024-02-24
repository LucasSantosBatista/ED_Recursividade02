package view;

import controller.DivisaoController;

public class main {

	public static void main(String[] args) {
		int dividendo = 18;
		int divisor = 4;
		
		DivisaoController dCont = new DivisaoController();

		int divisao = dCont.divisao(dividendo, divisor);
		System.out.println(divisao);
	}

}
