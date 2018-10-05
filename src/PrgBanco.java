/*
 * 		ESSE PROGRAMA TEM A FUNÇÃO DE MOVIMENTAR UMA CONTA:
 * 	ABRIR OU FECHAR A CONTA;
 *	ESCOLHER O CP "conta-corrente" ou CC "conta-poupança";
 * 	NÚMERO DA CONTA ;
 * 	NOME DO DONO ;
 * 	DEPOSITAR OU SACAR.
 * 	CC = 50 E CP = 150 ao abrir a conta.
 * 
 */
public class PrgBanco {
	public static void main(String[] args) {
		
		//exemplo depositando em uma CC:
		ContaBanco cliente1 = new ContaBanco();
		cliente1.setNumConta(1111);
		cliente1.abrirConta("CC");
		cliente1.setDono("João");
		cliente1.depositar(100);
		cliente1.estadoAtual();
		//exemplo depositando e sacando em uma CP
		ContaBanco cliente2 = new ContaBanco();
		cliente2.setNumConta(2222);
		cliente2.abrirConta("CP");
		cliente2.setDono("Maria");
		cliente2.depositar(500);
		cliente2.sacar(1000);
		cliente2.estadoAtual();
		
	}
	

}
