package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
		public static void main (String [] args) {
			String [] candidatos = {"FELIPE", "MATHEUS", "JULIA", "THAÍS", "CHARLOTE"};
			for (String candidato : candidatos) {
				entrandoEmContato(candidato);
			}
			
		}
		
		static void entrandoEmContato(String candidato) {
			int tentativas = 1;
			boolean continuar = true;
			boolean atendeu = false;
			do {
				atendeu = atender();
				continuar = !atendeu;
				if (continuar)
					tentativas++;
				else
					System.out.println("Contato realizado com sucesso");
			}
			while (continuar && tentativas < 3);
			
			if (atendeu)
				System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + " tentativa.");
			else
				System.out.println("Não conseguimos contato com " + candidato + ". O número máximo de " + tentativas + " tentativas foram realizados.");
		}
		
		static boolean atender() {
			return new Random().nextInt(3)==1;
		}
		
		
		static void imprimirSelecionados () {
			String [] candidatos = {"FELIPE", "MATHEUS", "JULIA", "THAÍS", "CHARLOTE"};
			
			System.out.println("Imprimindo lista de candidatos informando o índice do elemento");
			
			for (int indice = 0; indice < candidatos.length; indice++) {
				System.out.println("O candidato de nº" + indice+1 + " é o candidato " + candidatos[indice]);
			}
			
			System.out.println("Forma abreviada com EACH");
				for (String candidato: candidatos) {
					System.out.println("O candidato selecionado foi" + candidato);
				}
		}
		
		static void selecaoCandidatos() {
			String [] candidatos = {"FELIPE", "MATHEUS", "THEO", "JULIA", "CAIO", "LENA", "THAÍS", "CLARISSA", "CHARLOTE", "RAVIH"};
			
			int candidatosSelecionados = 0;
			int candidatoAtual = 0;
			double salarioBase = 2000.0;
			while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
				String candidato = candidatos[candidatoAtual];
				double pretensaoSalarial = valorPretendido();
				
				System.out.println("O candidato " + candidato + " tem a pretensão salarial de " + pretensaoSalarial);
					if (salarioBase >= pretensaoSalarial) {
						System.out.println("O candidato " + candidato + " foi selecionado.");
						candidatosSelecionados++;
					}
				candidatoAtual++;
			}		
				
			
		}
			
		static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800, 2200);
		}
		
		static void analisarCandidato(double pretensaoSalarial) {
			double salarioBase = 2000.0;
			if (salarioBase > pretensaoSalarial)
				System.out.println("LIGAR PARA CANDITADO");
			else if (pretensaoSalarial == salarioBase)
				System.out.println("LIGAR PARA CANDITADO COM CONTRA PROPOSTA");
			else
				System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
}
