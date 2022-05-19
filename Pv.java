public class Pv{
	public static void main(String[] agrs){
	      T t = new T();
	      int[] arr = {1,2,3}
	      t.sum(1,2,3);
	      t.sum(10,20);
	      // 可变参数的形参，可以是一个数组
	      t.sum(arr);
	}
}

class T{
	//  0-多个参数
	public int sum(int... x){
		System.out.println("接收了" + x.length + "个参数");
		int s = 0;
		for(int i = 0; i<x.length;i++){
			s += x[i];
		}
		System.out.println(s);
		return s;
	}
        // 可变参数可以和普通类型的参数一起放在形参列表，
        //  但必须保证可变参数在最后
        //  一个形参列表，只能有一个可变参数
	public void sum2(String str, double...nums){

	}
}