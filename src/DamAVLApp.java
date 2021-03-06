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
        PrintWriter fw = null;

        try{
            File text = new File("damdoc.txt");
            Scanner input = new Scanner(text);
            fw = new PrintWriter(new FileOutputStream("opCountDamAVLApp.txt"));
            String[] d;
            input.nextLine();

            for(int i=0; i< 211; i++){
                String sentence = input.nextLine();
                d= sentence.split(",", 45);

                tree.insert(d[2].trim(), " " + d[10] + " " + d[42]);
                //tree.getInsertCount()-1);
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        if (args.length == 0){
            printAllDams();
        }
        else{
            for(String s: args){
                printDam(s);
            }
            //fw.println("comparisons for searched dam: " + (tree.getSearchCount()-1));
            //fw.println("comparisons for inserted dam: " + (tree.getInsertCount()-1));
            fw.close();   
         //   System.out.println("No. of insert comparisons: " + (tree.getInsertCount()-1));
           // System.out.println("No. of search comparisons: " + (tree.getSearchCount() -1));
        }


    }
    /**Searches user input dam and prints it.
     * @param damName The user input dam.
     */    
    public static void printDam(String damName){
        if (tree.find(damName) != null){
            System.out.println(tree.find(damName));
        }
        
        else {
            System.out.println("Dam not found");
        }
    }
    /**Prints all dams.
    */ 
    public static void printAllDams(){
        tree.treeOrder();
    }
}

