package sobrecarga;

public class Main {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println(cal.calcular(1,1));
        System.out.println(cal.calcular(2.8,6.1));
        System.out.println(cal.calcular("vim","ram?"));
    }
}