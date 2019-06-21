/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Josue
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Interface extends PlainDocument{
    public void inserString(int offset, String str, javax.swing.text.AttributeSet attr)throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9^ ]", ""), attr);
    }
    
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^a-z|^A-Z|^ ]", ""), attr);
    }
}
    
}
