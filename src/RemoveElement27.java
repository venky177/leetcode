public class RemoveElement27 {

    public static void main(String args[]){

        int arr[] = {1,1,2,2,3,4,5};
        int val = 2;

        if(arr.length==0)return;

        int fastPointer=0,slowPointer=0;

        while (fastPointer<arr.length){

            if(arr[fastPointer]==val){
                fastPointer++;
                continue;
            }

            arr[slowPointer]=arr[fastPointer];
            fastPointer++;
            slowPointer++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
