package jaggedarray;
public class JaggedArray {
	public static void main(String[] args)
	{
		int [][] jar=new int [3][];
		jar[0]=new int[4];
		jar[1]=new int[3];
		jar[2]=new int[2];
		jar[0][0]=9;
		jar[0][1]=99;
		jar[0][2]=999;
		jar[0][3]=9999;
		jar[1][0]=8;
		jar[1][1]=88;
		jar[1][2]=888;
		jar[2][0]=7;
		jar[2][1]=77;
		 for (int r=0;r<jar.length;r++) {
			 for (int c=0;c<jar[r].length;c++)
			 {
				 System.out.print(jar[r][c]+" ");
			 }
			 System.out.println();
			 }
		 }
			 
}

