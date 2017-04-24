package cap2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteCandlestickFactoryComUmaNegociacao {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();

		CandlestickFactory candlestickFactory = new CandlestickFactory();
		Negociacao negociacao = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao1 = new Negociacao(48.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(49.5, 100, hoje);
		

		List<Negociacao> negociacoes = Arrays.asList(negociacao, negociacao1, negociacao2);

		Candlestick candlestick = new CandlestickFactory().constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candlestick);
	}
}
