
import java.util.*;
class Union {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
        
        HashMap<Integer , Integer> h= new HashMap<>();
        for(int x: a){
            if(h.containsKey(x)){
                int y=h.get(x);
                y++;
                h.put(x,y);
            }
            else{
                h.put(x,1);
            }
        }
        for(int x: b){
            
                if(h.containsKey(x)){
                    int y=h.get(x);
                    y++;
                    h.put(x,y);
                }
                else{
                    h.put(x,1);
                }
            }
            
        
        System.out.println (h.keySet());
        
    }
   
    
}
