package unidade3;

//declara��o da calsse

import java.util.Scanner;

public class Monitor {
    
    //declara��o dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    
    //metodo da classe
    void mostrarInfo() {
        System.out.println("INFORMA��ES DO MONITOR:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolu��o: " + resolucao);
        System.out.println("Frequ�ncia: " + frequencia + "Hz");
        System.out.println("Pre�o: R$" + preco);
        
    }
    
    void solicitarInfo() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a marca do monitor:");
        marca = leia.nextLine();
        System.out.println("Digite o modelo:");
        modelo = leia.nextLine();
        System.out.println("Digite a resolu��o:");
        resolucao =  leia.nextLine();
        System.out.println("Digite a Frequencia:");
        frequencia = leia.nextInt();
        System.out.println("Digite o pre�o:");
        preco = leia.nextDouble();
        
    }
}
