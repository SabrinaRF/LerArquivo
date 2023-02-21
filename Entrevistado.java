public class Entrevistado {
    private String genero;
    private String idade;
    private String grauE;
    private String regiao;
    private String tecnologia;
    private String areaPrioritaria;
    
    public Entrevistado (String genero, String idade,String grauE, String regiao, String tecnologia, String areaPrioritaria ){                   //construtor 
        this.genero = genero;
        this.idade= idade;
        this.grauE= grauE;
        this.regiao = regiao;
        this.tecnologia = tecnologia;
        this.areaPrioritaria = areaPrioritaria;
    }
    
    
    // genero
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    // idade
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getIdade(){
        return idade;
    }
    
    // escolaridade
    public void setGrauE(String grauE){
        this.grauE = grauE;
    }
    
    public String getGrauE(){
        return grauE;
    }
    
    //regiao
    public void setRegiao(String regiao){
        this.regiao = regiao;
    }
    
    public String getRegiao(){
        return regiao;
    }
    
     //tecnologia
    public void setTecnologia(String tecnologia){
        this.tecnologia = tecnologia;
    }
    
    public String getTecnologia(){
        return tecnologia;
    }
    
    //areaPrioritaria
    public void setAreaPrioritaria(String areaPrioritaria){
        this.areaPrioritaria = areaPrioritaria;
    }
    
    public String getAreaPrioritaria(){
        return areaPrioritaria;
    }
     public boolean isFeminino(){
        if(this.genero.equals("f")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isMasculino(){
        if(this.genero.equals("m")){
            return true;
        }else{
            return false;
        }
    }
    
        public boolean isOutro(){
        if(this.genero.equals("o")){
            return true;
        }else{
            return false;
        }
    }
    //idade
    public boolean ate15Anos(){
        if(this.idade.equals(" Até 15 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean de16A29Anos(){
        if(this.idade.equals(" De 16 a 29 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean de39A59Anos(){
        if(this.idade.equals(" De 30 a 59 anos")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean acimaDe60Anos(){
        if(this.idade.equals(" Acima de 60 anos")){
            return true;
        }else{
            return false;
        }
    }
    
}