package classExercises;

import java.util.Scanner;

public class Cliente {
	
		    Scanner input = new Scanner (System.in);
			// Declaração de Atributos
			String nome; 
			String profissao;
			String email;
			String endereco;
			int cpf;
			
					
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getProfissao() {
				return profissao;
			}

			public void setProfissao(String profissao) {
				this.profissao = profissao;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getEndereco() {
				return endereco;
			}

			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}

			public int getCpf() {
				return cpf;
			}

			public void setCpf(int cpf) {
				this.cpf = cpf;
			}
			// Declaração de Métodos
			void visualizar (String exibir_nome, String exibir_profissao, int exibir_cpf, String exibir_endereco, String exibir_email) {
				System.out.println("        ____Dados do Cliente____ \n\n"+ "nome: \n"+exibir_nome);
				System.out.println ("Profissao: \n" +exibir_profissao);
				System.out.println ("Endereço: \n" + exibir_email);
				System.out.println ("E-mail: \n" + exibir_endereco);
				System.out.println ("CPF: \n"+ exibir_cpf);
			}

}



