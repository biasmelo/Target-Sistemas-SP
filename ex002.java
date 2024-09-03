import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insirá um número: ");
        int num = entrada.nextInt();
        int anterior = 0, posterior = 1;
        while( posterior < num) {
            posterior = posterior + anterior;
            anterior = posterior - anterior;
            if(posterior == num) {
                System.out.print("O número informado PERTENCE a sequência de Fibonacci!");
            }
        }
        if(posterior != num) {
            System.out.println("O número informado NÃO pertence a sequência de Fibonacci!");
        }
        entrada.close();
    }
}