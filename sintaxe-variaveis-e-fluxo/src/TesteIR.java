


public class TesteIR {

	    public static void main(String[] args) {

	        double salario = 1500.0;

	        if (salario >= 3751.01) {
	        	System.out.println("IR é de 22.5% e pode deduzir R$ 636" );
	        } else if (salario >= 2800.01) {
	        	System.out.println("IR é de 15% e pode deduzir R$ 350" );
	        } else if (salario >= 1900) {
	        	System.out.println("IR é de 7.5% e pode deduzir R$ 142" );
	        } else {
	        	System.out.println("Isento");
	        }
	    }
}

