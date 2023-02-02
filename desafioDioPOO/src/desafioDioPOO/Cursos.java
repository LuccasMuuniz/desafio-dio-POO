package desafioDioPOO;

public class Cursos extends Conteudo {
	
	private int cargaHoraria;
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		
		return Xp_Padrao * 5d;
	}

	@Override
	public String toString() {
		return "nome do curso  = "+this.getTitulo()+ " descricao: " + this.getDescricao()+" carga horaria: "+ this.cargaHoraria;
	}
	
	
}
