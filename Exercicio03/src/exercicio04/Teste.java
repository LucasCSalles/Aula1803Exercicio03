package exercicio04;

public class Teste {
    public static void main(String[] args) {
        System.out.println(somar(2,1));
        System.out.println(somar(2,1,4));
        System.out.println(somar(2,1,4,6));
    }

    public static int somar(int...x){
    int soma=0;
    for (int i:x){
        soma+=i;
    }
    return soma;
    }


}
