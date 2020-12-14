import java.math.BigInteger;
import java.security.SecureRandom;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class RSA extends javax.swing.JFrame {
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    
    private BigInteger p, q, n, phiN, e, d;
    private final int KEY_SIZE = 1024;
    private final BigInteger one;
    private final SecureRandom rnd;
    
    public RSA() {
        e = new BigInteger("65537");
        one = new BigInteger("1");
        rnd = new SecureRandom();        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AC-RSA");

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Encryption", "Decryption" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Plaintext");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Ciphertext");

        jTextArea2.setColumns(20);  jTextArea2.setEditable(false);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Generate keys");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Encrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Encryption exponent, e");

        jTextArea3.setColumns(20);  jTextArea3.setEditable(false);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel4.setText("Modulus of the congruence, n");

        jTextArea4.setColumns(20);  jTextArea4.setEditable(false);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jButton3.setText("Use Existing Public Key");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save Keys");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setResizable(false);
    }// </editor-fold>                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {    // change mode whether encryption or decryption action listener                                           
        // TODO add your handling code here:
        String s = (String) jComboBox1.getSelectedItem();
        if(s.equals("Encryption")){
            jButton1.setVisible(true);
            jButton4.setVisible(true);
            
            jButton2.setText("Encrypt");
            jButton3.setText("Use Existing Public Key");
            jLabel1.setText("Plaintext");
            jLabel2.setText("Ciphertext");
            jLabel3.setText("Encryption exponent, e");
            jTextArea1.setText(null);
            jTextArea2.setText(null);
            jTextArea3.setText(null);
            jTextArea4.setText(null);
        }
        
        if(s.equals("Decryption")){
            jButton1.setVisible(false);
            jButton4.setVisible(false);
            
            jButton2.setText("Decrypt");
            jButton3.setText("Use Existing Private Key");
            jLabel1.setText("Ciphertext");
            jLabel2.setText("Plaintext");
            jLabel3.setText("Decryption exponent, d");
            jTextArea1.setText(null);
            jTextArea2.setText(null);
            jTextArea3.setText(null);
            jTextArea4.setText(null);
        }
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  // generate keys button action listener                                        
        // TODO add your handling code here:
        String s = (String) jComboBox1.getSelectedItem();
        if(evt.getSource() == jButton1 && s.equals("Encryption")){
            p = BigInteger.probablePrime(KEY_SIZE/2, rnd);  // generate a prime number f or BigInteger in such format: .probablePrime(int size, SecureRandom rnd)
            q = BigInteger.probablePrime(KEY_SIZE/2, rnd);
            phiN = (p.subtract(one)).multiply(q.subtract(one));   // phi(n) = (p-1)(q-1)
            n = p.multiply(q);  // BigInteger p multiply BidInteger q assign to BigInteger n
            d = e.modInverse(phiN); // get the inverse of e which is d, such that ed = 1 mod phi(n)
            
            jTextArea3.setText(e.toString());
            jTextArea4.setText(n.toString());
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  // encrypt/decrypt button action listener                                         
        // TODO add your handling code here:
        String s = (String) jComboBox1.getSelectedItem();
        if(evt.getSource() == jButton2 && jTextArea1.getText().isEmpty() && s.equals("Encryption")){    // message when encrypt button is clicked but plaintext field is empty
            JOptionPane.showMessageDialog(null, 
            "Please enter a plaintext.", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(evt.getSource() == jButton2 && jTextArea1.getText().isEmpty() && s.equals("Decryption")){    // message when decrypt button is clicked but ciphertext field is empty
            JOptionPane.showMessageDialog(null, 
            "Please enter a ciphertext.", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);
        }        
        
        if(evt.getSource() == jButton2 && (jTextArea3.getText().isEmpty() || jTextArea4.getText().isEmpty()) && s.equals("Encryption")){    //  message when encrypt button is clicked but no proper public key is used for encrypting  
            JOptionPane.showMessageDialog(null, 
            "Please ensure a proper public key is used.", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(evt.getSource() == jButton2 && (jTextArea3.getText().isEmpty() || jTextArea4.getText().isEmpty()) && s.equals("Decryption")){    //  message when decrypt button is clicked but no proper private key is used for decrypting  
            JOptionPane.showMessageDialog(null, 
            "Please ensure a proper private key is used.", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);
        }        
        
        if(evt.getSource() == jButton2 && (!jTextArea1.getText().isEmpty() && !jTextArea3.getText().isEmpty() && !jTextArea4.getText().isEmpty()) && s.equals("Encryption")){   //  perform encryption through clicking encrypt button when there is plaintext and public key
            String m = jTextArea1.getText();
            byte [] bytes = m.getBytes();
            BigInteger plaintext = new BigInteger(bytes);
            BigInteger ciphertext = encrypt(plaintext);
            
            jTextArea2.setText(ciphertext.toString());
        }  
        
        if(evt.getSource() == jButton2 && (!jTextArea1.getText().isEmpty() && !jTextArea3.getText().isEmpty() && !jTextArea4.getText().isEmpty()) && s.equals("Decryption")){   //  perform decryption through clicking decrypt button when there is ciphertext and private key
            String c = jTextArea1.getText();
            BigInteger ciphertext = new BigInteger(c);
            BigInteger plaintext = decrypt(ciphertext);
            
            jTextArea2.setText(new String(plaintext.toByteArray()));
        }         
    }    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {  //  open public/private key button action listener                                         
        // TODO add your handling code here:
        String s = (String) jComboBox1.getSelectedItem();
        if(evt.getSource() == jButton3 && s.equals("Encryption")){
            JFileChooser chooser = new JFileChooser();  //  JFileChooser for choosing directory to open public key
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Text files (.txt)", "txt");    //  filter for text files when searching
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Select Public Key");  //  JFileChooser's title when searching public key
            
            int returnVal = chooser.showOpenDialog(null);   
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = chooser.getSelectedFile().toString();
                
                try{
                    FileReader fileReader = new FileReader(fileName);   // FileReader reads text files in the default encoding
                    
                    BufferedReader bufferedReader = new BufferedReader(fileReader); //  always wrap FileReader in BufferedReader
                    
                    String line1 = bufferedReader.readLine();   //  read e
                    jTextArea3.setText(line1);  //  set e into the text area for e
                    
                    String line2 = bufferedReader.readLine();   // read n
                    jTextArea4.setText(line2);  //  set n into the text area for n
                    
                    bufferedReader.close(); //  always close files
                    
                    jButton4.setVisible(false);
                }               
                catch(FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null,
                    "File not found",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                } 
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,
                    "Error occurred during file read",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }            
        }

        if(evt.getSource() == jButton3 && s.equals("Decryption")){
            JFileChooser chooser = new JFileChooser();  //  JFileChooser for choosing directory to open private key
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Text files (.txt)", "txt");    //  filter for text files when searching
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Select Public Key");  //  JFileChooser's title when searching private key
            
            int returnVal = chooser.showOpenDialog(null);   
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = chooser.getSelectedFile().toString();
                
                try{
                    FileReader fileReader = new FileReader(fileName);   // FileReader reads text files in the default encoding
                    
                    BufferedReader bufferedReader = new BufferedReader(fileReader); //  always wrap FileReader in BufferedReader
                    
                    String line1 = bufferedReader.readLine();   //  read d
                    jTextArea3.setText(line1);  //  set d into the text area for d
                    
                    String line2 = bufferedReader.readLine();   // read n
                    jTextArea4.setText(line2);  //  set n into the text area for n
                    
                    bufferedReader.close(); //  always close files
                }               
                catch(FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null,
                    "File not found",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                } 
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,
                    "Error occurred during file read",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }            
        }        
    }   
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {  //  save button action listener                                         
        // TODO add your handling code here:
        String s = (String) jComboBox1.getSelectedItem();
        if(evt.getSource() == jButton4 && (jTextArea3.getText().isEmpty() || jTextArea4.getText().isEmpty())){    //  message when save keys button is clicked but keys are not generated, leaving e and n text area empty 
            JOptionPane.showMessageDialog(null, 
            "Please ensure keys are properly generated.", 
            null, 
            JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(evt.getSource() == jButton4 && (!jTextArea3.getText().isEmpty() && !jTextArea4.getText().isEmpty())){  //  perform saving of public key and private key by clicking save button when keys are generated
            JFileChooser chooser = new JFileChooser();  //  JFileChooser for choosing directory to save public key and private key
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Text files (.txt)", "txt");    //  filter for text files when saving
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Save Public Key");  //  JFileChooser's title when saving public key
            
            int returnVal = chooser.showSaveDialog(null);   
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = chooser.getSelectedFile().toString();
                
                if(!fileName.substring(fileName.lastIndexOf(".") + 1).equals("txt")){   //  if file does not have .txt extension, then add the extension at the end of file name
                    fileName = fileName + ".txt";
                }
                
                try{
                    PrintWriter writer = new PrintWriter(fileName, "UTF-8"); 
                    writer.println(jTextArea3.getText());
                    writer.println(jTextArea4.getText());
                    writer.close();
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,
                    "Error occurred during file creation",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            
            chooser.setDialogTitle("Save Private Key"); //  JFileChooser's title when saving private key
            
            returnVal = chooser.showSaveDialog(null);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                String fileName = chooser.getSelectedFile().toString();
                
                if(!fileName.substring(fileName.lastIndexOf(".") + 1).equals("txt")){   //  if file does not have .txt extension, then add the extension at the end of file name
                    fileName = fileName + ".txt";
                }
                
                try{
                    PrintWriter writer = new PrintWriter(fileName, "UTF-8"); 
                    writer.println(d.toString());
                    writer.println(jTextArea4.getText());
                    writer.close();
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,
                    "Error occurred during file creation",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }      
    }      
    
    private BigInteger encrypt(BigInteger plaintext) {
        e = new BigInteger(jTextArea3.getText());
        n = new BigInteger(jTextArea4.getText());
        return plaintext.modPow(e, n);
    }    
    
    private BigInteger decrypt(BigInteger ciphertext) {
        d = new BigInteger(jTextArea3.getText());
        n = new BigInteger(jTextArea4.getText());
        return ciphertext.modPow(d, n);
    }    
    
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
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RSA().setVisible(true);
            }
        });
    }      
}
