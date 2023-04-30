package classExercises;

import java.util.Scanner;

public class Ingresso {
	Scanner input = new Scanner (System.in);
	// Declaração de Atributos
	String artista; 
	String data_show;
	String horario;
	String endereco;
	String email;
	int quantidadeIngresso;
	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getData_show() {
		return data_show;
	}

	public void setData_show(String data_show) {
		this.data_show = data_show;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantidadeIngresso() {
		return quantidadeIngresso;
	}

	public void setQuantidadeIngresso(int quantidadeIngresso) {
		this.quantidadeIngresso = quantidadeIngresso;
	}

	
	// Declaração de Métodos
	
				void visualizar (String artista, String data_show, String horario, String endereco, int quantidade, String email) {
					System.out.println("        ____Dados do Ingresso____ \n\n"+ "Artista: "+artista+"\n");
					System.out.println ("Data do Show: " +data_show+"\n");
					System.out.println ("Horario do evento: " + horario+"\n");
					System.out.println ("Endereco do evento: " + endereco +"\n");
					System.out.println ("Quantidade de Ingressos: "+ quantidade+"\n");
					System.out.println ("O(s) Ingresso(s) sera(ao) enviado(s) para o email:"+email+"\n");
				}
}