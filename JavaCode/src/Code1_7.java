
public class Code1_7 {
	public static void zeroOut(int[][] mtx, int M, int N){
		boolean[] rows = new boolean[M];
		boolean[] cols = new boolean[N];
		
		// find rows and columns to zero out
		for (int r = 0; r < M; r++){
			for (int c = 0; c < N; c++){
				if (mtx[r][c] == 0){
					rows[r] = true;
					cols[c] = true;
					break;
				}
			}
		}
		
		for (int r = 0; r < M; r++){
			for (int c = 0; c < N; c++){
				if (rows[r] || cols[c]){
					mtx[r][c] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mtx[][] = { {1, 2, 3, 0, 4},	// 0 0 0 0 0
						{0, 1, 2, 2, 2},	// 0 0 0 0 0
						{1, 1, 1, 1, 1} };	// 0 1 1 0 1
		zeroOut(mtx, 3, 5);
		
		for (int r = 0; r < 3; r++){
			for (int c = 0; c < 5; c++){
				System.out.print(""+mtx[r][c]+" ");
			}
			System.out.println();
		}
	}

}
