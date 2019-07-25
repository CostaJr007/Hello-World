public class Imposto {
    public static void main(String[] args) {
        double salario = 0.1D;
        if (salario < 1000) {
            System.out.println("O imposto será de 5% : " + (salario * 0.05));
        } else if (salario >= 1000 && salario < 2000) {
            System.out.println("O imposto será de 10% : " + (salario * 0.1));

        } else if (salario >= 2000 &&salario< 4000)
        System.out.println("O imposto será de 15% : " + (salario * 0.15));
        else{
            System.out.println("O imposto será de 20% : " + (salario * 0.2));
        }
    }
}