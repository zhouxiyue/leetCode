public class q55 {
    public boolean canJump(int[] nums) {
        return dfs1(0,nums);
    }

    public boolean dfs1(int position,int[] nums){
        if(position==nums.length-1)
            return true;
        int furthestJump = Math.min(position+nums[position],nums.length-1);
        for(int i=position+1;i<=furthestJump;i++){
            if(dfs1(i,nums))
                return true;
        }
        return false;
    }

    public boolean dfs2(int position,int[] nums) {
        if(position==nums.length-1)
            return true;
        int furthestjump = Math.min(position+nums[position],nums.length-1);
        for(int i=furthestjump;i>=position+1;i--){
            if(dfs2(i,nums))
                return true;
        }
        return false;
    }
}

enum index{
    good,
    bad,
    unknown
}

class q55_1{
    public boolean canJump(int[] nums) {
        dp=new index[nums.length];
        for(int i=0;i<=nums.length-2;i++){
            dp[i]=index.unknown;
        }
        dp[nums.length-1]=index.good;
        return dfs(0,nums);
    }

    private index[] dp;
    public boolean dfs(int position,int[] nums){
        if(dp[position]!=index.unknown){
            return dp[position]==index.good;
        }
        int furthestjump = Math.min(position+nums[position],nums.length-1);
        for(int i=position+1;i<=furthestjump;i++){
            if(dfs(i,nums)){
                dp[position]=index.good;
                return true;
            }
        }
        dp[position]=index.bad;
        return false;
    }
}

class q55_2{
    public boolean canJump(int[] nums) {
        index[] dp = new index[nums.length];
        for(int i=0;i<nums.length-1;i++){
            dp[i]=index.unknown;
        }
        dp[nums.length-1]=index.good;
        for(int i=nums.length-2;i>=0;i--){
            int furthestjump = Math.min(i+nums[i],nums.length-1);
            for(int j=i+1;j<=furthestjump;j++){
                if(dp[j]==index.good){
                    dp[i]=index.good;
                    break;
                }
            }
        }
        return dp[0]==index.good;
    }
}

class q55_3{
    public boolean canJump(int[] nums) {
        int index = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=index){
                index=i;
            }
        }
        return index==0;
    }
}
