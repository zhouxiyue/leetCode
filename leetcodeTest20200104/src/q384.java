import java.util.Random;

public class q384 {
    private int[] list;

    public q384(int[] nums) {
        int n=nums.length;
        list = new int[n];
        for(int i=0;i<n;i++){
            list[i]=nums[i];
        }
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return list;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n=list.length;
        int[] list1 = new int[n];
        for(int i=0;i<n;i++){
            list1[i]=list[i];
        }
        Random rm = new Random();
        for(int i=1;i<list1.length;i++){
            int r=rm.nextInt(list1.length);
            swap(list1,0,r);
        }
        return list1;
    }

    public void swap(int[] li,int a,int b){
        int tmp = li[a];
        li[a]=li[b];
        li[b]=tmp;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3};
        q384 q = new q384(list);
        q.shuffle();
        q.reset();
        q.shuffle();
    }
}
