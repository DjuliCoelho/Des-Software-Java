package Principal.model;

public class Bike {
	
	private Quadro Quadro;
	private Roda rodaDianteira;
	private Roda rodaTraseira;
	
	public Quadro getQuadro() {
		return Quadro;
	}
	
	public Roda getrodaDianteira() {
		return rodaDianteira;
	}
	
	public Roda getrodaTraseira() {
		return rodaTraseira;
	}
		
	
	public void getQuadro(Quadro Quadro) {
		this.Quadro = Quadro;
	}
	
	public void getrodaDianteira(Roda rodaDianteira) {
		this.rodaDianteira = rodaDianteira;
	}
	
	public void getrodaTraseira(Roda rodaTraseira) {
		this.rodaTraseira = rodaTraseira;
	}
	
	
	
	

}
