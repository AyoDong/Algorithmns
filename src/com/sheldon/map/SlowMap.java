package com.sheldon.map;

import java.util.*;

public class SlowMap<K, V> extends AbstractMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V>  values = new ArrayList<>();

    public V put(K key, V value){
        V oldValue = get(key);
        if(!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }else{
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
   }

   public V get(Object key){
        if(!keys.contains(key)){
            return null;
        }
        return values.get(keys.indexOf(key));
   }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext()){
            set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(Integer a : A){
            System.out.println(a);
        }
        SlowMap<String, String> m = new SlowMap<>();
        m.put("AA", "BB");
        System.out.println(m);
        System.out.println(m.get("AA"));
        System.out.println(m.entrySet());
    }
}
