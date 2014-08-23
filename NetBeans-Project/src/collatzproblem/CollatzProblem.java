/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collatzproblem;

/**
 *
 * @author Nikolai
 */
import java.math.BigInteger;
import java.util.Scanner;


public class CollatzProblem {

	//bisher war ich bei 66_461_563 ohne Fehler
	
	static BigInteger max = new BigInteger("1000000000");
	static BigInteger n;
	
	public static void main(String[] args) {
		
            System.out.println("Do you want to get Infos about the current state (true/false) ?");
            Scanner scan = new Scanner(System.in);
            boolean Info = scan.nextBoolean();
            
            for (BigInteger i = BigInteger.ONE; i.compareTo(max) == -1; i = i.add(BigInteger.ONE)) {
                n = i;
                if (Info) {
                    System.out.println(i);
                }
                while (n.compareTo(new BigInteger("4")) != 0) {
                    if ( (n.mod(new BigInteger("2")) .compareTo(BigInteger.ZERO) == 0 ) ) {
                        n = n.divide(new BigInteger("2"));
                    }
                    else {
                        n =  ( n.multiply(new BigInteger("3")) .add(BigInteger.ONE) );	//*3 nicht umbedingt nötig
                    }
                    //System.out.println(n);
                }	
            }
		/*n = 113383;
		while (n != 1) {
			if (n%2 == 0) {
				n /= 2;
			}
			else {
				n = 3*n +1;
			}
			System.out.println(n);
		}*/
            System.out.println("Finished!");
	}
	
}

