package CaseStudies.HashMap;
public class HashMap<K,V> {
    class Entity<K,V>{
        public K key;
        public V value;
        public Entity next;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int INITIAL_HASH_SIZE = 10;
    public Entity[] hashTable;
    public HashMap() {
        hashTable = new Entity[INITIAL_HASH_SIZE];
    }

    public void put(K key, V value){
        int hash = key.hashCode()%INITIAL_HASH_SIZE;
        Entity node = hashTable[hash];
        if(node==null){
            Entity data = new Entity(key, value);
            hashTable[hash]=data;
        }else{
            Entity previousNode = node;
            while(node != null){
                if(node.key==key){
                    node.value=value;
                    return;
                }
                previousNode=node;
                node=node.next;
            }
            Entity data = new Entity(key, value);
            previousNode.next = data;
        }
    }

    public V get(K key){
        int hash = key.hashCode()%INITIAL_HASH_SIZE;
        Entity node = hashTable[hash];
        while (node!=null){
            if(node.key.equals(key))
                return (V)node.value;
            node=node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10,"Gaurav");
        map.put(20,"Patel");
        System.out.println(map.get(20));
    }
}