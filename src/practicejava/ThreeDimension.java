package practicejava;

public class ThreeDimension {

	public static void main(String[] args) {
		
		int three[][]= {{8,3,7},{6,7,9},{4,3,4}};	
		
		int max = three[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(three[i][j]>max) {
					max=three[i][j];
				}
				
			}
			
		}

		System.out.println(max);
	}

}
