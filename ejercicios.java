public class ejercicios {
    public static void main (String[] args) {
        
// Primera parte        

        int a = 4;
        int b = 8;
        int c = 16;

        int valor = suma(a, b, c);
        System.out.println(valor);

// Segunda parte
        Car myCar = new Car ();
        myCar.numDoors = 3;

        myCar.addDoors();

        System.out.println(myCar.numDoors);

    }

    public static int suma (int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        return resultado;
    }

   
}

class Car {
    int numDoors;

    void addDoors () {
     numDoors++;
    }


 }