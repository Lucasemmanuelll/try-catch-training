import java.util.Scanner;
public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    try{
    System.out.println("""
            Qual titular deseja consultar: 
            1 - Lucas
            2 - Amanda
            3 - José 
            """);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                    conta[0].mostrarDados();
                System.out.println("Deseja depositar algum valor R$ nesse titular? quanto: ");
                double valor1 = sc.nextDouble();
                //adicionar valor a variável saldo
                break;
            case 2:
                    conta[1].mostrarDados();
                System.out.println("Deseja depositar algum valor R$ nesse titular? quanto: ");
                double valor2 = sc.nextDouble();
                //adicionar valor a variável saldo
                break;
            case 3:
                    conta[2].mostrarDados();
                System.out.println("Deseja d11epositar algum valor R$ nesse titular? quanto: ");
                double valor3 = sc.nextDouble();
                //adicionar valor a variável saldo
                    break;

        System.out.println("Numero : " + n);

    }catch (InputMismatchException e){
        System.out.println("Você precisa digitar um número!");
    }

}