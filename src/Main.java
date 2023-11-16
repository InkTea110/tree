import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random(0);
        System.out.println("Enter tree size: ");
        int n =scan.nextInt();
        tree tree=new tree();
        for(int i=0;i<n;i++){
            tree.insert(rand.nextInt(100),tree.getRoot());
        }
        tree.print(tree.getRoot());
        System.out.println();
        System.out.println("min tree value: "+ tree.minValue(tree.getRoot()));
        System.out.println("max tree value: "+ tree.maxValue(tree.getRoot()));
        System.out.println("tree sum: " + tree.sum(tree.getRoot()));
    }
}