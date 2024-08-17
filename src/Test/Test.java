package Test;

import JavaStrategy.Lancamento;
import JavaStrategy.LancamentoNvL01;
import JavaStrategy.LancamentoNvL02;
import JavaStrategy.LancamentoNvL03;
import JavaStrategy.TennisBallMachine;

public class Test {
    
    public static void main(String[] args) {
        
            Lancamento nivel01 = new LancamentoNvL01();
            Lancamento nivel02 = new LancamentoNvL02();
            Lancamento nivel03 = new LancamentoNvL03();
		
		TennisBallMachine tennisBallMachine = new TennisBallMachine();
		tennisBallMachine.setLancamento(nivel01);
		tennisBallMachine.lancar();
		tennisBallMachine.lancar();
		tennisBallMachine.setLancamento(nivel02);
		tennisBallMachine.lancar();
                tennisBallMachine.lancar();
		tennisBallMachine.setLancamento(nivel03);
		tennisBallMachine.lancar();
		tennisBallMachine.lancar();
	}
}