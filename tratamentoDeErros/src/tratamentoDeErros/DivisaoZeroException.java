package tratamentoDeErros;

public class DivisaoZeroException extends Exception{
	private static final long serialVersionUID =1L;
	
	private int valorPadrao;
	
	public DivisaoZeroException(String msg) {
		super(msg);
		valorPadrao=1;
	}
	
	public int getValorPadrao() {
		return valorPadrao;
	}
}
