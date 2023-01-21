package kata7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histogram<T> {
    private String type;
    private String field;
    private String bin;
    private Map<T, Integer> map;
    
    
    

    public Histogram() {
        this.map = new HashMap<T, Integer>();
    }

    Histogram(String type, String bin) {
        this.type=type;
        this.bin=bin;
    }

    Histogram(String type, String bin, String field) {
        this.map = new HashMap<T, Integer>();
        this.bin=bin;
        this.field=field;
        this.type=type;
    }
    
    
    
    public Integer get(T key) {
        return this.map.get(key);
    } 
    
    public Set<T> keySet(){
        return this.map.keySet();
    }
    
    public void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) +1 : 1);
    }  
}
