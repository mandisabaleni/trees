import java.util.*;
import java.io.*;

/**Creates a AVL Tree representation of Dams.
 *@author Mandisa Baleni
 *@author balenidiana@gmail.com
 */

public class DamAVLApp{

    static AVLTree<String> tree = new AVLTree<String>();
    /**Runs main method, puts data of dams into AVL Tree.
     * @param args Receives arguments from the terminal.
     * @throws Tries to access the Dam text file to run program, throws error message when due.
     */

    public static void main (String[] args){

        try{
            File text = new File("damdoc.txt");
            Scanner input = new Scanner(text);
            String[] d;
            input.nextLine();
          
            for(int i=0; i< 211; i++){
                String sentence = input.nextLine();
                d= sentence.split(",", 45);

                tree.insert(d[2].trim(), " " + d[10] + " " + d[42]);
            }


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
        
}

