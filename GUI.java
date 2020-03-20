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

    private static final long serialVersionUID = 9L;
    
    //  Vars to set the Buttons in a used state
    private boolean btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    
    //  Vars to set the Owner of the Buttons (0 = empty; 1 = Player; 2 = Computer;
    private int btn1O, btn2O, btn3O, btn4O, btn5O, btn6O, btn7O, btn8O, btn9O;  
    
    private boolean player;
    private String name;
    private static Image imgX, imgO, imgQ;  //  imgO is an big "O" like Oval
    private int random, round, winPl, winCom, winner;
    private float avePl, aveCom;    //  the average of wins (in percent)


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
        Text = new javax.swing.JLabel();
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
        setTitle("Tic Tac Toe v.1.0.0.0");
        setBackground(new java.awt.Color(0, 102, 255));
        setForeground(new java.awt.Color(0, 153, 255));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        Round.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Round.setForeground(new java.awt.Color(255, 255, 255));
        Round.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
            .addComponent(Round, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NextRound, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WinsPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GamesPlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AveragePlayer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(WinsComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(GamesComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AverageComputer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Round, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Text, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
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
                                .addGap(110, 110, 110)
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
                        .addGap(70, 70, 70)
                        .addComponent(StartGame)
                        .addGap(67, 67, 67)
                        .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(WinsPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GamesPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AveragePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NextRound)
                        .addGap(18, 18, 18)
                        .addComponent(Exit)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
//  Internal Functions
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
        }
        catch (IOException ex){}
    }
    
    //  Set Buttons
    private void SetButtons(int button)
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
        Btn2.setIcon(new ImageIcon(imgQ));
        Btn3.setIcon(new ImageIcon(imgQ));
        Btn4.setIcon(new ImageIcon(imgQ));
        Btn5.setIcon(new ImageIcon(imgQ));
        Btn6.setIcon(new ImageIcon(imgQ));
        Btn7.setIcon(new ImageIcon(imgQ));
        Btn8.setIcon(new ImageIcon(imgQ));
        Btn9.setIcon(new ImageIcon(imgQ));
    }
    
    //  Set Text Elements
    private void SetText()
    {
        if (round != 0 && winPl != 0)
            avePl = (float)(winPl * 100 / round);
        else if (round != 0 && winCom != 0)
            aveCom = (float)(winCom * 100 / round);
        
        Round.setText("Round " + round);
        PlayerName.setText(name);
        WinsPlayer.setText("Wins: " + winPl);
        GamesPlayer.setText("Rounds: " + round);
        AveragePlayer.setText("Average: " + avePl);
        WinsComputer.setText("Wins: " + winCom);
        GamesComputer.setText("Rounds: " + round);
        AverageComputer.setText("Average: " + aveCom);
    }
    
    
    
