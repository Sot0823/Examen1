
import java.util.Scanner;

public class Fecha {
    private int Dia;
    private int Mes;
    private int Año;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Por favor introduce fecha: ");
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();


        Fecha FechaPy = new Fecha(dia,mes,año);

        if (FechaPy.fechaCorrecta()) {


            System.out.println("La fecha introducida fue: " + FechaPy);


            System.out.println("Los 10 días siguientes a la fecha son:");
            for (int i = 1; i <= 10; i++) {
                FechaPy.diaSiguiente();
                System.out.println(FechaPy);
            }

        } else {
            System.out.println("Fecha no es valida");
        }
    }

    public Fecha() {

    }


    public Fecha(int Dia, int Mes, int Año) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
    }


    public void setDia(int d) {
        Dia = d;
    }
    public void setMes(int m) {
        Mes = m;
    }
    public void setAño(int a) {
        Año = a;
    }
    public int getDia() {
        return Dia;
    }
    public int getMes() {
        return Mes;
    }
    public int getAño() {
        return Año;
    }




    public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = Año > 0;
        mesCorrecto = Mes >= 1 && Mes <= 12;
        switch (Mes) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = Dia >= 1 && Dia <= 29;
                } else {
                    diaCorrecto = Dia >= 1 && Dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = Dia >= 1 && Dia <= 30;
                break;
            default:
                diaCorrecto = Dia >= 1 && Dia <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }


    private boolean esBisiesto() {
        return (Año % 4 == 0 && Año % 100 != 0 || Año % 400 == 0);
    }


    public void diaSiguiente() {
        Dia++;
        if (!fechaCorrecta()) {
            Dia = 1;
            Mes++;
            if (!fechaCorrecta()) {
                Mes = 1;
                Año++;
            }

        }
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (Dia < 10) {
            sb.append("0");
        }
        sb.append(Dia);
        sb.append("-");
        if (Mes < 10) {
            sb.append("0");
        }
        sb.append(Mes);
        sb.append("-");
        sb.append(Año);
        return sb.toString();
    }
}


