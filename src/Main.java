package src;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    FileWriter writer = null;
    writer = new FileWriter("log.txt");
    int numerador = 10;
    int denominador = 0;
    int resultado = 0;
    
    try {
      resultado = numerador / denominador;
    }
    catch (ArithmeticException e) {
      writer.write("Erro (divisão por 0): " + e.getMessage());
    }
    finally {
      System.out.println("Operação finalizada");
    }
    writer.close();
  }
}
