package packageGerenciamento;

public class Aluno {
	private String nome;
	private float [] notas = new float [3];
	private int codigoAluno;
	private int frequenciaAluno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	public int getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public int getFrequencia() {
		return frequenciaAluno;
	}

	public void setFrequencia(int frequencia){
		this.frequenciaAluno = frequencia;
	}
}
