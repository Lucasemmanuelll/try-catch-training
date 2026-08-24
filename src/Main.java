import java.util.Scanner;

public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    Conta[] conta = new Conta[3];

    conta[0] = new Conta("Lucas", "Corrente", 2000);
    conta[1] = new Conta("Amanda", "Poupança", 7000);
    conta[2] = new Conta("José", "Salario", 2000);

    try {
        System.out.println("""
                Qual titular deseja consultar: 
                1 - Lucas
                2 - Amanda
                3 - José 
                """);
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                conta[0].mostrarDados();//MOSTRAR DADOS
                System.out.println("Deseja depositar algum valor R$ nesse titular? quanto: ");
                double valor1 = sc.nextDouble();
                conta[0].depositar(valor1);//DEPOSITAR
                break;
            case 2:
                conta[1].mostrarDados();
                System.out.println("Deseja depositar algum valor R$ nesse titular? quanto: ");
                double valor2 = sc.nextDouble();
                conta[1].depositar(valor2);
                break;
            case 3:
                conta[2].mostrarDados();
                System.out.println("Deseja d11epositar algum valor R$ nesse titular? quanto: ");
                double valor3 = sc.nextDouble();
                conta[2].depositar(valor3);
                break;

        }

        } catch (InputMismatchException e) {//Erro é totalmente contrário da variável pedida

            System.out.println("Erro:Digite apenas numeros.");

        } catch (IllegalArgumentException e) {//A variável é correta mas o valor lógico da regra de negócios não

            System.out.println("Erro" + e.getMessage());
        }
        sc.close();
}