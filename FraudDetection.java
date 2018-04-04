import java.util.*;
import java.lang.*;

public class FraudDetection{
        /**
        * A function that flags multiple transactions that are over $20000 by the same user
        */
        public void multipleTransactions(){

        }
        /**
        *A function that flags transactions that are unusually round
        */
        public void evenlyDivisibleTransactions(){

        }
        /**
        *Flags pawn shops, casinos and resorts
        */
        public void shops(){

        }
        /**
        *Flags infrequently used airlines
        */
        public void infrequentlyUsedAirlines(){

        }
        /**
        *Flags transactions over $50000
        */
        public void largeTransactions(){

        }
        /**
        *reads in the file and passes different columns to different functions and prints
        *everything to the command line
        */
	public static void main(String[] args){
                ArrayList<String[]> transactions = new ArrayList<String[]>();
		Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                while(scanner.hasNext()){
                        String line = scanner.nextLine();
                        String[] split_line = line.split(",");
                        if (Integer.valueOf(split_line[6])>= 50000){
                                transactions.add(split_line);
                        }
                        
                }
                scanner.close();
                System.out.println(transactions);
	}
}