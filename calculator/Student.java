//在一个java文件中只能编写类
//类里面只能放变量，方法
class Student {
	String name;
	String sex;
	int age;
	int height;

	void study()
	{
		System.out.println(name+"学习");
	}
	//运行的时候，是从main这个方法开始，不是从程序的第一行开始
	//编码从第一行开始编写，以类的结构编写

	public static void main(String[] args) {
		//创建对象
		Student x=new Student();
		x.name="张泽浩";
		x.sex="男";
		x.study();
		Student y=new Student();
		y.name="杨静";
		y.sex="女";
		y.study();
		new Student().name="王文硕";
		new Student().name="金白澈";
	}
}
