package herança;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Gerente gerente = new Gerente("Alcir", "123.456.789-00", formato.parse("15/08/1998"));
		
		gerente.setDados(3, "Gerente Alcir");
		
		System.out.println(gerente.toString());
		
	}

}
