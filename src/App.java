import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Personagens atributos = new Personagens();

        atributos.nome1 = "Nickira";
        atributos.sanidade1 = 100;
        atributos.nome2 = "Bafomé";
        atributos.sanidade2 = 100;
        System.out.println("CAPÍTULO 1.");
        System.out.println("\n Você se chama " + atributos.nome1
                + ", e está em uma trilha pela floresta, você perde a hora e fica de noite de repente com uma grande chuva, você deve ir em busca de algum lugar para se abrigar... ");
        System.out.println("\n Você encontra uma fazenda e toca a campainha, um senhorzinho chamado " + atributos.nome2
                + " atende e chama você para entrar. Qual sua decisão?");
        System.out.println(
                "\n Entrar na casa(Entrar), Recusar e ficar do lado de fora(Recusar) ou Ir para o celeiro escondido(Celeiro).");

        String resp1 = input.nextLine();

        if (resp1.toUpperCase().equals("ENTRAR")) {
            System.out.println("Você adentra a casa.");
            System.out.println("Você irá dormir na cadeira(Cadeira) ou no quarto de hóspedes?(Quarto)");
            String resp2 = input.nextLine();
            if (resp2.toUpperCase().equals("CADEIRA")) {
                System.out.println("Você dormiu na cadeira e notou que " + atributos.nome2
                        + " estava observando você na escuridão. O que ele quer?");
                System.out.println("Você ficou com medo e não conseguiu dormir mais.(-5 sanidade)");
                atributos.sanidade1 = 95;
                System.out.println(atributos.sanidade1);
                System.out.println("\n FIM DO CAPÍTULO 1.");

            } else {
                System.out.println(
                        "Você dormiu no quarto de hóspedes e acabou achando algo estranho atrás do quadro, símbolos estranhos de uma antiga religião celta. O que é aquilo?(-5 sanidade)");
                atributos.sanidade1 = 95;
                System.out.println(atributos.sanidade1);
                System.out.println("\n FIM DO CAPÍTULO 1.");

            }
        } else if (resp1.toUpperCase().equals("RECUSAR")) {
            System.out.println("Você recusa e fica na frente da casa sem saber pra onde ir. (-10 sanidade)");
            atributos.sanidade1 = 90;
            System.out.println(atributos.sanidade1);
            System.out.println("\n FIM DO CAPÍTULO 1.");

        } else if (resp1.toUpperCase().equals("CELEIRO")) {
            System.out.println(
                    "Você vai de fininho até o celeiro e acha um jeito de entrar e dorme no feno, com frio.(-5 sanidade)");
            atributos.sanidade1 = 95;
            System.out.println(atributos.sanidade1);
            System.out.println("\n FIM DO CAPÍTULO 1.");
        } else {
            System.out.println("Resposta inválida, tente novamente.");
        }
        input.close();
    }
}
