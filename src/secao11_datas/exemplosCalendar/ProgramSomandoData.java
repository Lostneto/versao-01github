package secao11_datas.exemplosCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramSomandoData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//instanciando calendar
		Calendar cal = Calendar.getInstance();
		//chamando e setando a data da variavel "d"
		cal.setTime(d);		
		//acrecentando 4 horas a data
		//obs: pode utilizar qualquer unidade de tempo
		cal.add(Calendar.HOUR_OF_DAY, 4);
		//pega a data atualizada
		d = cal.getTime();
		//imprimindo a data
		System.out.println(sdf.format(d));
		

	}

}
