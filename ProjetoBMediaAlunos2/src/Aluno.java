
public class Aluno {
	
	public String nome;
	public int matricula;
	public double nota1;
	public double nota2;
	public double media;
	
	
	public double calcularMedia() {
		
		double media = (nota1 + nota2) / 2;
		return media;
		
		}
	
	public void verificar(double media) {
		if (media >= 7) {
			System.out.println("VOCE FOI APROVADO");
		} else {
			System.out.println("VOCE FOI REPROVADO");
		}
	}
	
}
