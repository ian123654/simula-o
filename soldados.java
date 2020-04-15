package simulação;

import java.util.Random;

public class soldados {
	public static void main(String[] args) {
		Random gerador = new Random();
		String[] nomes = { "soldado 1", "soldado 2", "soldado 3", "soldado 4" };
		int[] soldados = { 0, 0, 0, 0 };
		int[] fim = { -1, -1, -1, -1 };
		int over = 40;
		int corda;
		int abatidos = 0, vencedores = 0;

		// pensando que a corda está no meio do quadrante
		corda = gerador.nextInt(23) + 17;
		// validar a nossa corda
		while (corda <= 17 && corda >= 23) {
			corda = gerador.nextInt(23) + 17;
		}
		System.out.println(corda);
		boolean sucesso = false;
		int i = 0, z = 0;
		do {
			int aux;
			aux = gerador.nextInt(5) * 1;
			soldados[i] = soldados[i] + aux;
			if (fim[i] != -1) {
				i += 1;
			}
			if (soldados[i] == corda) {
				System.out.println("o " + nomes[i] + " caiu na armadilha");
				z += 1;
				soldados[i] = -3000;
				abatidos += 1;
				fim[i] = i;
			} else if (soldados[i] >= over) {
				System.out.println("o " + nomes[i] + " Chegou até a trincheira");
				z += 1;
				vencedores += 1;
				fim[i] = i;
			}
			i++;
			if (i == soldados.length) {
				i = 0;
			}

			if (z == soldados.length) {
				sucesso = true;
			}
		} while (sucesso == false);
		System.out.println("soldados abatidos = " + abatidos + " soldados vencedores = " + vencedores);

	}
}
