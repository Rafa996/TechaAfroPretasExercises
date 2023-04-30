package classExercises;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso I1 = new Ingresso();
		
		I1.artista= "Beyonce";
		I1.data_show= "10/04/2024";
		I1.horario= "22h";
		I1.endereco = "Alianz Parque";
		I1.quantidadeIngresso = 2;
		I1.email = "rafaela@gmail.com";
		
		
		
		I1.visualizar(I1.artista, I1.data_show, I1.horario, I1.endereco, I1.quantidadeIngresso, I1.email);
		
	}

}
