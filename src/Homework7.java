import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scan.nextInt();
        System.out.println("Введите второе число: ");
        int b = scan.nextInt();
        if (a>b){
            System.out.println("Большее число: "+a);
        }else if(b>a){
            System.out.println("Большее число: "+b);
        }else{
            System.out.println("Числа равны");
        }
    }
}
