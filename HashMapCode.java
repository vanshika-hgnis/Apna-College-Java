import java.util.*;
public class HashMapCode {
    
    static class  HashMap<K,V> {

        private class Node {

            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressionWarnings("unchecked");
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0;i<=4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hasFunction(K key){
            int bi = key.hashCode(); /// returns random number
            return Math.abs(bi) % N ;/// bi = 1--N-1
        }  

        private int searchinLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i =0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i =0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i =0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key,node.value());
                }
            }
        }
        public void put(K key,V value){
            // black box where the key is beign passsed
            int buckeindex = hasFunction(key);
            // now with the bindex it will go tot the said index and look in through the link list attached to it to see whether the value or not

            int di = searchInLL(key,buckeindex);/// data 
            //index; if di = 0 or 0+-- key exist ,di = -1 doesnt exists 
            if(di == -1){
                //  key doesnt exits -- create a node
                buckets[buckeindex].add(new Node(key,value));
                n++;
            }
            else{
                // key exists -- value updated
                Node node = buckets[buckeindex].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda>2.0){
                // rehashing
                rehash();
            }
        }
    }
    public static void main(String args[]){
        HashMap<String,Integer> map  = new HashMap<>();
        map.put("India",190);
        map.put("China",200);
        map.put("USA",89);
        map.put("UK",34);
        
    }
}
