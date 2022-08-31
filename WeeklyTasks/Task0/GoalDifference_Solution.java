import java.util.Scanner;

public class GoalDifference_Solution{
    public static void main(String[] args){

        int team1Goals = 0;
        int team2Goals = 0;
        
        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){
            team1Goals = scan.nextInt();
            if(team1Goals < 0){
                System.out.println("Bad input");
                return;
            }
        }else{
            System.out.println("Bad input");
            return;
        }

        if(scan.hasNextInt()){
            team2Goals = scan.nextInt();
            if(team2Goals < 0){
                System.out.println("Bad input");
                return;
            }
        }else{
            System.out.println("Bad input");
            return;
        }

        if(team1Goals > team2Goals)
            System.out.println("The match is won by " + (team1Goals-team2Goals) + " goals");
        else if(team2Goals > team1Goals)
            System.out.println("The match is won by " + (team2Goals-team1Goals) + " goals");
        else
            System.out.println("The match is a tie");           
    }
}
