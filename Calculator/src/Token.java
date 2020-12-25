
public class Token {
	private int value;
	private boolean calculated;
	private Token operandA;
	private Token operandB;
	private char operator;
	public Token() {
		calculated = false;
		operandA = null;
		operandB = null;
	}
}
