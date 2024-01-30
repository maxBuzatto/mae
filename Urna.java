import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;         

public class Urna {
    private static Iterable<String> arrayList;

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Scanner console = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("  ====CADASTRAMENTO DOS CANDITADOS===   ");
            System.out.println("1. CADASTRAR DO CANDIDATO:   ");
            System.out.println("2. LISTAR CANDIDATOS:     ");
            System.out.println(" ESCOLHA UMA OPCAO   ");
            int opcao = console.nextInt();

            if (opcao == 1) {
                    System.out.println("INFORME O NOME DO CANDIDATO");
                    String nome = console.next();
                    System.out.println("INFORME A SIGLA DO PARTIDO");
                    String sigla = console.next();
                    System.out.println("INFORME O NUMERO DO CANDIDATO");
                    String numero = console.next();

                    //Cadastrar candidato
                    Candidato candidatoa = new Candidato(nome, sigla, numero);
                    Candidato candidatob = new Candidato(nome, sigla, numero);

                    List<String> lista = new ArrayList<String>();

                    //Adiciona candidato

                    lista.add(candidatoa);
                    lista.add(candidatob);


                    if (opcao ==2){
                        for (String i : lista){
                            System.out.println(i);
                        }
                    }

                }


                }
        }
    }