package JavaCore.Generics.Generics_Interface;


interface Pair<K,V>{
    K getKey();
    V getValue();
}


class GenericsPair<K,V> implements Pair<K,V>{
    private K key;
    private V value;
    GenericsPair(K key, V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public K getKey(){
        return key;
    }

    @Override
    public V getValue(){
        return value;
    }
}


public class Main4 {
    public static void main(String[] args) {

        GenericsPair<String,Integer> pair=new GenericsPair<>("Vividh",63);
        String s= pair.getKey();
        Integer i= pair.getValue();
        System.out.println(s+": "+i);

        GenericsPair<Integer,String> pair1= new GenericsPair<>(101,"Anshul");
        String s1= pair1.getValue();
        Integer i1= pair1.getKey();
        System.out.println(i1+": "+s1);
    }
}
