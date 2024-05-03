package exemplos;
//importando a caixa de dialogo
import javax.swing.JOptionPane;
public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar (50);
        c.depositar (100);
        
        //condição
        boolean saqueEfetuado = c.sacar(125);
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
        JOptionPane.showMessageDialog(null,"Saldo Disponivel: R$" + c.saldo);
        
        //imprimindo normalmente
        System.out.println("Saldo Disponivel: R$" + c.saldo);
        
    }
}
