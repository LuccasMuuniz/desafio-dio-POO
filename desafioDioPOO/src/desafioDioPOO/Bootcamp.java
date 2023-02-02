package desafioDioPOO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFinal = dataInicio.plusDays(45);
	
	private Set<Dev> devsInscritos = new HashSet();
	private Set<Conteudo> conteudo = new LinkedHashSet<>();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudo, dataFinal, dataInicio, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudo, other.conteudo) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(devsInscritos, other.devsInscritos)
				&& Objects.equals(nome, other.nome);
	}

	
	
}
