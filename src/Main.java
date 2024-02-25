import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner doa = new Scanner(System.in); //define scanner
        System.out.print("Enter The Number To Create Triangle: ");//getvalue from user
        int n = doa.nextInt(); //assign the entered value to n

        System.out.println("\n__T_R_I_A_N_G_L_E__\n_____H_E_R_E____");

        for (int i = n; i >= 1; i--) {//Write 10 stars under each other (if n=10)
            for (int j = 1; j <= 2 * i - 1; j++) { //adds  stars to the right of each star equal to the condition value
                System.out.print("*");
            }
            System.out.println();//move to the bottom line


        }System.out.println("___T_H_A_N_K_S___");
    }
}


