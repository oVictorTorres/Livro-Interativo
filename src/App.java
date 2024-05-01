import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Personagens Nickira = new Personagens("Nickira", 100);
        Personagens Bafomé = new Personagens("Bafomé", 100);
        System.out.println(Nickira.nome + Bafomé.nome);
        Capitulo Capitulo1 = new Capitulo("Nickira", "Bafomé",
                "CAPÍTULO 1.(PRÓLOGO)\n Você se chama Nickira , e está em uma trilha pela floresta, você perde a hora e fica de noite de repente com uma grande chuva, você deve ir em busca de algum lugar para se abrigar...\n Você encontra uma fazenda e toca a campainha, um senhorzinho chamado Bafomé atende e chama você para entrar. \n Qual sua decisão? Entrar na casa(Entrar) ou Ir para o celeiro escondido(Celeiro)",
                 "ENTRAR", "CELEIRO", 100, input);
        Capitulo Capitulo2 = new Capitulo("Nickira", "Bafomé",
                 "Você adentra a casa. \n Você irá dormir na cadeira(Cadeira) ou no quarto de hóspedes?(Quarto)",
                  "CADEIRA", "QUARTO", 100, input);
        Capitulo Capitulo3 = new Capitulo("Nickira", "Bafomé",
                  "Você dormiu na cadeira e notou que Bafomé estava observando você na escuridão. O que ele quer?\nVocê ficou com medo e não conseguiu dormir mais.(-5 sanidade) ",
                   null, null, 95, input);
        Capitulo Capitulo4 = new Capitulo("Nickira", "Bafomé",
                  "Você dormiu no quarto de hóspedes e acabou achando algo estranho atrás de um quadro, símbolos estranhos de uma antiga religião celta. O que é aquilo?(-5 sanidade)\n ",
                   null, null, 95, input);
        Capitulo Capitulo5 = new Capitulo("Nickira", "Bafomé",
        "Você vai de fininho até o celeiro e acha um jeito de entrar e dorme no feno, com frio.(-5 sanidade)\n",
                    null, null, 95, input);
        
        Capitulo1.mostrar();
        String resp1 = Capitulo1.escolher();
        if (resp1.toUpperCase().equals(Capitulo1.resp1)) {
            Capitulo2.mostrar();
            String resp2 = Capitulo2.escolher();
            if (resp2.toUpperCase().equals(Capitulo2.resp1)){
                Capitulo3.mostrar();
                Nickira.alteracaoEnergia();
            }
            else if (resp2.toUpperCase().equals(Capitulo2.resp2)) {
                Capitulo4.mostrar();
                Nickira.alteracaoEnergia();
            }
        }
        else if (resp1.toUpperCase().equals(Capitulo1.resp2)) {
            Capitulo5.mostrar();
            Nickira.alteracaoEnergia();
        }
        input.close();
    }
}
