public class q40 {

    public void heapify(int[] arr,int index,int size){
        if(index<size){
            int left = index*2+1;
            int right = index*2+2;
            int min = index;
            if(left<size&&arr[left]<arr[min]){
                min=left;
            }
            if(right<size&&arr[right]<arr[min]){
                min=right;
            }
            if(min!=index){
                int tmp = arr[min];
                arr[min]=arr[index];
                arr[index]=tmp;
                heapify(arr,min,size);
            }
        }
    }

    public void minheapify(int[] arr,int size){
        for(int i=size-1;i>=0;i--){
            heapify(arr,i,size);
        }
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] re = new int[k];
        for(int i=0;i<k;i++){
            minheapify(arr,arr.length-i);
            int tmp = arr[0];
            arr[0]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;
            re[i]=tmp;
        }
        return re;
    }

    public static void main(String[] args) {
        q40 q40 = new q40();
        q40.getLeastNumbers(new int[]{0,0,1,2,4,2,2,3,1,4},8);
    }
}
