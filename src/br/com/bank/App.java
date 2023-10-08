package br.com.bank;

public class App {
    public static void main(String[] args) {

        Account account = new Account("0001","12345","Madruguinha");



        boolean succeed = account.withDraw(200.0);
        if (!succeed) {
            System.out.println("Voce não tem dinheiro seu pobre!");
        }
        account.depposit(100.0);
        account.depposit(50.0);
        account.depposit(100.0);


        if (!account.withDraw(200)){
            System.out.println("sem saldo!");
        }else{
            System.out.println("Saque efetuado");


        }  if (!account.withDraw(200)){
            System.out.println("sem saldo!");
        }else{
            System.out.println("Saque efetuado");
        }

        @Override
        public String toString() {
            return "A conta " + this.nome + " "
                    + this.agencia + " / "
                    + this.conta + " possui: R$ "
                    + balance;
        }







    }
}
