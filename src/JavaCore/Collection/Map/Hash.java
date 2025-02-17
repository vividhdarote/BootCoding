package JavaCore.Collection.Map;

public class Hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        //Output: 8
        System.out.println(simpleHash("CBA"));
        //Output: 8

    }
    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}


//Generation of HashCode in HashFunction to Store Data in That Index Value
//For Above Example Shows the Same HashCode Called Collision
