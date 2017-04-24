package cap2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Deque;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class TestaCandlestckFactory {
	public static void main(String[] args) {
		Candlestick candle = new CandleBuilder().comAbertura(40.5).comFechamento(45.0).
				comMinimo(39.8).comMaximo(45.0).comVolume(145234.20).
				comData(new GregorianCalendar(2017, 10, 10)).geraCandle();
		
				
		System.out.println(candle.toString());
		
		
							
		/*
		 * Calendar hoje = Calendar.getInstance(); 
		 * Negociacao negociacao1= new
		 * Negociacao(40.5, 100, hoje); Negociacao negociacao2 = new
		 * Negociacao(45.0, 100, hoje); Negociacao negociacao3 = new
		 * Negociacao(39.0, 100, hoje); Negociacao negociacao4 = new
		 * Negociacao(42.5, 100, hoje);
		 * 
		 * List<Negociacao> negociacoes = Arrays.asList(negociacao1,
		 * negociacao2, negociacao3, negociacao4);
		 * 
		 * CandlestickFactory fabrica = new CandlestickFactory(); Candlestick
		 * candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		 */
		

	}
}