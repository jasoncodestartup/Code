
public class Code1_6 {
	public static void rotate(int[][] img, int N){
		for (int width = N; width > 1; width -= 2){
			int r0 = (N - width)/2;
			int c0 = (N - width)/2;
			int tmp;
			
			for (int idx = 0; idx < width - 1; idx++){	
				tmp 										= img[r0][c0+idx];
				img[r0][c0+idx] 							= img[r0 + width - 1 - idx][c0];
				img[r0 + width - 1 - idx][c0]				= img[r0 + width - 1][c0 + width - 1 - idx];
				img[r0 + width - 1][c0 + width - 1 - idx]	= img[r0 + idx][c0 + width - 1];
				img[r0 + idx][c0 + width - 1]				= tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int img[][] = { { 1,  2,  3,  4},   // 13  9  5  1
						{ 5,  6,  7,  8},	// 14 10  6  2
						{ 9, 10, 11, 12},	// 15 11  7  3
						{13, 14, 15, 16}};	// 16 12  8  4
		
		
		rotate(img, N);
		for (int r = 0; r < N; r++){
			for (int c = 0; c < N; c++){
				System.out.print("" + img[r][c] + " ");
			}
			System.out.println();
		}
		
		int img2[][] = { 	{1, 2, 3, 4, 5},
							{6, 7, 8, 9, 10},
							{11, 12, 13, 14, 15},
							{16, 17, 18, 19, 20},
							{21, 22, 23, 24, 25} };
		N = 5;
		rotate(img2, N);
		
		System.out.println();
		for (int r = 0; r < N; r++){
			for (int c = 0; c < N; c++){
				System.out.print("" + img2[r][c] + " ");
			}
			System.out.println();
		}
	}
}
