package packageGerenciamento;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
	private int codigoDisciplina;
	private String nomeDisciplina;
	private int cargaHorariaDisciplina;
	private Professor professorDisciplina;
	private List<Aluno> alunosDisciplina;
	private int frequenciaMinima;

	public Disciplinas(int codigo, String nome, int cargaHoraria, Professor professor, int frequenciaMinima) {
		this.codigoDisciplina = codigo;
		this.nomeDisciplina = nome;
		this.cargaHorariaDisciplina = cargaHoraria;
		this.professorDisciplina = professor;
		this.alunosDisciplina = new ArrayList<Aluno>();
		this.frequenciaMinima = frequenciaMinima;

	}	

	public int getCodigo() {
		return codigoDisciplina;
	}

	public void setCodigo(int codigo) {
		this.codigoDisciplina = codigo;
	}

	public String getNome() {
		return nomeDisciplina;
	}

	public void setNome(String nome) {
		this.nomeDisciplina = nome;
	}

	public int getCargaHoraria() {
		return cargaHorariaDisciplina;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHorariaDisciplina = cargaHoraria;
	}



	public void setAlunosDisciplina(Aluno aluno) {

		boolean adicionaAluno = true;

		for (Aluno alunoEmQuestao : alunosDisciplina) {
			if (alunoEmQuestao.getCodigoAluno() == aluno.getCodigoAluno()) {
				adicionaAluno = false;
			}
		}
		if (adicionaAluno == false) {
			System.out.println("O ALUNO JÁ ESTÁ CADASTRADO NA DISCIPLINA...");
		} else {
			this.alunosDisciplina.add(aluno);
		}
	}

	public List<Aluno> getAlunosDisciplina() {
		return this.alunosDisciplina;
	}

	@Override

	public String toString() {
		return "Codigo Discplina:"
				+ this.codigoDisciplina
				+ "\n"
				+ "Nome Disciplina:"
				+ this.nomeDisciplina
				+ "\n"
				+ "Carga Horária: "
				+ this.cargaHorariaDisciplina
				+ "\n"
				+ "Nome professor: "
				+ this.professorDisciplina.getNome();

	}



}
