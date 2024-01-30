import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class Exemplo3{
    public static void main(String args[]){
        int i;
        Fruta fruta01,
        fruta02 = new Fruta("Maça",0.25,Color.RED,8),
        fruta03 = new Fruta();
        
        fruta01 = new Fruta("Pera",0.25,  Color.YELLOW,9);
        fruta03.setNome("Mamão");
        fruta03.setPesoAproximado(0.6);
        fruta03.setCorPredominante(Color.ORANGE);
        fruta03.setTamanhoAproximado(20);
        
        ArrayList<Fruta> saladaDeFrutas = new ArrayList<>();
        
        saladaDeFrutas.add(new Fruta("Banana",0.15,Color.YELLOW,14));
        
        saladaDeFrutas.add(fruta01);
        saladaDeFrutas.add(new fruta());
        saladaDeFrutas.add(fruta02);
        saladaDeFrutas.add(new fruta("Melancia",3,color.GREEN,40));
        saladaDeFrutas.add(fruta03);
        
        System.out.println("------[Imprimindo o ArrayList pelo Índice]---\n");
        for(i = 0; i< saladaDeFrutas.size();i++){
            saladaDeFrutas.get(i).imprimir();
        }
        saladaDeFrutas.get(2).setNome("Jambo");
        saladaDeFrutas.get(2).setPesoAproximado(0.02);
        saladaDeFrutas.get(2).setCorPredominante(Color.YELLOW);
        saladaDeFrutas.get(2).setTamanhoAproximado(5);
        
        System.out.println("\n\n------[Imprimindo o ArrayList Após o " +
        "Preenchimento da Fruta na Posição 2]-----\n");
        
        Iterator it = saladaDeFrutas.iterator();
        while(it.hasNext()){
            Fruta fr = (Fruta)it.next();
            fr.imprimir();
            
            if(fr.getNome().equals("Melancia")){
                it.remove();
            }
        }
        saladaDeFrutas.remove(1);
        saladaDeFrutas.remove(fruta03);
        System.out.println("\n\n-------[Imprimindo o ArrayList sem a Melancia" +
        "e o Mamão]-------\n");
        for(i = 0; i<saladaDeFrutas.size();i++){
            saladaDeFrutas.get(i).imprimir();
        }
    }   
    }
}