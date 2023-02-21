import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//lerTexto();
		try{
		    EntrevistadoVetor ev = Arquivo.getLinhas("arquivo.csv");
		    String relatorio1 = ev.geraRelatorio1();
		    System.out.println(relatorio1);
		}catch(Exception ex){
		    ex.printStackTrace();
		}

	}

	
	
}
