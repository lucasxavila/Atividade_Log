import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0; // Isso causará uma exceção de divisão por zero
        int resultado = 0;

        try {
            // Tenta realizar a divisão
            resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
            logger.log(Level.INFO, "Divisão realizada com sucesso: " + resultado);
        } catch (ArithmeticException e) {
            // Trata exceções aritméticas, como divisão por zero
            logger.log(Level.SEVERE, "Erro ao realizar a divisão: " + e.getMessage(), e);
        } finally {
            // Este bloco será executado independentemente de ocorrer uma exceção ou não
            logger.log(Level.INFO, "Bloco finally executado.");
        }
    }
}
