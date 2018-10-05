
public class ContaBanco {
	
	// ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// CONSTRUTOR
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0); 
	}
	
	// MÉTODOS ESPECIAIS
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return dono;		
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;		
	}
	public float getSaldo() {
		return saldo;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	
	// MÉTODOS PERSONALIZADOS
	public void estadoAtual() {
		
		System.out.println("=====================================");
		System.out.println(	"Conta..: "+ this.getNumConta()+
							"\nTipo : "+this.getTipo()+
							"\nDono : "+this.getDono()+
							"\nSaldo: "+this.getSaldo()+
							"\nStatus:"+this.isStatus());	
		System.out.println("=====================================");
				
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
			if (tipo.equals("CC")) {
				this.setSaldo(50);	
			}
			else if("CP".equals(tipo)) {
				this.setSaldo(150);
			}
			
			System.out.println("Conta aberta com sucesso!");
			
		
	}
	public void fecharConta() {
		if (this.getSaldo()>0) {
			System.out.println( "Conta não pode ser fechada. \n Retire seu dinheiro!");
		}else if (this.getSaldo()<0) {
			System.out.println("Conta não pode ser fechada. \n Você contem débito!");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com Sucesso!!!");
		}
	}
	
	public void depositar(float valor) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo()+valor);
			System.out.println("Depósito realizado com sucesso \n para:"+this.getDono());			
		} else {
			System.out.println("Impossível depositar. Conta Inesistente!");
		}
		
	}
	public void sacar(float valor) {
		if(this.isStatus()) {
			if (this.getSaldo()>= valor){
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de:"+this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque "+this.getDono()+"!");
			}
		}else {
			System.out.println("Impossível sacar. Conta inesistente!");
		}
	}
	public void pagarMensalidade() {
	int valor = 0;
		if (this.getTipo().equals("CC")) {
			valor = 12;
		}else if (this.getTipo().equals("CP")) {
			valor = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo()- valor);
			System.out.println("Mensalidade paga com sucesso por: "+this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada");
		}
	}
	
}
