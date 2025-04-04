public class Hospital {
    public static void main(String[] args) {
        Medico medicoMaria = new Medico("Maria Fernanda", "Ginecologista", 19, 'F', false, "");
        Paciente pacienteGenerico = new Paciente("Claudia", "Rotina", 19, 'F');

        System.out.println(medicoMaria);
        medicoMaria.atender(pacienteGenerico);
        System.out.println(medicoMaria);
    }
}

class Medico {
    public String nome;
    public String especialidade;
    public int idade;
    public char sexo;
    public boolean ocupado;
    public String paciente;

    public Medico(String nome, String especialidade, int idade, char sexo, boolean ocupado, String paciente) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.idade = idade;
        this.sexo = sexo;
        this.ocupado = ocupado;
        this.paciente = paciente;
    }

    public void atender(Paciente paciente) {
        if (!ocupado) {
            this.ocupado = true;
            this.paciente = paciente.nome;
            System.out.println("O médico " + nome + " está atendendo " + paciente.nome);
        } else {
            System.out.println("O médico " + nome + " já está ocupado com outro paciente.");
        }
    }

    @Override
    public String toString() {
        return "Médico: " + nome + ", Especialidade: " + especialidade + ", Idade: " + idade +
                ", Sexo: " + sexo + ", Ocupado: " + ocupado + ", Paciente: " + (ocupado ? paciente : "Nenhum");
    }
}

class Paciente {
    public String nome;
    public String doenca;
    public int idade;
    public char sexo;

    public Paciente(String nome, String doenca, int idade, char sexo) {
        this.nome = nome;
        this.doenca = doenca;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", Doença: " + doenca + ", Idade: " + idade + ", Sexo: " + sexo;
    }
}
