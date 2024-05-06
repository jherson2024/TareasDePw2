
// import java.util.*;

public class Calculator {


public double sumar(int a, int b) {
    double	suma=a+b;
	return suma;
}
public double restar(int a, int b) {
    double	resta=a-b;
	return resta;
}
public double multiplciar(int a, int b) {
    double producto=a*b;
	return producto;
}
public double dividir(int a, int b) {
    double	cociente=a/b;
	return cociente;
}

public int mod(int a, int b){ 
	int modulo = a%b;
	return modulo;
}
public double raiz(int a) {
    
	return Math.sqrt(a);
}
}
