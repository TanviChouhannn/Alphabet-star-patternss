import java.util.Scanner;

public class alphabetpattern {

    public static void main(String[] args) {
        showPatternMenu(); 
    }

    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1.A");
            System.out.println("2.B");
            System.out.println("3.C");
            System.out.println("4.D");
            System.out.println("5.E");
            System.out.println("6.F");
            System.out.println("7.G");
            System.out.println("8.H");
            System.out.println("9.I");
            System.out.println("10.J");
            System.out.println("11.K");
            System.out.println("12.L");
            System.out.println("13.M");
            System.out.println("14.N");
            System.out.println("15.O");
            System.out.println("16.P");
            System.out.println("17.Q");
            System.out.println("18.R");
            System.out.println("19.S");
            System.out.println("20.T");
            System.out.println("21.U");
            System.out.println("22.V");
            System.out.println("23.W");
            System.out.println("24.x");
            System.out.println("25.Y");
            System.out.println("26.Z");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                case 11:
                    pattern11();
                    break;
                case 12:
                    pattern12();
                    break;
                case 13:
                    pattern13();
                    break;
                case 14:
                    pattern14();
                    break;
                case 15:
                    pattern15();
                    break;
                case 16:
                    pattern16();
                    break;
                case 17:
                    pattern17();
                    break;
                case 18:
                    pattern18();
                    break;
                case 19:
                    pattern19();
                    break;
                case 20:
                    pattern20();
                    break;
                case 21:
                    pattern21();
                    break;
                case 22:
                    pattern22();
                    break; 
                case 23:
                    pattern23();
                    break; 
                case 24:
                    pattern24();
                    break; 
                case 25:
                    pattern25();
                    break; 
                case 26:
                    pattern26();
                    break; 
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
        System.out.println("\nA");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || j==5 || i==3 || i==1?"* ":"  ");

            }
            System.out.println(" ");
        }
    }

    static void pattern2() {
        System.out.println("\nB");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || (i==1 || i==3 || i==5) && j<5 || j==5 && i!=1 && i!=3 && i!=5?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern3() {
        System.out.println("\nC");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==5 || i==1?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4() {
        System.out.println("\nD");
       for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || (i==1 || i==5) && j<5 || j==5 && i>1 && i<5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern5() {
        System.out.println("\nE");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==5 || i==3 || i==1?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern6() {
        System.out.println("\nF");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==3 || i==1?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern7() {
        System.out.println("\nG");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==5 || i==1 || (i==3 && j<=3) || (j==5 && i>=3)?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern8() {
        System.out.println("\nH");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || j==5 || i==3?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern9() {
        System.out.println("\nI");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==3 || i==5 || i==1?"* ":"  ");
            }
            System.out.println(" ");
        }
    }

    static void pattern10() {
        System.out.println("\nJ");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i==1 || j==3 || (i==5 && j<4) || (j==1 && i>3)?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern11() {
    System.out.println("\nK");
    int n = 5; 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n - i + 1 || j == i && i > n / 2)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
}

    static void pattern12() {
        System.out.println("\nL");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==5 ?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern13() {
        System.out.println("\nM");
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && i <= n / 2 + 1) || (j == n - i + 1 && i <= n / 2 + 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void pattern14() {
        System.out.println("\nN");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((j==1 || j==5) || (i==j)?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern15() {
        System.out.println("\nO");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || j==5 || i==1 || i==5?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern16() {
        System.out.println("\nP");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || (i==1 || i==3) && j<5 || j==5 && i==2?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern17() {
        System.out.println("\nQ");
        int i,j,n=7;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i==1 && j<6 || j==1 && i<6 || i==5 && j<5 || j==5 && i<5 || i==j && i>=4?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern18() {
        System.out.println("\nR");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || (i==1 || i==3) && j<5 || j==5 && i==2 || i==j && i>3?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern19() {
        System.out.println("\nS");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i==1 || i==3 || i==5 || (j==1 && i<3) || (j==5 && i>3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern20() {
        System.out.println("\nT");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==3 || i==1?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern21() {
        System.out.println("\nU");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(j==1 || i==5 || j==5?"* ":"  ");
            }
            System.out.println(" ");
        }
    }
    static void pattern22() {
        System.out.println("\nV");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=9;j++) {
                if(j==i || j==10-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern23() {
    System.out.println("\nW");
    int n = 5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= 2 * n - 1; j++) {
            if (j == 1 || j == 2 * n - 1 || (i == j - n + 1 && j >= n) || (i + j == n + 1 && j <= n))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        System.out.println();
    }
}
    static void pattern24() {
        System.out.println("\nx");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i==j || i+j==6?"* ":"  ");

            }
            System.out.println(" ");
        }
    }
    static void pattern25() {
        System.out.println("\nY");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print((i==j && i<=3) || (i+j==6 && i<=3) || j==3 && i>3?"* ":"  ");

            }
            System.out.println(" ");
        }
    }
    static void pattern26() {
        System.out.println("\nZ");
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i==1 || i==5 || i+j==6?"* ":"  ");

            }
            System.out.println(" ");
        }
    }
}