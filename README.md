# Atividade - Programação de Soluções Computacionais: Log

Este repositório contém um exemplo simples em Java que demonstra o uso de tratamento de exceções e gravação de logs em arquivo.

## Descrição

O programa realiza uma operação de divisão entre dois números inteiros. Caso ocorra uma divisão por zero, a exceção `ArithmeticException` é capturada, e a mensagem de erro é registrada no arquivo `log.txt`.

Além disso, o programa imprime uma mensagem no console informando que a operação foi finalizada, independentemente de erro ou não.

## Como Eexecutar

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/lucasxavila/atividade-log.git
3. Navegue até o diretório do projeto:
   ´´´bash
   cd atividade-log
4. Compile os arquivos Java:
   ```bash
   javac -d bin src/Main.java
5. Execute o programa:
   ```bash
   java -cp bin src/Main
