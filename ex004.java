public class ex004 {
    public static void main(String[] args) {
        double total = 67836.43 + 36678.66 + 29229.88 + 27165.48 + 19849.53;
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        System.out.printf("O estado de São Paulo representa %.2f/100 do faturamento.\n", (sp/total*100));
        System.out.printf("O estado do Rio de Janeiro representa %.2f/100 do faturamento.\n", (rj/total*100));
        System.out.printf("O estado de Minas Gerais representa %.2f/100 do faturamento.\n", (mg/total*100));
        System.out.printf("O estado do Espirito Santo representa %.2f/100 do faturamento.\n", (es/total*100));
        System.out.printf("Outros estados representam %.2f/100 do faturamento.\n", (outros/total*100));
    }
}
