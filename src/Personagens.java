public class Personagens {
    String nome;
    int sanidade;
    public Personagens (String nome, int sanidade) {
        this.nome = nome;
        this.sanidade = sanidade;
    }
    void alteracaoEnergia() {
        this.sanidade -= 5;
        System.out.println("O personagem " + this.nome + " perdeu 5 de sanidade -> (" + this.sanidade + ") essa é a energia dele agora. ");  
        if (sanidade<0 ) {
            System.out.println(" O personagem " + this.nome + " enlouqueceu.");  
        }
    }
}
