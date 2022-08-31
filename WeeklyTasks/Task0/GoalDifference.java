import java.util.*;

public class GoalDifference{
    public static void main(String[] args){
        //TODO: write your code here
        Scanner scanner = new Scanner(System.in);

        try{
            int firstTeamGoals = scanner.nextInt();
            int secondTeamGoals = scanner.nextInt();

            if(firstTeamGoals<0 || secondTeamGoals<0){
                System.out.println("Bad input");
            }else if(firstTeamGoals > secondTeamGoals){
                System.out.println("The match is won by "+(firstTeamGoals-secondTeamGoals)+" goals");
            }else if(firstTeamGoals < secondTeamGoals){
                System.out.println("The match is won by "+(secondTeamGoals-firstTeamGoals)+" goals");
            }else{
                System.out.println("The match is a tie");
            }
        }catch(Exception e){
            System.out.println("Bad input");
        }
    }
}
