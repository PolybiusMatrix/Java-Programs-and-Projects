import java.util.Random;

public class twoDArr{
	public static void main(String[] args){
		int[][] arr = new int[6][4];
		Random rand = new Random();

		int j = 0;
		int i = 0;

		do{
			for(j = 0; j < 3; j++){
				arr[i][j] = rand.nextInt(10);
				if(j == 2)
					i++;
			}
		}while(i != 5);

		for(int k = 0; k < 3; k++){
			arr[0][3] += arr[0][k];
			System.out.printf("%4d", arr[0][k]);
		}
		for(int k = 0; k < 3; k++){
			arr[1][3] += arr[1][k];
			System.out.printf()
		}
		for(int k = 0; k < 3; k++)
			arr[2][3] += arr[2][k];

		for(int k = 0; k < 3; k++)
			arr[3][3] += arr[3][k];

		for(int k = 0; k < 3; k++)
			arr[4][3] += arr[4][k];
//--------------------------------------------------
		for(int k = 0; k < 5; k++)
			arr[5][0]+= arr[k][0];

		for(int k = 0; k < 5; k++)
			arr[5][1]+= arr[k][1];

		for(int k = 0; k < 5; k++)
			arr[5][2]+= arr[k][2];

		arr[5][0] = 0;

		/*arr[0][0] = rand.nextInt(10);
		arr[0][1] = rand.nextInt(10);
		arr[0][2] = rand.nextInt(10);
		for(int i = 0; i < 3; i++)
			arr[0][3] += arr[0][i];

		arr[1][0] = rand.nextInt(10);
		arr[1][1] = rand.nextInt(10);
		arr[1][2] = rand.nextInt(10);
		for(int i = 0; i < 3; i++)
			arr[1][3] += arr[1][i];

		arr[2][0] = rand.nextInt(10);
		arr[2][1] = rand.nextInt(10);
		arr[2][2] = rand.nextInt(10);
		for(int i = 0; i < 3; i++)
			arr[2][3] += arr[2][i];

		arr[3][0] = rand.nextInt(10);
		arr[3][1] = rand.nextInt(10);
		arr[3][2] = rand.nextInt(10);
		for(int i = 0; i < 3; i++)
			arr[3][3] += arr[3][i];

		arr[4][0] = rand.nextInt(10);
		arr[4][1] = rand.nextInt(10);
		arr[4][2] = rand.nextInt(10);
		for(int i = 0; i < 3; i++)
			arr[4][3] += arr[4][i];

		for(int i = 0; i < 5; i++)
			arr[5][0]  += arr[5][i];

		for(int i = 0; i < 5; i++)
			arr[4][0]  += arr[4][i];

		for(int i = 0; i < 5; i++)
			arr[3][0]  += arr[3][i];

		for(int i = 0; i < 5; i++)
			arr[2][0]  += arr[2][i];

		for(int i = 0; i < 5; i++)
			arr[1][0]  += arr[1][i];

		for(int i = 0; i < 5; i++)
			arr[0][0]  += arr[0][i];

		arr[5][3] = 0;

		for(int i = 0; i < 4; i++){
			System.out.printf("%4d%n", arr[5][i]);
		}

		for(int i = 0; i < 6; i++){
			System.out.printf("%4d%n", arr[i][3]);
		}

//-----------------------------------------------------------------||\\--*/


	}
}
