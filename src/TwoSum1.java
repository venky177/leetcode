import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TwoSum1
{

    Map<Integer,Node> map;

    public TwoSum1() {
        this.map = new HashMap<>();
    }

    void fillMap(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            insertInMap(arr[i],i);
        }
    }

    void insertInMap(int value, int index){

        Node p = new Node(value,index);

        if(map.containsKey(value)){
            map.get(value).setNext(p);
        }
        else map.put(value,p);
    }

    public int[] solution(int [] arr, int target){

        int num1=0;
        int num2=0;
        Node p = new Node(999,9999);

        for (num1 = 0 ;num1 <arr.length ;num1++){

            num2 = map.getOrDefault((target -arr[num1]),p).getIndex();

            if(num2 == 9999) continue;
            if(num2 == num1){
                if(map.getOrDefault((target -arr[num1]),p).getNext()!=null)
                num2 = map.getOrDefault((target -arr[num1]),p).getNext().getIndex();
                else continue;
            }

            break;

        }

        int[] ans = {num1,num2};

        return ans;

    }

    public int[] twoSum(int[] nums, int target) {
        TwoSum1 ts = new TwoSum1();
        ts.fillMap(nums);
        return ts.solution(nums,target);

    }

    public static void main(String args[]){
        int [] nums = {3,2,4};int target = 6;
        TwoSum1 ts = new TwoSum1();
        ts.fillMap(nums);
        int arr[] = ts.solution(nums,target);
         System.out.print(arr[0]+","+arr[1]);

    }


}
class Node
{

    int value;
    int index;
    Node next;

    public Node(int value, int index) {
        this.value = value;
        this.index = index;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}