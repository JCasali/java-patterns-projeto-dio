
package JavaStrategy;

public class TennisBallMachine {
	
        private Lancamento lancamento;
        
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	
	public void lancar() {
		lancamento.lancar();
	}
}
