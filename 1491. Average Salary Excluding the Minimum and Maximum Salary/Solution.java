class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double ts=0;
        for(int i=1;i<salary.length-1;i++){
      ts+=salary[i];
        }
        System.out.println(ts);
        return (ts/(salary.length-2));
        
    }
}
