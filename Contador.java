import java.util.Scanner;

class Contador{

    private int cont;
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         Contador contador1;
         contador1 = new Contador();

         int n;
         System.out.println("Introduce valor para inicializar el contador: ");
         n = sc.nextInt();


         contador1.setCont(n);

         contador1.incrementar();

         System.out.println(contador1.getCont());

         contador1.incrementar();
         contador1.incrementar();


         System.out.println(contador1.getCont());


         contador1.decrementar();


         System.out.println(contador1.getCont());


         Contador contador2 = new Contador(10);


         contador2.incrementar();
         System.out.println(contador2.getCont());
         contador2.decrementar();
         System.out.println(contador2.getCont());


         Contador contador3 = new Contador(contador2);


         System.out.println(contador3.getCont());
     }


    public Contador() {

    }

    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }


    public Contador(final Contador c) {

        cont = c.cont;
    }


    public int getCont() {

        return cont;
    }


    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }


    public void incrementar() {
        cont++;
    }

    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}




