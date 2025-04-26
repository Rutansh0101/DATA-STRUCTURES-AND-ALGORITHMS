import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();
        
        for(int i = 0; i < r; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < c; j++){
                list.add(sc.nextInt());
            }
            mainList.add(list);
        }

        // reversing the ArrayList:
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c/2; j++){
                int temp = mainList.get(i).get(j);
                mainList.get(i).set(j, mainList.get(i).get(c-j-1));
                mainList.get(i).set(c-j-1, temp);
            }
        }

        // Printing the ArrayList:
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(mainList.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
