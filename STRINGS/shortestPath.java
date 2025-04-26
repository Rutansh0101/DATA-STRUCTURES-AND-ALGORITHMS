import java.util.Scanner;

public class shortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = 0, y = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'N'){
                y++;
            }
            else if(s.charAt(i) == 'S'){
                y--;
            }
            else if(s.charAt(i) == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        System.out.println("x = " + x + " y = " + y);
        int shortestDistance = ((x - 0) * (x - 0)) + ((y-0) * (y - 0));
        System.out.print(shortestDistance);
    }
}
