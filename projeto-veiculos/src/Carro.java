
public class Carro extends VeiculoAutomotor implements Tributavel {

		private boolean motorLigado;
		
		public Carro() {
			this.motorLigado = false;
		}

		public boolean isMotorLigado() {
			return motorLigado;
		}

		public void ligar() {
			this.motorLigado = true;
		}
		
		public void desligar() {
			this.motorLigado = false;
		}

		@Override
		public Double calculoDeValorComDesconto() {
			Double valorComDesconto = super.getPreco() * 0.9;
			System.out.println("Estamos dentro do metodo. O valor com desconto fica: " + valorComDesconto);
			return valorComDesconto;
		}

		@Override
		public Double calculaValorImposto() {
			// TODO Auto-generated method stub
			return super.getPreco() * 0.2;
		}
		
		
	
	
}
