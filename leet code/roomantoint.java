import java.util.*;

class roomantoint {

    static int romanToInteger(String s) {

        int total = 0;
        int prev = 0;

        // FIX 1: HashMap (capital M)
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // loop from right to left
        for (int i = s.length() - 1; i >= 0; i--) {

            int current = map.get(s.charAt(i));

            // FIX 2: missing closing bracket
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman number: ");

        // FIX 3: nextLine() not nextInt()
        String input = sc.nextLine();

        int result = romanToInteger(input);

        System.out.println("Result: " + result);
    }
}