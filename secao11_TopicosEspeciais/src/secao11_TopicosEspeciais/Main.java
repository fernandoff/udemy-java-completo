package secao11_TopicosEspeciais;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args)  {
		// dates();
		//somarDataHora();
		obterParteData();
	}
	
	public static void obterParteData() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(d);
		
		int minutes = cal.get(Calendar.MINUTE); 
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes); System.out.println("Month: " + month);
	}
	
	public static void somarDataHora() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d); 
		cal.add(Calendar.HOUR, 4); 
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
	}
	
	public static void dates() throws ParseException{
		// dd/MM/yyyy
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("30/06/2018 15:42:07");	
		
		System.out.println("y1 = " + sdf1.format(y1));
		System.out.println("y2 = " + sdf2.format(y2));
		
		Date dataHoraAtual = new Date();
		System.out.println(sdf2.format(dataHoraAtual));
		
		Date dataHora = new Date(0L);
		System.out.println("Data hora original = " + sdf2.format(dataHora));
		
		Date dataHoraAsCinco = new Date(1000L * 60 * 60 * 5L);
		System.out.println("Data hora as cinco = " + sdf2.format(dataHoraAsCinco) + " - sai as duas, porque estamos no horario utc-3");
		
		Date dataUTC = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Data UTC = " + sdf2.format(dataUTC));
		
		System.out.println("------- GTM PRINT ------");		
		System.out.println(sdf3.format(dataHoraAtual));
		System.out.println("Data hora as cinco = " + sdf2.format(dataHoraAsCinco) + " - sai as duas, porque estamos no horario utc-3");
		System.out.println("Data UTC = " + sdf2.format(dataUTC));			
	}

}
