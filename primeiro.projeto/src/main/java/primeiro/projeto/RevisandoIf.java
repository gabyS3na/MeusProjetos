package primeiro.projeto;

public class RevisandoIf {

	public static void main(String[] args) {

		int mediaPassar = 9;
		int nota1 = 9;
		int nota2 = 10;
		int nota3 = 9;
		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= mediaPassar) {

			System.out.println("Parabens voc� passou de ano. ");

		}  else {
			System.out.println("Infelizmente voc� nao atingiua m�dia. ");

		}
	}

}
