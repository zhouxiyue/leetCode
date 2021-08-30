public class q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_tank=0;
        int cur_tank=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            total_tank+=gas[i]-cost[i];
            cur_tank+=gas[i]-cost[i];
            if(cur_tank<0){
                index=i+1;
                cur_tank=0;
            }
        }
        return total_tank<0?-1:index;
    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int run=0;
        int rest=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            run+=gas[i]-cost[i];
            rest+=gas[i]-cost[i];
            if(run<0){
                index=i+1;
                run=0;
            }
        }
        return rest<0?-1:index;
    }
}
