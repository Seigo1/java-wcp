package polymorphism.human;

public class Employee extends Human {
	private String department;
		
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getPlofile() {
		String plofile = "年齢は" + this.age + "です。";
		plofile += "サラリーマンで、部署は" + this.department + "です。";
		return plofile;
	}
}
