import java.awt.Color;

public class Fruta{
    private String nome;
    private double pesoAproximado;
    private Color corPredominante;
    private int tamanhoAproximado;
    
    public Fruta(){
        this.nome = "";
        this.pesoAproximado = 0;
        this.corPredominante = Color.WHITE;
        this.tamanhoAproximado = 0;
    }
    public Fruta(String nome,double pesoAproximado,Color corPredominante,int tamanhoAproximado){
        this.nome = nome;
        this.pesoAproximado = pesoAproximado;
        this.corPredominante = corPredominante;
        this.tamanhoAproximado = tamanhoAproximado;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPesoAproximado(){
        return pesoAproximado;
    }
    public void setPesoAproximado(double pesoAproximado){
        this.pesoAproximado = pesoAproximado;
    }
        public Color getCorPredominante(){
        return corPredominante;
    }
    public void setCorpredominante(Color corPredominante){
        this.corPredominante = corPredominante;
    }
       public double getTamanhoAproximado(){
        return tamanhoAproximado;
    }
    public void setTamanhoAproximado(int tamanhoAproximado){
        this.tamanhoAproximado = tamanhoAproximado; 
    }
    public void imprimir(){
        System.out.println("Nome              :"+ nome);
        System.out.println("Peso aproximado   :"+pesoAproximado + "Kg.");
        System.out.println("Cor predominante  :"+nomeDaCor(corPredominante));
        System.out.println("tamanho aproximado:"+tamanhoAproximado + "cm.");
        System.out.println("---------------------------------------");
    }
    
        private String nomeDaCor(Color cor){
            String nomeCor = "";
            if(Color.BLACK){
                nomeCor = "Preta";
            }
            if(Color.BLUE){
                nomeCor = "Azul";
            }
            if(Color.WHITE){
                nomeCor = "Branca";
            }
            if(Color.YELLOW){
                nomeCor = "Amarela";
            }
            if(Color.GREEN){
                nomeCor = "Verde";
            }
            if(Color.ORANGE){
                nomeCor = "Laranja";
            }
            if(Color.GRAY){
                nomeCor = "Cinza";
            }
            if(Color.RED){
                nomeCor = "Vermelha";
            }
            return nomeCor;
        }
    }
     
  