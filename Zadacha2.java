public class Main {
public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int continuee = 1;
        int a,b;
        while (continuee == 1){

            System.out.print("Введите первое число: a = ");
            a = in.nextInt();
            System.out.print("Введите второе число: b = ");
            b = in.nextInt();

            swap (a,b);
            System.out.println("Продолжим? Введите 1 - если да или 0 - если нет: ");
            continuee = in.nextInt();
        }

        System.out.println("Спасибо за использование нашей программы");

        in.close();
    }

    static void swap(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("После преобразования числа равны: ");
        System.out.printf("a = %d \n", a);
        System.out.printf("b = %d \n\n", b);
    }
}
