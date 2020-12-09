package deitelCapitulo16.examples.comparator;

import java.util.Comparator;

import deitelCapitulo8.example.Time2;

public class TimeComparator implements Comparator<Time2> {

	@Override
	public int compare(Time2 o1, Time2 o2) {
		int diferencaHora = o1.getHour() - o2.getHour();

		if (diferencaHora != 0)
			return diferencaHora;

		int diferencaMinuto = o1.getMinute() - o2.getMinute();

		if (diferencaMinuto != 0)
			return diferencaMinuto;

		int diferencaSegundo = o1.getSecond() - o2.getSecond();
		return diferencaSegundo;
	}
}
