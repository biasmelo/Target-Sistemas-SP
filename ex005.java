import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String palavra = entrada.nextLine();
        char inverter[] = palavra.toCharArray();
        String invertida = "";
        for(int i = inverter.length - 1; i >= 0; i--){ 
            invertida += inverter[i];
        }
        System.out.println(invertida);
        entrada.close();
    }
}
