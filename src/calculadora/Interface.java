/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import static javax.swing.text.StyleConstants.setIcon;

/**
 *
 * @author Josue
 */

public class Interface extends javax.swing.JFrame {
    

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        setIcon(); 
    }
    //Variaveis
    Double N1,N2;
    String sinal;
    String Event;
    String str;
    //Chamada De eventos pelo teclado
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Interface = new javax.swing.JPanel();
        Resultado = new javax.swing.JTextField();
        Porcentagem = new javax.swing.JButton();
        Raiz = new javax.swing.JButton();
        Dividir = new javax.swing.JButton();
        Potencia = new javax.swing.JButton();
        CE = new javax.swing.JButton();
        C = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        Multiplicar = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Subtrair = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        Soma = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        PosNeg = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Calculadora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Interface.setBackground(new java.awt.Color(55, 55, 55));

        Resultado.setBackground(new java.awt.Color(46, 46, 46));
        Resultado.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 9, true));
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        Resultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResultadoKeyTyped(evt);
            }
        });

        Porcentagem.setBackground(new java.awt.Color(52, 52, 52));
        Porcentagem.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Porcentagem.setForeground(new java.awt.Color(255, 255, 255));
        Porcentagem.setText("%");
        Porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcentagemActionPerformed(evt);
            }
        });

        Raiz.setBackground(new java.awt.Color(52, 52, 52));
        Raiz.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Raiz.setForeground(new java.awt.Color(255, 255, 255));
        Raiz.setText("√");
        Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaizActionPerformed(evt);
            }
        });

        Dividir.setBackground(new java.awt.Color(52, 52, 52));
        Dividir.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Dividir.setForeground(new java.awt.Color(255, 255, 255));
        Dividir.setText("÷");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        Potencia.setBackground(new java.awt.Color(52, 52, 52));
        Potencia.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Potencia.setForeground(new java.awt.Color(255, 255, 255));
        Potencia.setText("x²");
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(52, 52, 52));
        CE.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        CE.setForeground(new java.awt.Color(255, 255, 255));
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(52, 52, 52));
        C.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        Apagar.setBackground(new java.awt.Color(52, 52, 52));
        Apagar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Apagar.setForeground(new java.awt.Color(255, 255, 255));
        Apagar.setText("<-x");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        Multiplicar.setBackground(new java.awt.Color(52, 52, 52));
        Multiplicar.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        Multiplicar.setText("*");
        Multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicarActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(52, 52, 52));
        B7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(52, 52, 52));
        B8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(52, 52, 52));
        B9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        Subtrair.setBackground(new java.awt.Color(52, 52, 52));
        Subtrair.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Subtrair.setForeground(new java.awt.Color(255, 255, 255));
        Subtrair.setText("-");
        Subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtrairActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(52, 52, 52));
        B5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(52, 52, 52));
        B4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(52, 52, 52));
        B6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        Soma.setBackground(new java.awt.Color(52, 52, 52));
        Soma.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Soma.setForeground(new java.awt.Color(255, 255, 255));
        Soma.setText("+");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(52, 52, 52));
        B2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(52, 52, 52));
        B1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        B1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B1KeyPressed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(52, 52, 52));
        B3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(52, 52, 52));
        B0.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        B0.setForeground(new java.awt.Color(255, 255, 255));
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        PosNeg.setBackground(new java.awt.Color(52, 52, 52));
        PosNeg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        PosNeg.setForeground(new java.awt.Color(255, 255, 255));
        PosNeg.setText("+/-");
        PosNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosNegActionPerformed(evt);
            }
        });

        ponto.setBackground(new java.awt.Color(52, 52, 52));
        ponto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        ponto.setForeground(new java.awt.Color(255, 255, 255));
        ponto.setText(".");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });

        Igual.setBackground(new java.awt.Color(52, 52, 52));
        Igual.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Igual.setForeground(new java.awt.Color(255, 255, 255));
        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        Igual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IgualKeyPressed(evt);
            }
        });

        Calculadora.setBackground(new java.awt.Color(102, 0, 0));
        Calculadora.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        Calculadora.setForeground(new java.awt.Color(255, 255, 255));
        Calculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Calculadora.setText("Calculadora");
        Calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout InterfaceLayout = new javax.swing.GroupLayout(Interface);
        Interface.setLayout(InterfaceLayout);
        InterfaceLayout.setHorizontalGroup(
            InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InterfaceLayout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InterfaceLayout.createSequentialGroup()
                                .addComponent(PosNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Resultado))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addComponent(Porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        InterfaceLayout.setVerticalGroup(
            InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterfaceLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Porcentagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InterfaceLayout.createSequentialGroup()
                        .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PosNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Interface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Interface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // adicionar 7:
        Resultado.setText(Resultado.getText()+"7");
        B7.setBackground(new Color(1,1,1));
    }//GEN-LAST:event_B7ActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        //Apagar o ultimo numero:
        String str = Resultado.getText();
        StringBuilder w = new StringBuilder(str);
        str = String.valueOf( w.deleteCharAt(str.length() - 1) );
        Resultado.setText(str);
    }//GEN-LAST:event_ApagarActionPerformed

    private void RaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaizActionPerformed
        // Calculo Da Raiz
        N1 = Double.parseDouble(Resultado.getText());
        N1 = Math.sqrt(N1);
        String Texto3;
        Texto3 = String.valueOf(N1);
        Resultado.setText(Texto3);
    }//GEN-LAST:event_RaizActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        // Adicionar 0
        Resultado.setText(Resultado.getText()+"0");
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // Adicionar 1
        Resultado.setText(Resultado.getText()+"1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // Adicionar 2
        Resultado.setText(Resultado.getText()+"2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // Adicionar 3
        Resultado.setText(Resultado.getText()+"3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // Adicionar 4
        Resultado.setText(Resultado.getText()+"4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // Adicionar 5
        Resultado.setText(Resultado.getText()+"5");
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // Adicionar 6
        Resultado.setText(Resultado.getText()+"6");
    }//GEN-LAST:event_B6ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // Adicionar 8
        Resultado.setText(Resultado.getText()+"8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // Adicionar 9
        Resultado.setText(Resultado.getText()+"9");
    }//GEN-LAST:event_B9ActionPerformed

    private void PosNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosNegActionPerformed
        // Deixar o numero negativo 
        N1 = Double.parseDouble(Resultado.getText());
        if(N1 > 0){
            N1 = N1*(-1);
        }
        else{
        N1 = N1*(-1);}
        String Texto;
        Texto = String.valueOf(N1);
        Resultado.setText(Texto);
    }//GEN-LAST:event_PosNegActionPerformed

    private void PorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcentagemActionPerformed
        // Calculo Da Porcentagem
        N2 = Double.parseDouble(Resultado.getText());
        N2 = (N2*100)/N1;
        String Texto4;
        Texto4 = String.valueOf(N2);
        Resultado.setText(Texto4);
    }//GEN-LAST:event_PorcentagemActionPerformed

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
        // Colocar um Ponto
        Resultado.setText(Resultado.getText()+".");
    }//GEN-LAST:event_pontoActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        // Apagar o Numero total
        Resultado.setText("");
    }//GEN-LAST:event_CEActionPerformed

    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        // Chama Soma
        N1 = Double.parseDouble(Resultado.getText());
        sinal ="soma";
        Resultado.setText("");
    }//GEN-LAST:event_SomaActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        // Executa as operações
        N2 = Double.parseDouble(Resultado.getText());
        // Operações Matematicas>>
        if(sinal == "soma"){
            Resultado.setText(String.valueOf(N1+N2));
        }
        else if(sinal == "subtrair"){
            Resultado.setText(String.valueOf(N1-N2));
        }
        else if(sinal == "multiplicar"){
            Resultado.setText(String.valueOf(N1*N2));
        }
        else if(sinal == "dividir"){
            Resultado.setText(String.valueOf(N1/N2));
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void SubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtrairActionPerformed
        // Chama a Subtração
        N1 = Double.parseDouble(Resultado.getText());
        sinal ="subtrair";
        Resultado.setText("");
    }//GEN-LAST:event_SubtrairActionPerformed

    private void MultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicarActionPerformed
        // Multiplica
        N1 = Double.parseDouble(Resultado.getText());
        sinal ="multiplicar";
        Resultado.setText("");
    }//GEN-LAST:event_MultiplicarActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        // Chama a divisão
        N1 = Double.parseDouble(Resultado.getText());
        sinal ="dividir";
        Resultado.setText("");
    }//GEN-LAST:event_DividirActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
        // potencializa
        N1 = Double.parseDouble(Resultado.getText());
        N1 = N1*N1;
        String Texto2;
        Texto2 = String.valueOf(N1);
        Resultado.setText(Texto2);
    }//GEN-LAST:event_PotenciaActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // Exclui os numeros
        N1 = null;
        N2 = null;
        Resultado.setText("");
    }//GEN-LAST:event_CActionPerformed
// Precionamento de botões
    private void IgualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IgualKeyPressed

    }//GEN-LAST:event_IgualKeyPressed

    private void B1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1KeyPressed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_ResultadoActionPerformed

    private void ResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResultadoKeyTyped
        // TODO add your handling code here:
        String numFornecedor = Resultado.getText();
        int quantCaracteres = numFornecedor.length();
        if (quantCaracteres >= 16) {
            numFornecedor = numFornecedor.substring(0, numFornecedor.length() - 1);
            Resultado.setText(numFornecedor);
        }
        char c = evt.getKeyChar();
     
    if(c<'0' || c>'9');
   evt.consume();
    }//GEN-LAST:event_ResultadoKeyTyped
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton C;
    private javax.swing.JButton CE;
    private javax.swing.JLabel Calculadora;
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Igual;
    private javax.swing.JPanel Interface;
    private javax.swing.JButton Multiplicar;
    private javax.swing.JButton Porcentagem;
    private javax.swing.JButton PosNeg;
    private javax.swing.JButton Potencia;
    private javax.swing.JButton Raiz;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton Soma;
    private javax.swing.JButton Subtrair;
    private javax.swing.JButton ponto;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icone.jpg")));
    }
}
