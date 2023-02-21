import java.io.*;
import java.util.Scanner;

public class EntrevistadoVetor{
    
   private Entrevistado[] entrevistados = new Entrevistado [300];
   private int posicao=0;
 
   public void setEntrevistados(Entrevistado[] entrevistados){
      this.entrevistados = entrevistados;
   }
   
   //public Entrevitado[] getEntrevistados(){
    //   return entrevistados;
   //}
   
   public void adiciona(Entrevistado ent){
       entrevistados[posicao++] = ent;
   }
   
   public String geraRelatorio1(){
       String str="Número de entrevistados=";
       int numero=0;
       for(int i=0; i < entrevistados.length; i++){
           if(entrevistados[i] == null){
               
           }else{
               numero++;
           }
       }
       return str+numero;
   }
}
