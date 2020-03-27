////////////////////////////////////////////////////////////////////////////////
//
//      @coder: Thanius aka Asmodi Druzil
//  
//      @classType: Main Class
//
////////////////////////////////////////////////////////////////////////////////


package tictactoe2;



public class TicTacToe2 
{
    private static GUI gui;
    
    
    public static void main(String[] args) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> 
        {
            gui = new GUI();
            gui.setVisible(true);
            gui.setResizable(false);
            gui.setLocationRelativeTo(null);
            gui.setTitle("Tic Tac Toe v.2.0.0.2 @Thanius");
        });
    }
}
