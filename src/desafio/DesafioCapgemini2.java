package desafio;

public class DesafioCapgemini2 {

    public static void main(String[] args) {

        int[] meuArray = new int[5];
        meuArray[0] = 1;
        meuArray[1] = 5;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 2;


        int x = 2;
        int soma = 0;
        for (int i = 0; i < meuArray.length; i++) {
            for (int j = 0; j < meuArray.length; j++) {
                if ((meuArray[i] - meuArray[j]) == x) {
                    soma = soma + 1;

                }
            }
        }
        System.out.println("A quantidade de pares é: " + soma);
    }
}
