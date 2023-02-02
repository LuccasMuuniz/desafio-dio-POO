package desafioDioPOO;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
	private String nome;
	
	/*Usa-se os set, pq tem a logica de que o dev so ira se inscrever 1 unica vez*/
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido =  new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
		conteudoInscrito.addAll(bootcamp.getConteudo());
		
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		// pegar o 1° termo do set conteudo inscrito e poem nesse Option que foi feito pra trabalhar com valor NULL
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		// verifica se esta null esse isPresent
		if (conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		}else {
			System.err.println("Você nao esta matriculado em nenhuma aula");
		}
		
	}
	
	
	public double calcularTotXp() {
		return this.conteudoConcluido.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}
	
	
	
}
