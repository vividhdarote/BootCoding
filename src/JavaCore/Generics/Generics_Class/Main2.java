package JavaCore.Generics.Generics_Class;


//This class can be used to store pairs of related data (like key-value pairs).

class Pair <K,V>{
    private K key;
    private V value;

    Pair(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}


public class Main2 {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Vividh",63);
        String i = pair.getKey();
        Integer x = pair.getValue();
        System.out.println("Marks-> "+i+":"+x);

        Pair<Integer,String> pair1 = new Pair<>(101,"Vividh");
        Integer i1= pair1.getKey();
        String x1= pair1.getValue();
        System.out.println("RollNo-> "+i1+":"+x1);

    }
}

//Here, the Pair<K, V> class has two type parameters K and V,and you can specify the types when you create an instance of Pair.

//**Type Parameter Naming Conventions
/*
While you can name type parameters anything, the convention is to use single letters that describe the purpose of the type parameter:

T: Type
E: Element (used in collections)
K: Key (used in maps)
V: Value (used in maps)
N: Number

For example, in the java.util.Map<K, V> interface:

K stands for the key type
V stands for the value type

Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
*/
