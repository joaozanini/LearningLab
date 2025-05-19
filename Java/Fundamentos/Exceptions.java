public class Main {
    public static void main(String[] args) {
        // Tratando exceção de divisão por zero com errormsg.toString()
        try {
            System.out.println(7 / 0);
        } catch (Exception errormsg) {
            System.out.println("Erro ao realizar a divisão: " + errormsg); // java.lang.ArithmeticException: / by zero
        }

        // Tratando exceção de divisão por zero com errormsg.getMessage()
        try {
            System.out.println(7 / 0);
        } catch (Exception errormsg) {
            System.out.println("Erro ao realizar a divisão: " + errormsg.getMessage()); // / by zero
        }

        // Chamando gerarException1() com tratamento
        try {
            gerarRuntime();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Exception muito legal 1
        }

        // Chamando gerarException2() com tratamento
        try {
            gerarException();
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Exception muito legal 2
        }
    }

    // Exception não verificada ou checada
    static void gerarRuntime() throws RuntimeException {
        throw new RuntimeException("RuntimeException muito legal");
    }

    // Exception verificada ou checada
    static void gerarException() throws Exception {
        try {
            throw new Exception("Exception muito legal");
        } catch (Exception e) {
            System.out.println("Exception: " + e;
        }
        
    }
}
