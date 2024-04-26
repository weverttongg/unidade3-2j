package unidade3;


import unidade3.Monitor;


public class TesteMonitor {

    
    public static void main(String[] args) {
        //declarando objeto "m"
        Monitor m = new Monitor();
        
        //Modificando o estado do objeto m
        m.frequencia = 60;
        m.marca = "LG";
        m.modelo = "ThinQ";
        m.resolucao = "FullHD";
        m.tamanho = 21;
        m.preco =  540;
        
        //declarando o objeto "m2"
        Monitor m2 = new Monitor();
        
        //Exibindo valores do objeto 1 
        System.out.println("Monitor 1");
        System.out.println(m.frequencia);
        System.out.println(m.marca);
        System.out.println(m.modelo);
        System.out.println(m.resolucao);
        System.out.println(m.tamanho);
        System.out.println(m.preco);
        
        //Exibindo valores do objeto 2
        System.out.println("Monitor 2");
        System.out.println(m2.frequencia);
        System.out.println(m2.marca);
        System.out.println(m2.modelo);
        System.out.println(m2.resolucao);
        System.out.println(m2.tamanho);
        System.out.println(m2.preco);
        
    }

}
