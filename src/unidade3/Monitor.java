package unidade3;

//declaração da calsse

import java.util.Scanner;

public class Monitor {
    
    //declaração dos atributos
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    
    //metodo da classe
    void mostrarInfo() {
        System.out.println("INFORMAÇÕES DO MONITOR:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolução: " + resolucao);
        System.out.println("Frequência: " + frequencia + "Hz");
        System.out.println("Preço: R$" + preco);
        
    }
    
    void solicitarInfo() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a marca do monitor:");
        marca = leia.nextLine();
        System.out.println("Digite o modelo:");
        modelo = leia.nextLine();
        System.out.println("Digite a resolução:");
        resolucao =  leia.nextLine();
        System.out.println("Digite a Frequencia:");
        frequencia = leia.nextInt();
        System.out.println("Digite o preço:");
        preco = leia.nextDouble();
        
    }
}
