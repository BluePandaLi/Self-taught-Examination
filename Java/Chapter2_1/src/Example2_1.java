


public class Example2_1 {
	
	public static void main(String[] args){

		//计算精度与所算的值有关
		System.out.println(100%8.5);

		//要详细的看括号所括的位置
		int x = 100;		
		System.out.println("5.5"+ (float)(x/8));

		
		//“++” “--“运算符要求运算分量是数值类型的变量。
		//int x1 = 10, y=20, z=30;
		//x1 = (y+z)++;
		//System.out.println(x);

		
		//在同一算式中a并不寄存，a += a -= b + 2。
		int a = 10, b = 20;
		a += a -= b + 2; //10 += 10 -= 22, 10 += -12, -2
		System.out.println(a + "," + b);

		
		//关系运算符的，操作类型必须是数字
		//System.out.println(5>4>3);
		
		
		
		//逻辑运算，当第一个条件满足时会终止运算。
		int a1,b1,c1;
		a1 = b1 = c1 =1;
		boolean w = ++a1 > 1 || ++b1 < ++c1;
		System.out.println(a1+","+b1+","+c1+","+w);
		
		
		//x并不寄存
		int x1 = 0, y1 = 10;
		boolean w1 = x != 0 && y1/x > 2;
		System.out.println(x1 + "," + y1 + "," + w1);
		
		
		//让x2的最低n位为1，其余位为0的运算。该题目与x2的初始值无关。
		int x2 =2, n = 5;
		x2 = ~(~0 << n);
		System.out.println(x2);
		
//		double hello = Math.abs(-1);
		
		
	}
}
