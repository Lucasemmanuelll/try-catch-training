import java.util.Scanner;

public class Conta {

    Scanner ler = new Scanner(System.in);

    private String titular;
    private String tipo;
    private double saldo;

    Conta(String titular, String tipo, double saldo) {
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String gettitular() {
        return titular;

    }
    public String getTipo(){
         return tipo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSaldo(double saldo){

            if (saldo < 0) {

                throw new IllegalArgumentException(
                        "O Valor do saldo deve ser maior que 0."
                );
            }

    }

    public void mostrarDados(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Saldo: " + this.saldo);
    }

    public void depositar(double valor){
       if(valor <= 0){
           throw new IllegalArgumentException(
                   "O Valor tem que ser maior que zero."
           );
       }
       saldo += valor;
    }

}
