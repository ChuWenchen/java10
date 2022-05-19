public class Method05{
	public static void main(String[] agrs){
		int[][] arr = new int[2][2]
		arr = {{1,2},{,3,4}};
		MyTools mT = new MyTools();
		mT.myPrint(arr);

	}
}

class MyTools{
	public void myPrint(int[][] x){
		for(int i = 0; i<x.length; i++){
			for(int j = 0; j<x[i].length; j++){
				System.out.print(x[i][j] + "  ");
			}
			System.out.println();
		}
	}
}