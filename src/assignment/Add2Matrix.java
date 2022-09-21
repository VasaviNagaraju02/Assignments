package assignment;


public class Add2Matrix
{
	public static void main(String[] args) {
		int m1[][] = {{1,2,1},{5,1,0},{2,2,2}};
		int m2[][] = {{1,0,1},{2,1,0},{3,1,1}};
		if(m1.length != m2.length || m1[0].length != m2[0].length){
			System.out.println("Matrices orders are not same, so Addition not possible ");
			return;
			}
		int res[][] = new int[m1.length][m1[0].length];
		for(int i=0; i<m1.length; i++){
			for(int j=0; j<m1[0].length; j++){
				res[i][j] = m1[i][j]+m2[i][j];
				System.out.print(res[i][j]+" ");
				}
			 System.out.println();
        }        
    }
}


