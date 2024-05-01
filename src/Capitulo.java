import java.util.Scanner;
public class Capitulo {
    String personagem1;
    String personagem2;
    String texto; 
    String resp1;
    String resp2;
    int sanidade;
    Scanner input;

  public Capitulo(String personagem1,
        String personagem2,         
        String texto,  
        String resp1, 
        String resp2,
        int sanidade, 
        Scanner input) 
        {
            this.personagem1 = personagem1;
            this.personagem2 = personagem2;
            this.texto = texto;
            this.resp1 = resp1;
            this.resp2 = resp2;
            this.sanidade = sanidade;
            this.input = input;
        }
  void mostrar() {
       System.out.println(texto);
     }
     String escolher() {
      String escolha = input.nextLine();
      return escolha;
     }
}