import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("Contagem: ");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parametro deve ser maior que o primeiro");
        }
    }
    
}
