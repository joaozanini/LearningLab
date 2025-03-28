public class pessoas {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa corretamente
        Pessoa p1 = new Pessoa("João", 76.0, 185, 'm');

        // Exibindo os atributos para verificar se funcionou
        System.out.println("Nome: " + p1.nome);
        System.out.println("Peso: " + p1.peso + " kg");
        System.out.println("Altura: " + p1.altura + " cm");
        System.out.println("Sexo: " + p1.sexo);
    }

    // Definindo a classe Pessoa como estática para ser usada dentro de Pessoas
    public static class Pessoa {
        public String nome;
        public double peso;
        public int altura;
        public char sexo;

        // Construtor corrigido
        public Pessoa(String nome, double peso, int altura, char sexo) {
            this.nome = nome;
            this.peso = peso;
            this.altura = altura;
            this.sexo = sexo;
        }
    }
}
