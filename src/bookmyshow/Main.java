/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bookmyshow;

/**
 *
 * @author students
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Loginopt().setVisible(true);
        connection cn=new connection();
       try
       {cn.connect();
    }
       catch(Exception e)
       {
           
       }

}
}