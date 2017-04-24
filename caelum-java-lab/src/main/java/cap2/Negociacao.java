package cap2;

import java.util.Calendar;

public final class Negociacao {
	private final double preco;
	private final int quantidade;
	private final Calendar data;

	public Negociacao(double preco, int quantidade, Calendar data) {
		if(data == null){
			throw new IllegalArgumentException("A data nao pode ser nula");
		}
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return data;
	}

	public double getVolume() {
		return preco * quantidade;
	}
}