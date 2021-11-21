package polymorphism.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public String getPlofile() {
		String plofile = "年齢は" + super.age + "です。";
		plofile += "学生で、テストの点数は" + this.score + "点です。";
		return plofile;
	}
}
