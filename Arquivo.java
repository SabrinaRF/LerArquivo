import java.io.*;

public class Arquivo {

	public static void gravar (String conteudo, String nomeArquivo) throws Exception {
		//abre o arquivo para escrita
		FileOutputStream outFile = new FileOutputStream (new File(nomeArquivo));
		BufferedWriter buff = new BufferedWriter (new OutputStreamWriter(outFile, "UTF-8"));

		//escreve no arquivo
		buff.write (conteudo);

		// fecha o arquivo
		buff.close ();  
		outFile.close ();
	}

	public static EntrevistadoVetor getLinhas (String nomeArquivo) throws Exception {
        // declaração das variáveis        
       	//abre o arquivo para leitura
       	String linha=null;
        FileInputStream inFile = new FileInputStream (new File(nomeArquivo));
        BufferedReader buff = new BufferedReader (new InputStreamReader(inFile, "UTF-8"));
        EntrevistadoVetor entVet = new EntrevistadoVetor();
		//lê as demais linhas do arquivo
		
		do{
		    try{
			linha = buff.readLine ();
			String dados[] = linha.split(";");
			Entrevistado entrevistado = new Entrevistado(dados[0],dados[1],dados[2],dados[3],dados[4],dados[5]);
			entVet.adiciona(entrevistado);
		    }catch(Exception ex){
		        ex.printStackTrace();
		    }
		}while (linha != null);
            
        //fecha o arquivo
        buff.close ();
        inFile.close ();
		
		return entVet;
    }
    
/*   public void  processaEntrevistados(String nomeArquivo){
        FileInputStream inFile = new FileInputStream (new File(nomeArquivo));
        BufferedReader buff = new BufferedReader (new InputStreamReader(inFile, "UTF-8"));
        
		//lê as demais linhas do arquivo
		do{
		    try{
			linha = buff.readLine ();
			String valores[] = linha.split(";");
			
		    }catch(Exception ex){
		        ex.printStackTrace();
		    }
		}while (linha != null);
            
        //fecha o arquivo
        buff.close ();
        inFile.close ();
        
        
        
    }*/ 
}