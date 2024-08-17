// 134. Gas Station
// Medium

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for(int c : cost){
            sumCost += c;
        }
        int sumGas = 0;
        for(int g : gas){
            sumGas += g;
        }

         if(sumCost > sumGas){
            return -1;
         }

         int currentGas = 0;
         int start = 0;

         for(int i=0; i<gas.length ; i++){
            currentGas += gas[i]-cost[i];
            if(currentGas < 0){
                currentGas = 0;
                start = i+1;
            }
         }
         return start;
    }

}