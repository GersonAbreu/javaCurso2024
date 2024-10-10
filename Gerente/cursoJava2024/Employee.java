package cursoJava2024;

public class Employee {// classe pai
	protected String name;// São dois atributos (variavel) da classe Empregado. O modificador protected significa que esses atributos são acessíveis dentro da classe, por classes no mesmo pacote, e também por classes que herdam de Empregado
	protected double salary;
	protected int age;

	public Employee(String name, double salary, int age) {// construtora da classe Employee. Ele é chamado quando um novo objeto da classe é criado.
		this.name = name;//Isso ajuda a diferenciar o atributo do objeto (this.name) do parâmetro do método (name), que têm o mesmo nome. Então, o this garante que você está mexendo no valor do objeto que acabou de ser criado.
		this.salary = salary;
		this.age = age;//O uso de this é especialmente útil quando os nomes dos parâmetros são os mesmos que os dos atributos da classe.
	}
	
	public double calculateBonus() {// metodo para calcular o bonus de 10%: do salario:
		return this.salary * 0.10;
	}
	
	public void showEmployeeData() {//metodo para exibir dados do empregado:
		System.out.println("Nome: "+name);
		System.out.println("Salário: "+salary);
		System.out.println("Bonus: "+calculateBonus());
		System.out.println("Idade: "+age);
		System.out.println("Salario Total: "+ (salary + calculateBonus() ));
		
	}
}
