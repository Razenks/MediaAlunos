import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Aluno media = new Aluno();
		
		System.out.println("Digite seu nome");
		aluno.nome = scanner.nextLine();
		
		System.out.println("Olá "+ aluno.nome +"Digite o numero da sua matricula: ");
		aluno.matricula = scanner.nextInt();
		
		System.out.println("Coloque suas notas aqui: ");
		aluno.nota1 = scanner.nextDouble();
		aluno.nota2 = scanner.nextDouble();	
		
		System.out.println("A Média das suas notas é: "+ aluno.calcularMedia());
		
		aluno.verificar(aluno.calcularMedia());
	}
}
