// GFG : Check if Array is sorted
// Easy

import java.util.List;

class Solution {
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        return func(arr,0);
    }
    public boolean func(List<Integer> list, int index){
        if(list.size()-1==index){
            return true;
        }
        
        if(list.get(index)>list.get(index+1)){
            return false;
        }
        
        return func(list,index+1);
    }
}