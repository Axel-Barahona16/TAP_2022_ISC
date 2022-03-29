package EjerciciosJordiCuevasArjona7259.practica1;

public class operaciones {

	public String opResultado(String operador, int pNum, int sNum){

		switch(operador){

			//suma
		case"+":
			int suma= pNum +sNum;
			return suma+"";
			//resta
		case "-":
		int resta=pNum-sNum;
		return resta+"";
		//caso para la division
		case "/":
			if (pNum>0 && sNum>0){
				int divicion=pNum/sNum;
				return divicion +"";
			}else {
				return "No se puede dividir entre 0";
			}
			//multiplicacion 
		case "*":
			int multiplicacion=pNum*sNum;
			return multiplicacion+"";
			//elevada
		case "^":
			if(sNum !=0){
				double elevar = Math.pow(pNum, sNum);
				return elevar + "";
			}
			break;
			default:
			return"";
				
		}
		return null;
		
	}
	
	
}
