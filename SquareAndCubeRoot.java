package square.cube;

import java.util.Scanner;

public class SquareAndCubeRoot {

	int iA;
	double dSqrt=0, dCube=0;
		
	public void SquareCubeRoot(int iC)
	{
		
		iA = iC;
		dSqrt= Math.sqrt(iA);
		dCube= Math.cbrt(iA);
		System.out.println(" The square root of given number " + iA + " is " + dSqrt  + ".");
		System.out.println(" The cube root of given number " + iA + " is " + dCube + ".");
	
	}
	
	public static void main(String[] args){
		
		int iB;
		Scanner sS = new Scanner(System.in);
		
		System.out.println("Enter the number for which you would like to know the square root and cube root:");
		iB = sS.nextInt();
				
		SquareAndCubeRoot S = new SquareAndCubeRoot();
		S.SquareCubeRoot(iB);
		
	}
	
}
