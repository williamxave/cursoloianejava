package exercicios46.enu;

public enum Calculadora {

	ADICAO("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}

	},
	SUBTRACAO("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x - y;
		}

	},
	DIVISAO("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}

	},
	MULTIPLICACAO("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	};

	private String simbolo;

	Calculadora(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public abstract double executarOperacao(double x, double y);

	public String toString() {
		return simbolo;
	}
}
