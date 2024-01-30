import java.util.ArrayList;
import java.util.List;

public class Numero {
	private int valor;
	
	public Numero(int valor) {
		this.valor = valor;
	}
	
	public boolean ehPrimo() {
		for (int i = 2; i <= valor/2; i++)
			if (valor % i == 0)
				return false;
		return true;
	}
	
	public boolean ehPerfeito() {
		int soma = 0;
		for (int i = 1; i <= valor/2; i++)
			if (valor % i == 0)
				soma += i;
		return soma == valor;
	}
	
	public boolean ehFeliz() {
		int calculado = valor;
		List<Integer> anteriores = new ArrayList<Integer>();
		while (calculado != 1) {
			int velhoCalculado = calculado;
			calculado = 0;
			for (int n: partes(velhoCalculado))
				calculado += n * n;
			if (anteriores.contains(calculado))
				return false;
			anteriores.add(calculado);
		}
		return true;
	}
	
	private int[] partes(int numero) {
		String strValor = String.valueOf(numero);
		int[] partes = new int[strValor.length()];
		for (int i = 0; i < strValor.length(); i++)
			partes[i] = Integer.parseInt(String.valueOf(strValor.charAt(i)));
		return partes;
	}
}