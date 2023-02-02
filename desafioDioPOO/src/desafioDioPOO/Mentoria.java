package desafioDioPOO;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data = LocalDate.now();
	

	@Override
	public double calcularXp() {
		
		return Xp_Padrao + 20d;
	}


	@Override
	public String toString() {
	 	return "nome = "+this.getTitulo()+ " descricao: " + this.getDescricao()+ " data: "+this.data;
	}
	
	

}
