import java.util.Scanner;
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Digite um número:" );
        int n  = sc.nextInt();

        System.out.println("Numero : " + n);

    }catch (InputMismatchException e){
        System.out.println("Você precisa digitar um número!");
    }

}