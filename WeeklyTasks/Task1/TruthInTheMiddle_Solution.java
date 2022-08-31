import java.util.Scanner;

public class TruthInTheMiddle{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n <=1 || n %2 == 0){
            System.out.println("Invalid size of the matrix");
            return;
        }

        int middle = (n+1)/2;

        int countTruth = 0;
        int columnTruth = 0;
        int rowTruth = 0;

        for(int column = 1; column <= n; ++column){
            for(int row = 1; row <= n; ++row){
                if(scan.next().charAt(0) == 'T'){
                    ++countTruth;
                    columnTruth = column;
                    rowTruth = row;        
                }
            }
        }

        if(countTruth != 1){
            System.out.println("Error! Exactly one truth please");
            return;
        }

        System.out.println(Math.abs(middle - columnTruth) + Math.abs(middle - rowTruth));
    }
}
