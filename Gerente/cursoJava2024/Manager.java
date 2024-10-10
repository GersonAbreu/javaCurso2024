package cursoJava2024;

public class Manager extends Employee {
	private String department;
	
	public Manager(String name,double salary, int age, String department) {
		super(name,salary,age);//esta declarando e usando os atributos da variavel na classe pai
		this.department = department;
	}
	//metodo para calcular o bonus de 20% do salario:
	@Override
	public double calculateBonus() {
		return this.salary * 0.20;
	}
	
	//metodo para exibir dados do gerente:
	@Override
	public void showEmployeeData() {
		super.showEmployeeData();
		System.out.println("Departamento: " + department);
	}
}
