public class Pv2{
	public static void main(String[] agrs){
		HspMethod student = new HspMethod();
		System.out.println(student.showScore
			("张三",80.0,94.0,100));
	}
}

class HspMethod{
	public String showScore(String name,double...scores){
		double total = 0;
		for(int i = 0; i<scores.length;i++){
			total += scores[i];
		}
		return name +"  " + scores.length +"门科目的总成绩为：  " + total;
	}
}