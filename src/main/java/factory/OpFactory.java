package factory;

public class OpFactory {
	
	static public Operation doOperation(char op) {

		switch (op) {
		case '+':
			return new Add();
		case '-':
			return new Substract();
		case '/':
			return new Divide();
		case '*':
			return new Multiply();
		default:
			return new Add();
		}
	}
}


