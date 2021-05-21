package imc;

public class imc {

	public static void main(String[] args) {

		Paciente Pai = new Paciente(65, 1.90);
		Paciente Filho = new Paciente(75, 1.65);
		Paciente Mae = new Paciente(72, 1.80);
                Paciente Filha  = Paciente (63, 1.58);
	
		System.out.println( "IMC do Pai: " + Pai.calcularIMC());
		System.out.println( "IMC do Filho: " + Filho.calcularIMC());
		System.out.println( "IMC da Mae: " + Mae.calcularIMC());
                System.out.println( "IMC da Filha: " +Filha.calcularIMC());
		
		System.out.println( "\nDiagnóstico do Pai: " + Pai.diagnostico());
		System.out.println( "Diagnóstico do Filho: " + Filho.diagnostico());
		System.out.println( "Diagnóstico da Mãe:  " +  Mae.diagnostico());
                System.out.println(Filha.diagnostico() + "Diagnóstico da Filha: ");
	}

    private static Paciente Paciente(int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}