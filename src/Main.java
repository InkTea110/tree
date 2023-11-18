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
            tree.insert(rand.nextInt(100));
        }
        tree.print();
        System.out.println();
        System.out.println("min tree value: "+ tree.minValue());
        System.out.println("max tree value: "+ tree.maxValue());
        System.out.println("tree sum: " + tree.sum());
        System.out.println("tree elements: " + tree.count());
        System.out.println("avg: " + tree.avg());

        uniqueTree u_tree=new uniqueTree();
        for(int i=0;i<n;i++){
            u_tree.insert(rand.nextInt(100));
        }
        u_tree.clear();
        u_tree.print();
        System.out.println();
        System.out.println("min tree value: "+ u_tree.minValue());
        System.out.println("max tree value: "+ u_tree.maxValue());
        System.out.println("tree sum: " + u_tree.sum());
        System.out.println("tree elements: " + u_tree.count());
        System.out.println("avg: " + u_tree.avg());
    }
}