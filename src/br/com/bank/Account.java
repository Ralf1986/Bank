package br.com.bank;

import javax.xml.namespace.QName;

public class Account {
    private static final int MAX_LENGTH = 12;
    private String agencia;
    private String conta;
    private String nome;
    private double balance;
    private Log logger;


    public Account() {
    }

    public Account(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.nome = nome;
        logger = new Log();
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > MAX_LENGTH){
            this.nome = nome.substring(0,MAX_LENGTH);
        }else{
            this.nome = nome;
        }
    }
    public  void depposit(double value){
        balance += value;
        logger.out("DEPOSITO - R$ " + value +  " - Sua conta agora é de R$ " + balance);
    }

    public boolean withDraw(double value){
        if (balance < value) {
            logger.out("SAQUE - R$ " + value +  " -  Sua conta agora é de R$ " + balance);
            return false;
        }else{
            balance -= value;
            logger.out("SAQUE - R$ " + value +  " -  Sua conta agora é de R$ " + balance);
            return  true;
        }
    }
}
