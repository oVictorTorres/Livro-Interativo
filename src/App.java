import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Você se chama Nickira, e está em uma trilha pela floresta, porém você perde a hora e fica de noite de repente com uma grande chuva, você deve ir em busca de alguma casa para pedir abrigo... ");
        System.out.println("\n Você encontra uma fazenda e toca a campainha, um senhorzinho atende e chama você para entrar. Qual sua decisão?");
        System.out.println("\n Entrar na casa(Entrar), Recusar e ficar do lado de fora(Recusar) ou Ir para o celeiro escondido(Celeiro).");

        String resp1 = input.nextLine();
        


        if (resp1.toUpperCase().equals("ENTRAR")) {
            System.out.println("Você adentra a casa.");
            System.out.println("Você irá dormir na cadeira(Cadeira) ou no quarto de hóspedes?(Quarto)");
            String resp2 = input.nextLine();
            if (resp2.toUpperCase().equals("CADEIRA")) {
                System.out.println("Você dormiu na cadeira e conseguiu evitar seu assassinato.");
            }
            else {
                System.out.println("Você dormiu no quarto de hóspedes e acabou sendo esfaqueado pelo velhinho que era um canibal.");
            }
        }
        else if (resp1.toUpperCase().equals("RECUSAR")) {
            System.out.println("Você recusa e fica na frente da casa.");
        }
        else if (resp1.toUpperCase().equals("CELEIRO")) {
            System.out.println("Você vai de fininho até o celeiro e acha um jeito de entrar.");
        }
        else {
            System.out.println("Resposta inválida, tente novamente.");
        }
        input.close();
    }
}
