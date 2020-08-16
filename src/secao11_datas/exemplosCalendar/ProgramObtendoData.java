package secao11_datas.exemplosCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramObtendoData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//instanciando calendar
		Calendar cal = Calendar.getInstance();
		//chamando e setando a data da variavel "d"
		cal.setTime(d);		
		//pega a quantidade de minutos da data
		int minutes = cal.get(Calendar.MINUTE);
		//pega a quantidade de mes da data
		//como ele pega a posição então precisa somar 1 + o get para ele trazer certo
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		

	}

}
