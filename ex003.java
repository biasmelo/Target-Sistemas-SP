import java.util.Scanner;
import java.util.Locale;

// Como não foi fornecido nenhum xml com dados de faturamento, fiz um código para o usuário inserir o faturamento dos dias e apresentar as informações pedidas pelo desafio!

public class ex003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        float faturamento[] = new float[5];
        float maior = 0, menor = 0, media = 0;
        int dias = faturamento.length, cont = 0;
        for(int i = 0; i < faturamento.length; i ++) {
            System.out.printf("Insirá o faturamento do dia %d: R$", i+1);
            faturamento[i] = entrada.nextFloat();
        }
        for(int i = 0; i < faturamento.length; i ++) {
            if(faturamento[i] > maior) maior = faturamento[i];
            if(faturamento[i] == 0) dias -= 1;
            else media = (media + faturamento[i]);     
        }
        media = media/dias;
        menor = maior;
        for(int i = 0; i < faturamento.length; i++) {
            if(media > faturamento[i]) cont++;
            if(faturamento[i] < menor) menor = faturamento[i];
        }
        System.out.println("O menor faturamento do mês: R$" + menor);
        System.out.println("O maior faturamento do mês: R$" + maior);
        System.out.println("O número de dias em que o faturamento foi acima da média do mês é de: " + cont + " dias!");
        entrada.close();
    }    
}