//  Game Routine Functions
////////////////////////////////////////////////////////////////////////////////
    
    //  Game
    private void Game()
    {
        
        //CheckScore();
        
        if (!player)
        {
            Text.setText("Computer turn.");
            ComTurn();
        }   
        else
            Text.setText("" + name + "'s turn.");
        
        //CheckScore();
    }
    
    //  Com Turn
    private void ComTurn()
    {
        //  Com First Turn
        if (btn1O == 0 && btn2O == 0 && btn3O == 0 && btn4O == 0 && btn5O == 0 && 
                btn6O == 0 && btn7O == 0 && btn8O == 0 && btn9O == 0) 
            ComFirstTurn();                 
        
        //  Check if Player can win
        else if (btn2O == 1 && btn3O == 1)  //  Button 1 Check if Player can win
            ComCheckBtn1();
        else if (btn4O == 1 && btn7O == 1)
            ComCheckBtn1();
        else if (btn5O == 1 && btn8O == 1)  //  Button 2 Check if Player can win
            ComCheckBtn2();
        else if (btn1O == 1 && btn3O == 1)
            ComCheckBtn2();
        else if (btn1O == 1 && btn2O == 1)  //  Button 3 Check if Player can win
            ComCheckBtn3();
        else if (btn6O == 1 && btn9O == 1)  
            ComCheckBtn3();
        else if (btn5O == 1 && btn7O == 1)
            ComCheckBtn3();
        else if (btn1O == 1 && btn7O == 1)  //  Button 4 Check if Player can win
            ComCheckBtn4();
        else if (btn5O == 1 && btn6O == 1)
            ComCheckBtn4();
        else if (btn1O == 1 && btn9O == 1)  //  Button 5 Check if Player can win
            ComCheckBtn5();
        else if (btn3O == 1 && btn7O == 1)
            ComCheckBtn5();
        else if (btn2O == 1 && btn8O == 1)
            ComCheckBtn5();
        else if (btn4O == 1 && btn6O == 1)
            ComCheckBtn5();
        else if (btn3O == 1 && btn9O == 1)  //  Button 6 Check if Player can win
            ComCheckBtn6();
        else if (btn4O == 1 && btn5O == 1)
            ComCheckBtn6();
        else if (btn1O == 1 && btn4O == 1)  //  Button 7 Check if Player can win
            ComCheckBtn7();
        else if (btn8O == 1 && btn9O == 1)  
            ComCheckBtn7();
        else if (btn5O == 1 && btn3O == 1)
            ComCheckBtn7();
        else if (btn2O == 1 && btn5O == 1)  //  Button 8 Check if Player can win
            ComCheckBtn8();
        else if (btn7O == 1 && btn9O == 1)
            ComCheckBtn8();
        else if (btn3O == 1 && btn6O == 1)  //  Button 9 Check if Player can win
            ComCheckBtn9();
        else if (btn7O == 1 && btn8O == 1)
            ComCheckBtn9();
        else if (btn1O == 1 && btn5O == 1)
            ComCheckBtn9();
        
        //  Check if Com can win
        else if (btn2O == 2 || btn3O == 2)  //  Button 1 Check
            ComCheckBtn1();
        else if (btn4O == 2 || btn7O == 2)
            ComCheckBtn1();
        else if (btn5O == 2 || btn8O == 2)  //  Button 2 Check
            ComCheckBtn2();
        else if (btn1O == 2 || btn3O == 2)
            ComCheckBtn2();
        else if (btn1O == 2 || btn2O == 2)  //  Button 3 Check
            ComCheckBtn3();
        else if (btn6O == 2 || btn9O == 2)  
            ComCheckBtn3();
        else if (btn5O == 2 || btn7O == 2)
            ComCheckBtn3();
        else if (btn1O == 2 || btn7O == 2)  //  Button 4 Check
            ComCheckBtn4();
        else if (btn5O == 2 || btn6O == 2)
            ComCheckBtn4();
        else if (btn1O == 2 || btn9O == 2)  //  Button 5 Check
            ComCheckBtn5();
        else if (btn3O == 2 || btn7O == 2)
            ComCheckBtn5();
        else if (btn2O == 2 || btn8O == 2)
            ComCheckBtn5();
        else if (btn4O == 2 || btn6O == 2)
            ComCheckBtn5();
        else if (btn3O == 2 || btn9O == 2)  //  Button 6 Check
            ComCheckBtn6();
        else if (btn4O == 2 || btn5O == 2)
            ComCheckBtn6();
        else if (btn1O == 2 || btn4O == 2)  //  Button 7 Check
            ComCheckBtn7();
        else if (btn8O == 2 || btn9O == 2)  
            ComCheckBtn7();
        else if (btn5O == 2 || btn3O == 2)
            ComCheckBtn7();
        else if (btn2O == 2 || btn5O == 2)  //  Button 8 Check
            ComCheckBtn8();
        else if (btn7O == 2 || btn9O == 2)
            ComCheckBtn8();
        else if (btn3O == 2 || btn6O == 2)  //  Button 9 Check
            ComCheckBtn9();
        else if (btn7O == 2 || btn8O == 2)
            ComCheckBtn9();
        else if (btn1O == 2 || btn5O == 2)
            ComCheckBtn9();
        
        //  Other Com Choice
        else
            ComCheckTurn();
        
        player = true;
        Text.setText("" + name + " 's turn.");
    }
    
    //  Com First Turn
    private void ComFirstTurn()
    {
        if (btn1O == 0 && btn2O == 0 && btn3O == 0 && btn4O == 0 && btn5O == 0 && 
                btn6O == 0 && btn7O == 0 && btn8O == 0 && btn9O == 0)
        {
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
    }
    
    //  Com Check Btn1
    private void ComCheckBtn1()
    {
        if (!btn1)
        {
            //  Btn1 -> Btn5 == Btn9 -> if Player can win
            if (btn5O == 1 && btn9O == 1)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn5 == Btn9 -> if Com can win
            else if(btn5O == 2 && btn9O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn2 == btn3 -> if Player can win
            else if (btn2O == 1 && btn3O == 1)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn2 == btn3 -> if Com can win
            else if (btn2O == 2 && btn3O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn4 == Btn7 -> if Player can win
            else if (btn4O == 1 && btn7O == 1)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn4 == Btn7 -> if Com can win
            else if (btn4O == 2 && btn7O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn5 || Btn9 -> Com Choice
            else if (btn5O == 2 || btn9O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn2 || Btn3 -> Com choice
            else if (btn2O == 2 || btn3O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
            //  Btn1 -> Btn4 || Btn7 -> Com choice
            else if (btn4O == 2 || btn7O == 2)
            {
                btn1 = true;
                btn1O = 2;
                Btn1.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn2
    private void ComCheckBtn2()
    {
        if (!btn2)
        {
            //  Btn2 -> Btn1 == Btn3 -> if Player can win
            if (btn1O == 1 && btn3O == 1)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            //  Btn2 -> Btn1 == Btn3 -> if Com can win
            else if (btn1O == 2 && btn3O == 2)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            //  Btn2 -> Btn5 == Btn8 -> if Player can win
            else if (btn5O == 1 && btn8O == 1)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            //  Btn2 -> Btn5 == Btn8 -> if Com can win
            else if (btn5O == 2 && btn8O == 2)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            //  Btn2 -> Btn1 || Btn3 -> (Com choice)
            else if (btn1O == 2 || btn3O == 2)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
            //  Btn2 -> Btn5 || Btn8 -> (Com choice)
            else if (btn5O == 2 || btn8O == 2)
            {
                btn2 = true;
                btn2O = 2;
                Btn2.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn3
    private void ComCheckBtn3()
    {
        if (!btn3)
        {
            //  Btn3 -> Btn1 == btn2 -> if Player can win
            if (btn1O == 1 && btn2O == 1)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            //  Btn3 -> Btn1 == btn2 -> if Com can win
            else if (btn1O == 2 && btn2O == 2)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            //  Btn3 -> Btn6 == btn9 -> if Player can win
            else if (btn6O == 1 && btn9O == 1)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            //  Btn3 -> Btn5 == btn7 -> if Player can win
            else if (btn6O == 1 && btn7O == 1)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            //  Btn3 -> Btn1 == btn7 if Com can win
            else if (btn1O == 2 || btn2O == 2)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn6O == 2 || btn9O == 2)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 || btn7O == 2)
            {
                btn3 = true;
                btn3O = 2;
                Btn3.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn4
    private void ComCheckBtn4()
    {
        if (!btn4)
        {
            if (btn1O == 1 && btn7O == 1)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 1 && btn6O == 1)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 2 || btn7O == 2)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
            else if (btn5O == 2 && btn6O == 2)
            {
                btn4 = true;
                btn4O = 2;
                Btn4.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn5
    private void ComCheckBtn5()
    {
        if (!btn5)
        {
            if (btn1O == 1 && btn9O == 1)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 1 && btn7O == 1)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 1 && btn8O == 1)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 1 && btn6O == 1)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            
            else if (btn1O == 2 || btn9O == 2)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 || btn7O == 2)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 2 || btn8O == 2)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 2 || btn6O == 2)
            {
                btn5 = true;
                btn5O = 2;
                Btn5.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn6
    private void ComCheckBtn6()
    {
        if (!btn6)
        {
            if (btn3O == 1 && btn9O == 1)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 1 && btn5O == 1)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 || btn9O == 2)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
            else if (btn4O == 2 || btn5O == 2)
            {
                btn6 = true;
                btn6O = 2;
                Btn6.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn7
    private void ComCheckBtn7()
    {
        if (!btn7)
        {
            if (btn1O == 1 && btn4O == 1)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn8O == 1 && btn9O == 1)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 2 || btn4O == 2)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
            else if (btn8O == 2 || btn9O == 2)
            {
                btn7 = true;
                btn7O = 2;
                Btn7.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn8
    private void ComCheckBtn8()
    {
        if (!btn8)
        {
            if (btn2O == 1 && btn5O == 1)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 1 && btn9O == 1)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn2O == 2 || btn5O == 2)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 2 || btn9O == 2)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Btn9
    private void ComCheckBtn9()
    {
        if (!btn9)
        {
            if (btn3O == 1 && btn6O == 1)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 1 && btn8O == 1)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 1 && btn5O == 1)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn3O == 2 && btn6O == 2)
            {
                btn9 = true;
                btn9O = 2;
                Btn9.setIcon(new ImageIcon(imgO));
            }
            else if (btn7O == 2 && btn8O == 2)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
            else if (btn1O == 2 && btn5O == 2)
            {
                btn8 = true;
                btn8O = 2;
                Btn8.setIcon(new ImageIcon(imgO));
            }
        }
    }
    
    //  Com Check Turn
    private void ComCheckTurn()
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
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
                    ComCheckTurn();
                    break;
                }
        }
    }
    
    
    
//  Buttons Action Performed
////////////////////////////////////////////////////////////////////////////////
    
    //  BUTTON -> Exit
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

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
        Game();
    }//GEN-LAST:event_StartGameActionPerformed

    //  BUTTON -> Next Round
    private void NextRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRoundActionPerformed
        
        if (winner != 0)
        {
            round++;
            ResetButtons();
            SetText();
            Game();
        }
    }//GEN-LAST:event_NextRoundActionPerformed

    //  BUTTON -> Btn1
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        
        if (player)
        {
            if (!btn1)
            {
                SetButtons(1);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn1ActionPerformed

    //  BUTTON -> Btn2
    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        
        if (player)
        {
            if (!btn2)
            {
                SetButtons(2);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn2ActionPerformed

    //  BUTTON -> Btn3
    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        
        if (player)
        {
            if (!btn3)
            {
                SetButtons(3);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn3ActionPerformed

    //  BUTTON -> Btn4
    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        
        if (player)
        {
            if (!btn4)
            {
                SetButtons(4);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn4ActionPerformed

    //  BUTTON -> Btn5
    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        
        if (player)
        {
            if (!btn5)
            {
                SetButtons(5);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn5ActionPerformed

    //  BUTTON -> Btn6
    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        
        if (player)
        {
            if (!btn6)
            {
                SetButtons(6);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn6ActionPerformed

    //  BUTTON -> Btn7
    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        
        if (player)
        {
            if (!btn7)
            {
                SetButtons(7);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn7ActionPerformed

    //  BUTTON -> Btn8
    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        
        if (player)
        {
            if (!btn8)
            {
                SetButtons(8);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn8ActionPerformed

    //  BUTTON -> Btn9
    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        
        if (player)
        {
            if (!btn9)
            {
                SetButtons(9);
                player = false;
                Game();
            }
        }
    }//GEN-LAST:event_Btn9ActionPerformed



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
    private javax.swing.JLabel Text;
    private javax.swing.JLabel WinsComputer;
    private javax.swing.JLabel WinsPlayer;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
