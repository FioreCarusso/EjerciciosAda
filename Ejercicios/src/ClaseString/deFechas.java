package ClaseString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class deFechas {

	public static void main(String[] args) throws ParseException {
		
		Date ahora = new Date();
		
		long ahoraLong = System.currentTimeMillis();      //te da la fecha en milisegundos y en un tipo de dato long
		
		
		ahora.setTime(ahoraLong);  //pasa el formato long a date
		long ahora2long = ahora.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");     //S.D.F formatea las fechas de la forma en que queremos
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yy");     //ingresa Date y sale String
		SimpleDateFormat sdf3 = new SimpleDateFormat("H:mm ss");
		
		System.out.println(ahora);
		System.out.println(ahoraLong);
System.out.println("Formato: " + sdf.format(ahora) );
System.out.println("Formato: " + sdf2.format(ahora));
System.out.println("Formato: " + sdf3.format(ahora));

Date noventas = sdf.parse("11/11/1990");     //obj date con la fecha parseada
                                             //parse convierte un String ingresado, y sale un Date


	
	}
}
