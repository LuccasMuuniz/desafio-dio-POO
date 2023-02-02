package desafioDioPOO;

public class Principal {
	public static void main(String[] args) {
		Cursos curso1 = new Cursos();
		curso1.setTitulo("java");
		curso1.setDescricao("Java POO");
		curso1.setCargaHoraria(4);
		
		
		Cursos curso2 =  new Cursos();
		curso2.setTitulo("BD");
		curso2.setDescricao("fundamentos BD");
		curso2.setCargaHoraria(10);
		
		Mentoria m = new Mentoria();
		m.setTitulo("Como nao endoidar ?");
		m.setDescricao("nao tenho ideia !!!");
		
		
		Bootcamp bot = new Bootcamp();
		bot.setNome("Qualquer porra");
		bot.getConteudo().add(curso1);
		bot.getConteudo().add(curso2);
		bot.getConteudo().add(m);
		
		
		Dev dev1 = new Dev();
		dev1.setNome("Lucas");
		dev1.inscreverBootcamp(bot);
		System.out.println(dev1.getConteudoInscrito());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-------------------------------------------------------");
		System.out.println(dev1.getConteudoInscrito());
		System.out.println(dev1.calcularTotXp());
		
		
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Doido");
		dev2.inscreverBootcamp(bot);
		System.out.println(dev2.getConteudoInscrito());
		dev2.progredir();
		System.out.println(dev2.getConteudoInscrito());
		System.out.println(dev2.calcularTotXp());
		
		
	}
}
