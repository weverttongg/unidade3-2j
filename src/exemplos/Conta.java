package exemplos;


public class Conta {
    //tornando as classe privadas para impedir modificações sem autorização
    private int numero;
    private String nomeTitular;
    private double saldo;
    
    //class void não retorna valor
    void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    
    //class boolean aceita somente dois valores ( verdade ou falso )
    boolean sacar(double valor) {
        if(valor <= this.saldo) {
        //subtrai o valor do saldo
        //this.saldo = this.saldo - valor;
        this.saldo -= valor;
        return true;
        }else
            return false;
    }
        
    //ENCAPSULAMENTO
    public double getSaldo() {
        return this.saldo;
    //Metodo get ( PARA LER/PEGAR O VALOR DA VARIAVEL )
    //O get tambem não tem argumentos
         
    }
    
    //ENCAPSULAMENTO
    public int getNumero () {
       return this.numero;
       //Metodo get ( PARA LER/PEGAR O VALOR DA VARIAVEL )
    //O get tambem não tem argumentos
   
    }
    
   //ENCAPSULAMENTO
   public String getNomeTitular () {
       return this.nomeTitular;
   //Metodo get ( PARA LER/PEGAR O VALOR DA VARIAVEL )
    //O get tambem não tem argumentos
   
   }
   
   //ENCAPSULAMENTO
   public void setNumero (int numero) {
       this.numero = numero;
   //Metodo set ( PARA ESCREVER/DEFINIR O VALOR DA VARIAVEL )
   //O MESMO USA O ARGUMENTO DA PROPRIA VARIAVEL
   
   }
   
   //ENCAPSULAMENTO
   public void setNomeTitular(String nomeTitular) {
       this.nomeTitular = nomeTitular;
   //Metodo set ( PARA ESCREVER/DEFINIR O VALOR DA VARIAVEL )
   //O MESMO USA O ARGUMENTO DA PROPRIA VARIAVEL
   }

   
   //USADO ATRAVES DO: botão direito do mouse>insert code>toString>generate.
   //metodo ToString ( para transformar um obj em texto ) usado para imprimir em texto
    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + '}';
    }
   
}


