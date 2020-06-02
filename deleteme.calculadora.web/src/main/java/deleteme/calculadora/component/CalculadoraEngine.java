package deleteme.calculadora.component;

public class CalculadoraEngine {
    
    public String Calcular(String primerOperando, String operador, String segundoOperando, String calcular) {

        String resultado;

        Integer op1 = Integer.parseInt(primerOperando);
        Integer op2 = Integer.parseInt(segundoOperando);

        switch (operador) {
            case "add":
                resultado = sumar(op1, op2);
                break;
            case "substract":
                resultado = restar(op1, op2);
                break;

            case "multiply":
                resultado = multiplicar(op1, op2);
                break;

            case "divide":
                resultado = dividir(op1, op2);
                break;
            default:
                resultado = "La operacion "+operador+" no está soportada.";
                break;
        }

        return resultado;
    }

    public String sumar(Integer op1, Integer op2){
       return String.valueOf((op1 + op2));
    }

    public String restar(Integer op1, Integer op2){
        return String.valueOf((op1 - op2));
    }

    public String multiplicar(Integer op1, Integer op2){
        return String.valueOf((op1 * op2));
    }

    public String dividir(Integer op1, Integer op2){
        return String.valueOf((op1 / op2));
    }
}