package Calculadora.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SOMA, SUB, IGUAL, VIRGULA;
    }

    private static final Memoria instancia = new Memoria();

    private String textoAtual = "";
    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private Memoria() {

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void adicionarObservador(MemoriaObservador o) {
        observadores.add(o);
    }

    public void processarComando(String texto) {
        TipoComando tipoComando = detectarTipoComando(texto);
        System.out.println(tipoComando);

        textoAtual += texto;
        if("AC".equals(texto)) {
            textoAtual = "0";
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private TipoComando detectarTipoComando(String texto) {

        if (texto.isEmpty() && texto == "0") {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            // Quando não for número (operadores)
            if("AC".equals(texto)) {
                return TipoComando.ZERAR;
            } else if("/".equals(texto)) {
                return TipoComando.DIV;
            } else if("*".equals(texto)) {
                return TipoComando.MULT;
            } else if("-".equals(texto)) {
                return TipoComando.SUB;
            } else if("+".equals(texto)) {
                return TipoComando.SOMA;
            } else if("=".equals(texto)) {
                return TipoComando.IGUAL;
            } else if(",".equals(texto)) {
                return TipoComando.VIRGULA;
            }
        }


        return null;
    }
}
