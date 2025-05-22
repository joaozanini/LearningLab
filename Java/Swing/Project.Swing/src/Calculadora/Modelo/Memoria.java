package Calculadora.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SOMA, SUB, IGUAL, VIRGULA;
    }

    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();
    private String textoAtual = "";
    private String textoBuffer = "";
    private boolean substituir = false;
    private TipoComando ultimaOperacao = null;


    private Memoria() {}
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

        if(tipoComando == null) {
            return;
        } else if (tipoComando == TipoComando.ZERAR) {
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ultimaOperacao = null;
        } else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
            textoAtual = substituir ? texto : textoAtual + texto;
            substituir = false;
        } else {
            substituir = true;
            textoAtual = obterResultadoOperacao();
            textoBuffer = textoAtual;
            ultimaOperacao = tipoComando;
        }

        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if (ultimaOperacao == null || textoBuffer.isEmpty()) {
            return textoAtual;
        }

        double buffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double atual = Double.parseDouble(textoAtual.replace(",", "."));
        double resultado = 0;

        switch (ultimaOperacao) {
            case SOMA:
                resultado = buffer + atual;
                break;
            case SUB:
                resultado = buffer - atual;
                break;
            case MULT:
                resultado = buffer * atual;
                break;
            case DIV:
                resultado = atual == 0 ? 0 : buffer / atual; // evita divisão por zero
                break;
            default:
                return textoAtual;
        }

        String resultadoStr = Double.toString(resultado).replace(".", ",");
        boolean inteiro = resultadoStr.endsWith(",0");

        return inteiro ? resultadoStr.replace(",0", "") : resultadoStr;
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
            } else if(",".equals(texto) && !textoAtual.contains(",")) {
                return TipoComando.VIRGULA;
            }
        }

        return null;
    }
}
