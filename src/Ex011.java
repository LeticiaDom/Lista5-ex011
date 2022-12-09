import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a data: [DD/MM/AAAA] ");
        String data = sc.nextLine();
        sc.close();

        System.out.println(conversor(data)); 
    }
    
    public static String Meses() {
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[valor]; 
    } 

    public static String conversor(String data) {
        try {
            String[] arrayData = data.split("/");
            int valor = Integer.parseInt(arrayData[1]);

            String dataFormat = arrayData[0] + " de " + Meses(valor) + " de " + arrayData[2];
            return dataFormat; 
        } catch (Exception e) {
            return null; 
        }
    }
}
