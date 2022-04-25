import java.util.Scanner;

public class trabalho{

    public static void criarMatriz(int[][] matriz,int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j]=(int) (Math.random() * 10);
            }
        }
    }

    public static void imprimirmatriz(int matriz[][]){
        for(int linha[] : matriz){
            System.out.print("[");
            for(int elemento : linha){
                System.out.print(" " + elemento + " ");
            }
            System.out.println("]");
        }
    }
    public static int[][] rotacao(int matriz[][]){
        int linha = matriz.length;
        int coluna = matriz.length;
        int[][] matriz2 = new int[linha][coluna];
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2[i].length; j++){
                matriz2[j][matriz2[j].length - 1 - i] = matriz[i][j];
            }
        }
        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2[i].length; j++){
                matriz[i][j] = matriz2[i][j]; 
            }
        }
        return matriz;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tamanho da matriz");
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];
        criarMatriz(matriz, n);
        imprimirmatriz(matriz);
        System.out.println("Insira em quantos graus deseja virar a matriz(90, 180, 270, 360)");
        int graus = sc.nextInt();
        while (graus != 90 && graus != 180 && graus != 270 && graus !=360){
                System.out.println("Valor errado, digite novamente");
                graus = sc.nextInt();
        }
        int girar = graus / 90;
        for(int i = 0; i<girar ; i++){
            rotacao(matriz);
        }
        imprimirmatriz(matriz);
        

        sc.close();
    }


}