class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0,temp=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange;
            numBottles++;
            count++;
        }
        return (temp+count);
        
    }
}
