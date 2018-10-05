package outroBanco;

public class Cliente extends Pessoa{
	private String tipoConta;
	Cliente(){
	tipoConta="<escolha uma conta>";		
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
}
