package secao11_datas.exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//alterando o timezone padrão UTC para o GMT
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Date() = imprime o momento atual da execução do sysout
		Date x1 = new Date();
		//Date(System.currentTimeMillis()) = pega o tempo do S.O e converte e milissegundos 
		Date x2 = new Date(System.currentTimeMillis());
		//Date(0L)= imprime a primeira data armazenada no objeto date que se iniciou em 01/01/1970, porém com 3 horas antes por causa do fuso UTC 
		Date x3 = new Date(0L);
		//Date(1000L * 60L * 60L * 5L) = imprime o resultado de (1000milissegundos=1segundo) multiplicado por 60 para dar 1 minuto
		//multiplica por 60 para dar 1 hora
		//por fim multiplica por 5 para dar 5 horas da primeira data 01/01/1970
		//o "L" é para especificar tipo primitivo long
		//vai imprimir a diferença de fuso UTC
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//imprime o tipo padrão do java
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		//formata de acordo com os parametros da instância do objeto "SimpleDateFormat" UTC
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		//formata de acordo com os parametros da instância do objeto "SimpleDateFormat" GMT
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}

}
