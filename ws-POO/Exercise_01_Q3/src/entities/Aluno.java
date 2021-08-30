package entities;

public class Aluno {
	public String nome;
	public double _1trim, _2trim, _3trim;
	
	public double NotaFinal () {
		return this._1trim + this._2trim + this._3trim;
	}
	
	public double Faltou() {
		return 60.0 - NotaFinal();
	}
	
	public void Situacao() {
		if (NotaFinal() >= 60.0) {
			System.out.printf("FINAL GRADE: %.2f%nPASS", NotaFinal());
		} else {
			System.out.printf("FINAL GRADE: %.2f%nFAILED\nMISSING %.2f POINTS", NotaFinal(), Faltou());
		}
	}
}
