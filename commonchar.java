import java.util.*;
public class commonchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inp = sc.next();
        findchar(inp);
    }

    public static void findchar(String input){
        char[] characters = input.toCharArray();
        HashMap<Character, Integer> freqmap = new HashMap<>();

        for(char c : characters){
            freqmap.put(c, freqmap.getOrDefault(c, 0)+1);
        }

        System.out.println("similar characters");
        for(char c : freqmap.keySet()){
            if(freqmap.get(c)>1){
                System.out.print(c+ " ");
            }
        }
    }
}