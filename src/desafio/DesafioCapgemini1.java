package desafio;


import java.util.Arrays;

public class DesafioCapgemini1 {

    public static void main(String[] args) {


        //1 - 9,2,1,4,6    -  1,2,4,6,9
        //2 - ordenar um ARRAY
        //3 - calculo da mediana
        //4 - encontrar o elemento da mediana da lista

        //1
        int[] meuArray = new int[5];
        meuArray[0] = 9;
        meuArray[1] = 2;
        meuArray[2] = 1;
        meuArray[3] = 4;
        meuArray[4] = 6;

        //2
        Arrays.sort(meuArray);

        //3
        int comprimento = meuArray.length;
        int metadeLista = comprimento / 2;

        //4
        int mediana = meuArray[metadeLista];
        System.out.println("A mediana é: " + mediana);
    }
}

