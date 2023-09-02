public class Main {
public static void main(String[] args) {

        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Введите строку, которую хотите проверить на то, являетс яли она палиндромом или нет:");
        System.out.println(palindrom(s));
    }

    static String palindrom(String s){
        int left = 0;
        int right = s.length() - 1;
        int middle = s.length() / 2;

        while (left != middle){
            if (s.charAt(left) != s.charAt(right)){
                return "Ваша строка не палиндром";
            }
            left+=1;
            right-=1;
        }

        return "Ваша строка палиндром";
    }
}
