package exemplos;
//importando a caixa de dialogo
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar (50);
        c.depositar (100);
        c.setNomeTitular("Wevertton R");
        c.setNumero(25688);
        
        //condição
        boolean saqueEfetuado = c.sacar(151);
        if (saqueEfetuado) {
            
            //imprimindo com caixa de dialogo
            JOptionPane.showMessageDialog(null,"Saque efetuado com sucesso!" );
            
            //imprimindo normalmente
            System.out.println("Saque efetuado com sucesso!");
            
        }else {
            
            //imprimindo com caixa de dialogo
            JOptionPane.showMessageDialog(null,"Erro ao efetuar o saque!");
            
            //imprimindo normalmente
            System.err.println("Erro ao efetuar o saque!");
        }
         
        //imprimindo com caixa de dialogo
        JOptionPane.showMessageDialog(null,"Saldo Disponivel: R$" + c.getSaldo());
        
        //imprimindo normalmente
        System.out.println(c);
        
    }
}
