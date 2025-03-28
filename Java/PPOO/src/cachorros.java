public class cachorros {
    public static void main(String[] args) {
        // Criando um objeto da classe cachorro
        cachorro cachorro1 = new cachorro("tobi", "6kg", true);

        // Exibindo os atributos
        System.out.println("Nome: " + cachorro1.nome);
        System.out.println("Peso: " + cachorro1.peso);
        System.out.println("Está com sono? " + cachorro1.sono);
    }

    // Classe cachorro precisa ser static para ser usada dentro de Main
    public static class cachorro {
        public String nome;
        public String peso;
        public boolean sono;

        // Constructor
        public cachorro(String nome, String peso, boolean sono) {
            this.nome = nome;
            this.peso = peso;
            this.sono = sono;
        }
    }
}
