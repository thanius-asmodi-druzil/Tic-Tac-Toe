////////////////////////////////////////////////////////////////////////////////
//
//      @coder: Thanius aka Asmodi Druzil
//  
//      @classType: Frame Class
//
////////////////////////////////////////////////////////////////////////////////


package tictactoe2;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class GUI extends javax.swing.JFrame 
{
    private static final long serialVersionUID = -7880806802174210788L;

    //  Vars to set the Button in a used state
    private boolean btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    //  Vars to set the Owner of the Button (0 = empty; 1 = Player; 2 = Computer;)
    private int btn1O, btn2O, btn3O, btn4O, btn5O, btn6O, btn7O, btn8O, btn9O;  //  "O" like -> "O"wner

    private boolean player, win, check;
    private String name;
    private static Image imgX, imgXW, imgO, imgOW, imgQ;
    private int random, round, winPl, winCom, winner;
    private float avePl, aveCom;    //  the average of wins (percentage)

    public GUI() 
    {
        initComponents();
        LoadImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Round = new javax.swing.JLabel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        NextRound = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        StartGame = new javax.swing.JButton();
        PlayerName = new javax.swing.JLabel();
        WinsPlayer = new javax.swing.JLabel();
        GamesPlayer = new javax.swing.JLabel();
        AveragePlayer = new javax.swing.JLabel();
        WinsComputer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GamesComputer = new javax.swing.JLabel();
        AverageComputer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe v.2.0.0.0");
        setBackground(new java.awt.Color(0, 102, 255));
        setForeground(new java.awt.Color(0, 153, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        Round.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Round.setForeground(new java.awt.Color(255, 255, 255));
        Round.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        NextRound.setText("Next Round");
        NextRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRoundActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        StartGame.setText("Start Game");
        StartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartGameActionPerformed(evt);
            }
        });

        PlayerName.setForeground(new java.awt.Color(255, 255, 255));
        PlayerName.setText("Name");

        WinsPlayer.setForeground(new java.awt.Color(255, 255, 255));
        WinsPlayer.setText("Wins");

        GamesPlayer.setForeground(new java.awt.Color(255, 255, 255));
        GamesPlayer.setText("Games");

        AveragePlayer.setForeground(new java.awt.Color(255, 255, 255));
        AveragePlayer.setText("Average");

        WinsComputer.setForeground(new java.awt.Color(255, 255, 255));
        WinsComputer.setText("Wins");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Computer");

        GamesComputer.setForeground(new java.awt.Color(255, 255, 255));
        GamesComputer.setText("Games");

        AverageComputer.setForeground(new java.awt.Color(255, 255, 255));
        AverageComputer.setText("Average");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Round, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NextRound, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlayerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WinsPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GamesPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AveragePlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(StartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(WinsComputer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GamesComputer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AverageComputer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(19, 19, 19)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Round, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WinsComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GamesComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AverageComputer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(StartGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WinsPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GamesPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AveragePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(NextRound)
                        .addGap(18, 18, 18)
                        .addComponent(Exit)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
//  INTERNAL FUNCTIONS
////////////////////////////////////////////////////////////////////////////////  
    
    //  Random Generator
    private void RandGen(int end, int start) 
    {
        random = (int)(Math.random() * end + start);

        while (random < start || random > end) 
        {
            random = (int)(Math.random() * end + start);
        }
    }

    //  Set Vars
    private void SetVars() 
    {
        win = false;
        btn1 = btn2 = btn3 = btn4 = btn5 = btn6 = btn7 = btn8 = btn9 = player = false;
        btn1O = btn2O = btn3O = btn4O = btn5O = btn6O = btn7O = btn8O = btn9O = 0;
        round = winPl = winCom = winner = 0;
        avePl = aveCom = 0;
    }

    //  Load Images
    private void LoadImages() 
    {
        try 
        {
            imgX = ImageIO.read(new File("res/x.png"));
            imgO = ImageIO.read(new File("res/o.png"));
            imgQ = ImageIO.read(new File("res/q.png"));
            imgXW = ImageIO.read(new File("res/xw.png"));
            imgOW = ImageIO.read(new File("res/ow.png"));
        } 
        catch (IOException ex) {}
    }

    //  Set Button (Player Turn)
    private void SetButton(int button) 
    {
        if (player) 
        {
            switch (button) 
            {
                case 1:
                    if (!btn1) 
                    {
                        btn1 = true;
                        btn1O = 1;
                        Btn1.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 2:
                    if (!btn2) 
                    {
                        btn2 = true;
                        btn2O = 1;
                        Btn2.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 3:
                    if (!btn3) 
                    {
                        btn3 = true;
                        btn3O = 1;
                        Btn3.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 4:
                    if (!btn4) 
                    {
                        btn4 = true;
                        btn4O = 1;
                        Btn4.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 5:
                    if (!btn5) 
                    {
                        btn5 = true;
                        btn5O = 1;
                        Btn5.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 6:
                    if (!btn6) 
                    {
                        btn6 = true;
                        btn6O = 1;
                        Btn6.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 7:
                    if (!btn7) 
                    {
                        btn7 = true;
                        btn7O = 1;
                        Btn7.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 8:
                    if (!btn8) 
                    {
                        btn8 = true;
                        btn8O = 1;
                        Btn8.setIcon(new ImageIcon(imgX));
                    }
                    break;

                case 9:
                    if (!btn9) 
                    {
                        btn9 = true;
                        btn9O = 1;
                        Btn9.setIcon(new ImageIcon(imgX));
                    }
                    break;
            }
        }
    }

    //  Reset Buttons
    private void ResetButtons() 
    {
        Btn1.setIcon(new ImageIcon(imgQ));
        btn1 = false;
        btn1O = 0;
        Btn2.setIcon(new ImageIcon(imgQ));
        btn2 = false;
        btn2O = 0;
        Btn3.setIcon(new ImageIcon(imgQ));
        btn3 = false;
        btn3O = 0;
        Btn4.setIcon(new ImageIcon(imgQ));
        btn4 = false;
        btn4O = 0;
        Btn5.setIcon(new ImageIcon(imgQ));
        btn5 = false;
        btn5O = 0;
        Btn6.setIcon(new ImageIcon(imgQ));
        btn6 = false;
        btn6O = 0;
        Btn7.setIcon(new ImageIcon(imgQ));
        btn7 = false;
        btn7O = 0;
        Btn8.setIcon(new ImageIcon(imgQ));
        btn8 = false;
        btn8O = 0;
        Btn9.setIcon(new ImageIcon(imgQ));
        btn9 = false;
        btn9O = 0;
    }

    //  Set Text Elements
    private void SetText() 
    {
        if (round != 0 && winPl != 0) 
            avePl = (float)(winPl * 100 / round);
        if (round != 0 && winCom != 0) 
            aveCom = (float)(winCom * 100 / round);

        Round.setText("Round " + round);
        PlayerName.setText(name);
        WinsPlayer.setText("Wins: " + winPl);
        GamesPlayer.setText("Rounds: " + round);
        AveragePlayer.setText("Average: " + avePl + "%");
        WinsComputer.setText("Wins: " + winCom);
        GamesComputer.setText("Rounds: " + round);
        AverageComputer.setText("Average: " + aveCom + "%");
    }
    
    //  Winner Dialog
    private void WinnerDialog(int winner)
    {
        switch (winner)
        {
            case 1:
                javax.swing.JOptionPane.showMessageDialog(null, "Player wins!");
                player = false;
                break;
                
            case 2:
                javax.swing.JOptionPane.showMessageDialog(null, "Computer wins!");
                player = false;
                break;
            
            case 3:
                javax.swing.JOptionPane.showMessageDialog(null, "A draw!");
                player = false;
                break;
        }
    }

    
    
//  GAME ROUTINE FUNCTIONS
////////////////////////////////////////////////////////////////////////////////
   
    //  Check Winner
    private boolean CheckWinner()
    {
        if (btn1O == 1 && btn2O == 1 && btn3O == 1)
        {
            Btn1.setIcon(new ImageIcon(imgXW));
            Btn2.setIcon(new ImageIcon(imgXW));
            Btn3.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn1O == 2 && btn2O == 2 && btn3O == 2)
        {
            Btn1.setIcon(new ImageIcon(imgOW));
            Btn2.setIcon(new ImageIcon(imgOW));
            Btn3.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn1O == 1 && btn5O == 1 && btn9O == 1)
        {
            Btn1.setIcon(new ImageIcon(imgXW));
            Btn5.setIcon(new ImageIcon(imgXW));
            Btn9.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn1O == 2 && btn5O == 2 && btn9O == 2)
        {
            Btn1.setIcon(new ImageIcon(imgOW));
            Btn5.setIcon(new ImageIcon(imgOW));
            Btn9.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn1O == 1 && btn4O == 1 && btn7O == 1)
        {
            Btn1.setIcon(new ImageIcon(imgXW));
            Btn4.setIcon(new ImageIcon(imgXW));
            Btn7.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn1O == 2 && btn4O == 2 && btn7O == 2)
        {
            Btn1.setIcon(new ImageIcon(imgOW));
            Btn4.setIcon(new ImageIcon(imgOW));
            Btn7.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn2O == 1 && btn5O == 1 && btn8O == 1)
        {
            Btn2.setIcon(new ImageIcon(imgXW));
            Btn5.setIcon(new ImageIcon(imgXW));
            Btn8.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn2O == 2 && btn5O == 2 && btn8O == 2)
        {
            Btn2.setIcon(new ImageIcon(imgOW));
            Btn5.setIcon(new ImageIcon(imgOW));
            Btn8.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn3O == 1 && btn5O == 1 && btn7O == 1)
        {
            Btn3.setIcon(new ImageIcon(imgXW));
            Btn5.setIcon(new ImageIcon(imgXW));
            Btn7.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn3O == 2 && btn5O == 2 && btn7O == 2)
        {
            Btn3.setIcon(new ImageIcon(imgOW));
            Btn5.setIcon(new ImageIcon(imgOW));
            Btn7.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn3O == 1 && btn6O == 1 && btn9O == 1)
        {
            Btn3.setIcon(new ImageIcon(imgXW));
            Btn6.setIcon(new ImageIcon(imgXW));
            Btn9.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn3O == 2 && btn6O == 2 && btn9O == 2)
        {
            Btn3.setIcon(new ImageIcon(imgOW));
            Btn6.setIcon(new ImageIcon(imgOW));
            Btn9.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn4O == 1 && btn5O == 1 && btn6O == 1)
        {
            Btn4.setIcon(new ImageIcon(imgXW));
            Btn5.setIcon(new ImageIcon(imgXW));
            Btn6.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn4O == 2 && btn5O == 2 && btn6O == 2)
        {
            Btn4.setIcon(new ImageIcon(imgOW));
            Btn5.setIcon(new ImageIcon(imgOW));
            Btn6.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else if (btn7O == 1 && btn8O == 1 && btn9O == 1)
        {
            Btn7.setIcon(new ImageIcon(imgXW));
            Btn8.setIcon(new ImageIcon(imgXW));
            Btn9.setIcon(new ImageIcon(imgXW));
            win = true;
            winner = 1;
            winPl++;
            WinnerDialog(1);
        }
        else if (btn7O == 2 && btn8O == 2 && btn9O == 2)
        {
            Btn7.setIcon(new ImageIcon(imgOW));
            Btn8.setIcon(new ImageIcon(imgOW));
            Btn9.setIcon(new ImageIcon(imgOW));
            win = true;
            winner = 2;
            winCom++;
            WinnerDialog(2);
        }
        else
        {
            win = false;
            Draw();
        }
        
        return win;
    }
    
    //  Check Draw
    private void Draw()
    {
        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6 && btn7 && btn8 && btn9)
        {
            win = false;
            winner = 0;
            WinnerDialog(3);
        }
    }
    
    //  Com Turn
    private void ComTurn()
    {
        check = false;
        
        if (btn1O == 0 && btn2O == 0 && btn3O == 0 && btn4O == 0 && btn5O == 0
                && btn6O == 0 && btn7O == 0 && btn8O == 0 && btn9O == 0)
            ComFirstTurn();
        else if (!btn1 || !btn2 || !btn3 || !btn4 || !btn5 || !btn6 || !btn7 || !btn8 || !btn9)
        {
            //  Button 1 -> Com Check
            if (btn2O == 2 && btn3O == 2 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 2 && btn7O == 2 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 && btn9O == 2 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 1 && btn3O == 1 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 1 && btn7O == 1 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 1 && btn9O == 1 && btn1O == 0)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 2 -> Com Check
            else if (btn1O == 2 && btn3O == 2 && btn2O == 0)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 && btn8O == 2 && btn2O == 0)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            } 
            else if (btn1O == 1 && btn3O == 1 && btn2O == 0)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 1 && btn8O == 1 && btn2O == 0)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }

            //  Button 3 -> Com Check
            else if (btn1O == 2 && btn2O == 2 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 && btn7O == 2 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn6O == 2 && btn9O == 2 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn2O == 1 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 1 && btn7O == 1 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn6O == 1 && btn9O == 1 && btn3O == 0)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 4 -> Com Check
            else if (btn1O == 2 && btn7O == 2 && btn4O == 0)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 && btn6O == 2 && btn4O == 0)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn7O == 1 && btn4O == 0)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 1 && btn6O == 1 && btn4O == 0)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 5 -> Com Check
            else if (btn1O == 2 && btn9O == 2 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 2 && btn8O == 2 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 && btn7O == 2 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 2 && btn6O == 2 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn9O == 1 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 1 && btn8O == 1 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));btn5 = true;
            }
            else if (btn3O == 1 && btn7O == 1 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            } 
            else if (btn4O == 1 && btn6O == 1 && btn5O == 0)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 6 -> Com Check
            else if (btn3O == 2 && btn9O == 2 && btn6O == 0)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 2 && btn5O == 2 && btn6O == 0)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 1 && btn9O == 1 && btn6O == 0)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            } 
            else if (btn4O == 1 && btn5O == 1 && btn6O == 0)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 7 -> Com Check
            else if (btn1O == 2 && btn4O == 2 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 && btn5O == 2 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            } 
            else if (btn8O == 2 && btn9O == 2 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn4O == 1 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 1 && btn5O == 1 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn8O == 1 && btn9O == 1 && btn7O == 0)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            
            //  Button 8 -> Com Check
            else if (btn2O == 2 && btn5O == 2 && btn8O == 0)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 2 && btn9O == 2 && btn8O == 0)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 1 && btn5O == 1 && btn8O == 0)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 1 && btn9O == 1 && btn8O == 0)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }  
            
            //  Button 9 -> Com Check
            else if (btn1O == 2 && btn5O == 2 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 && btn6O == 2 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 2 && btn8O == 2 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn5O == 1 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 1 && btn6O == 1 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 1 && btn8O == 1 && btn9O == 0)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            
            //  Com Choice
            else
                ComCheckTurn();
        }
        
        player = true;
    }

    //  Com First Turn
    private void ComFirstTurn() 
    {
        if (btn1O == 0 && btn2O == 0 && btn3O == 0 && btn4O == 0 && btn5O == 0
                && btn6O == 0 && btn7O == 0 && btn8O == 0 && btn9O == 0)
            RandGen(9, 1);

        switch (random) 
        {
            case 1:
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
                break;

            case 2:
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
                break;

            case 3:
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
                break;

            case 4:
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
                break;

            case 5:
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
                break;

            case 6:
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
                break;

            case 7:
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
                break;

            case 8:
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
                break;

            case 9:
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
                break;
        }
    }
    
    //  Com Check Turn
    private void ComCheckTurn() 
    {
        if (!ComCheckComBtn())
        {
            if (!ComCheckPlBtn())
            {
                ComTurnStd();
            }
        }
        
        check = false;
    }
    
    //  Com Check Com Buttons
    private boolean ComCheckComBtn()
    {
        //  Check Button 1 & 6 if Com is the Owner
        if (btn1O == 2 && btn6O == 2 && !btn2 && !btn9 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn6O == 2 && !btn5 && !btn7 && !btn4)
        {
            check = true;
            btn4 = true;
            btn4O = 2;
            Btn4.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn6O == 2 && !btn4 && !btn9 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn6O == 2 && !btn3 && !btn5 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
                
        //  Check Button 1 & 8 if Com is the Owner
        else if (btn1O == 2 && btn8O == 2 && !btn3 && !btn5 && !btn2)
        {
            check = true;
            btn2 = true;
            btn2O = 2;
            Btn2.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn8O == 2 && !btn2 && !btn9 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn8O == 2 && !btn4 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 2 && btn8O == 2 && !btn5 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 2 & 4 if Com is the Owner
        else if (btn2O == 2 && btn4O == 2 && !btn3 && !btn7 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn2O == 2 && btn4O == 2 && !btn6 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 2 & 6 if Com is the Owner
        else if (btn2O == 2 && btn6O == 2 && !btn1 && !btn9 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn2O == 2 && btn6O == 2 && !btn4 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 3 & 4 if Com is the Owner
        else if (btn3O == 2 && btn4O == 2 && !btn2 && !btn7 && !btn1) 
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 2 && btn4O == 2 && !btn6 && !btn7 && !btn5) 
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 2 && btn4O == 2 && !btn5 && !btn9 && !btn6) 
        {
            check = true;
            btn6 = true;
            btn6O = 2;
            Btn6.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 2 && btn4O == 2 && !btn1 && !btn5 && !btn7) 
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        } 
        
        //  Check Button 3 & 8 if Com is the Owner
        else if (btn3O == 2 && btn8O == 2 && !btn5 && !btn9 && !btn2)
        {
            check = true;
            btn2 = true;
            btn2O = 2;
            Btn2.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 2 && btn8O == 2 && !btn2 && !btn7 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 2 && btn8O == 2 && !btn5 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 2 && btn8O == 2 && !btn6 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 4 & 9 if Com is the Owner
        else if (btn4O == 2 && btn9O == 2 && !btn5 && !btn7 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 2 && btn9O == 2 && !btn1 && !btn6 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 2 && btn9O == 2 && !btn1 && !btn5 && !btn6)
        {
            check = true;
            btn6 = true;
            btn6O = 2;
            Btn6.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 2 && btn9O == 2 && !btn1 && !btn8 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 6 & 7 if Com is the Owner
        else if (btn6O == 2 && btn7O == 2 && !btn5 && !btn9 && !btn3)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 2 && btn7O == 2 && !btn1 && !btn5 && !btn4)
        {
            check = true;
            btn4 = true;
            btn4O = 2;
            Btn4.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 2 && btn7O == 2 && !btn3 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 2 && btn7O == 2 && !btn3 && !btn8 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 6 & 8 if Com is the Owner
        else if (btn6O == 2 && btn8O == 2 && !btn2 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 2 && btn8O == 2 && !btn3 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 7 & 2 if Com is the Owner
        else if (btn7O == 2 && btn2O == 2 && !btn3 && !btn4 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 2 && btn2O == 2 && !btn5 && !btn8 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 2 && btn2O == 2 && !btn3 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 2 && btn2O == 2 && !btn5 && !btn9 && !btn8)
        {
            check = true;
            btn8 = true;
            btn8O = 2;
            Btn8.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 8 & 4 if Com is the Owner
        else if (btn8O == 2 && btn4O == 2 && !btn2 && !btn6 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn8O == 2 && btn4O == 2 && !btn1 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 8 & 6 if Com is the Owner
        else if (btn8O == 2 && btn6O == 2 && !btn2 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn8O == 2 && btn6O == 2 && !btn3 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 9 & 2 if Com is the Owner
        else if (btn9O == 2 && btn2O == 2 && !btn3 && !btn5 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 2 && btn2O == 2 && !btn1 && !btn6 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 2 && btn2O == 2 && !btn1 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 2 && btn2O == 2 && !btn5 && !btn7 && !btn8)
        {
            check = true;
            btn8 = true;
            btn8O = 2;
            Btn8.setIcon(new ImageIcon(imgO));
        }
        
        return check;
    }
    
    //  Com Check Player Buttons
    private boolean ComCheckPlBtn()
    {
        //  Check Button 1 & 6 if Player is the Owner
        if (btn1O == 1 && btn6O == 1 && !btn2 && !btn9 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn6O == 1 && !btn5 && !btn7 && !btn4)
        {
            check = true;
            btn4 = true;
            btn4O = 2;
            Btn4.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn6O == 1 && !btn4 && !btn9 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn6O == 1 && !btn3 && !btn5 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
                
        //  Check Button 1 & 8 if Player is the Owner
        else if (btn1O == 1 && btn8O == 1 && !btn3 && !btn5 && !btn2)
        {
            check = true;
            btn2 = true;
            btn2O = 2;
            Btn2.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn8O == 1 && !btn2 && !btn9 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn8O == 1 && !btn4 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        else if (btn1O == 1 && btn8O == 1 && !btn5 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 2 & 4 if Player is the Owner
        else if (btn2O == 1 && btn4O == 1 && !btn3 && !btn7 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn2O == 1 && btn4O == 1 && !btn6 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 2 & 6 if Player is the Owner
        else if (btn2O == 1 && btn6O == 1 && !btn1 && !btn9 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn2O == 1 && btn6O == 1 && !btn4 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 3 & 4 if Player is the Owner
        else if (btn3O == 1 && btn4O == 1 && !btn2 && !btn7 && !btn1) 
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 1 && btn4O == 1 && !btn6 && !btn7 && !btn5) 
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 1 && btn4O == 1 && !btn5 && !btn9 && !btn6) 
        {
            check = true;
            btn6 = true;
            btn6O = 2;
            Btn6.setIcon(new ImageIcon(imgO));
        } 
        else if (btn3O == 1 && btn4O == 1 && !btn1 && !btn5 && !btn7) 
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        } 
        
        //  Check Button 3 & 8 if Player is the Owner
        else if (btn3O == 1 && btn8O == 1 && !btn5 && !btn9 && !btn2)
        {
            check = true;
            btn2 = true;
            btn2O = 2;
            Btn2.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 1 && btn8O == 1 && !btn2 && !btn7 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 1 && btn8O == 1 && !btn5 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        else if (btn3O == 1 && btn8O == 1 && !btn6 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 4 & 9 if Player is the Owner
        else if (btn4O == 1 && btn9O == 1 && !btn5 && !btn7 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 1 && btn9O == 1 && !btn1 && !btn6 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 1 && btn9O == 1 && !btn1 && !btn5 && !btn6)
        {
            check = true;
            btn6 = true;
            btn6O = 2;
            Btn6.setIcon(new ImageIcon(imgO));
        }
        else if (btn4O == 1 && btn9O == 1 && !btn1 && !btn8 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 6 & 7 if Player is the Owner
        else if (btn6O == 1 && btn7O == 1 && !btn5 && !btn9 && !btn3)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 1 && btn7O == 1 && !btn1 && !btn5 && !btn4)
        {
            check = true;
            btn4 = true;
            btn4O = 2;
            Btn4.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 1 && btn7O == 1 && !btn3 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 1 && btn7O == 1 && !btn3 && !btn8 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 6 & 8 if Player is the Owner
        else if (btn6O == 1 && btn8O == 1 && !btn2 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn6O == 1 && btn8O == 1 && !btn3 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 7 & 2 if Player is the Owner
        else if (btn7O == 1 && btn2O == 1 && !btn3 && !btn4 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 1 && btn2O == 1 && !btn5 && !btn8 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 1 && btn2O == 1 && !btn3 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn7O == 1 && btn2O == 1 && !btn5 && !btn9 && !btn8)
        {
            check = true;
            btn8 = true;
            btn8O = 2;
            Btn8.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 8 & 4 if Player is the Owner
        else if (btn8O == 1 && btn4O == 1 && !btn2 && !btn6 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn8O == 1 && btn4O == 1 && !btn1 && !btn9 && !btn7)
        {
            check = true;
            btn7 = true;
            btn7O = 2;
            Btn7.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 8 & 6 if Player is the Owner
        else if (btn8O == 1 && btn6O == 1 && !btn2 && !btn4 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn8O == 1 && btn6O == 1 && !btn3 && !btn7 && !btn9)
        {
            check = true;
            btn9 = true;
            btn9O = 2;
            Btn9.setIcon(new ImageIcon(imgO));
        }
        
        //  Check Button 9 & 2 if Player is the Owner
        else if (btn9O == 1 && btn2O == 1 && !btn3 && !btn5 && !btn1)
        {
            check = true;
            btn1 = true;
            btn1O = 2;
            Btn1.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 1 && btn2O == 1 && !btn1 && !btn6 && !btn3)
        {
            check = true;
            btn3 = true;
            btn3O = 2;
            Btn3.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 1 && btn2O == 1 && !btn1 && !btn8 && !btn5)
        {
            check = true;
            btn5 = true;
            btn5O = 2;
            Btn5.setIcon(new ImageIcon(imgO));
        }
        else if (btn9O == 1 && btn2O == 1 && !btn5 && !btn7 && !btn8)
        {
            check = true;
            btn8 = true;
            btn8O = 2;
            Btn8.setIcon(new ImageIcon(imgO));
        }
        
        return check;
    }
    
    //  Com Turn Standard
    private void ComTurnStd()
    {
        RandGen(9, 1);
        
        switch (random)
        {
            case 1:
                if (!btn1)
                {
                    btn1 = true;
                    btn1O = 2;
                    Btn1.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 2:
                if (!btn2)
                {
                    btn2 = true;
                    btn2O = 2;
                    Btn2.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 3:
                if (!btn3)
                {
                    btn3 = true;
                    btn3O = 2;
                    Btn3.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 4:
                if (!btn4)
                {
                    btn4 = true;
                    btn4O = 2;
                    Btn4.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 5:
                if (!btn5)
                {
                    btn5 = true;
                    btn5O = 2;
                    Btn5.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 6:
                if (!btn6)
                {
                    btn6 = true;
                    btn6O = 2;
                    Btn6.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 7:
                if (!btn7)
                {
                    btn7 = true;
                    btn7O = 2;
                    Btn7.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 8:
                if (!btn8)
                {
                    btn8 = true;
                    btn8O = 2;
                    Btn8.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
            case 9:
                if (!btn9)
                {
                    btn9 = true;
                    btn9O = 2;
                    Btn9.setIcon(new ImageIcon(imgO));
                    break;
                }
                else
                {
                    ComTurnStd();
                    break;
                }
        }
    }
    
    

//  BUTTONS ACTION PERFORMED
////////////////////////////////////////////////////////////////////////////////
    
    //  BUTTON -> Start Game
    private void StartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartGameActionPerformed

        ResetButtons();
        SetVars();
        RandGen(100, 1);

        if (random > 49)
            player = true;
        else
            player = false;

        name = javax.swing.JOptionPane.showInputDialog(null, "Enter your name:",
            "Your Name", javax.swing.JOptionPane.PLAIN_MESSAGE);
        
        round++;
        SetText();

        if (!player)
            ComTurn();
    }//GEN-LAST:event_StartGameActionPerformed

    //  BUTTON -> Exit
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    //  BUTTON -> Next Round
    private void NextRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRoundActionPerformed

        win = false;
        round++;
        ResetButtons();
        SetText();
            
        if (winner == 1)
        {
            winner = 0;
            ComTurn();
        } 
        else
        {
            player = true;
            winner = 0;
        }
        
    }//GEN-LAST:event_NextRoundActionPerformed

    //  BUTTON -> Btn9
    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed

        if (player)
        {
            if (!btn9)
            {
                SetButton(9);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn9ActionPerformed

    //  BUTTON -> Btn8
    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed

        if (player)
        {
            if (!btn8)
            {
                SetButton(8);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn8ActionPerformed

    //  BUTTON -> Btn7
    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed

        if (player)
        {
            if (!btn7)
            {
                SetButton(7);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn7ActionPerformed

    //  BUTTON -> Btn6
    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed

        if (player)
        {
            if (!btn6)
            {
                SetButton(6);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn6ActionPerformed

    //  BUTTON -> Btn5
    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed

        if (player)
        {
            if (!btn5)
            {
                SetButton(5);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn5ActionPerformed

    //  BUTTON -> Btn4
    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed

        if (player)
        {
            if (!btn4)
            {
                SetButton(4);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn4ActionPerformed

    //  BUTTON -> Btn3
    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed

        if (player)
        {
            if (!btn3)
            {
                SetButton(3);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn3ActionPerformed

    //  BUTTON -> Btn2
    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed

        if (player)
        {
            if (!btn2)
            {
                SetButton(2);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn2ActionPerformed

    //  BUTTON -> Btn1
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed

        if (player)
        {
            if (!btn1)
            {
                SetButton(1);
                player = false;

                if (!CheckWinner())
                {
                    ComTurn();
                    CheckWinner();
                }
            }
        }
    }//GEN-LAST:event_Btn1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AverageComputer;
    private javax.swing.JLabel AveragePlayer;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel GamesComputer;
    private javax.swing.JLabel GamesPlayer;
    private javax.swing.JButton NextRound;
    private javax.swing.JLabel PlayerName;
    private javax.swing.JLabel Round;
    private javax.swing.JButton StartGame;
    private javax.swing.JLabel WinsComputer;
    private javax.swing.JLabel WinsPlayer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
