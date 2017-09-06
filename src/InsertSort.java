/**
 * Created by zhiyuan on 9/6/17.
 */
public class InsertSort {


    public static void main(String[] args) {
        InsertSort s = new InsertSort();
        int[] test;
        test = new int[]{4, 3, 2, 1};
        int[] result = s.insertSort(test);
        for (int num:result){
            System.out.print(num);
        }

    }

    public int[] insertSort(int[] unsorted){

        for (int i=1;i<unsorted.length;i++){
            if (unsorted[i]<unsorted[i-1]){ //因为现在[0，i-1]都是有序的，所以如果待插入元素比arr[i-1]还大，那就可以不动
                int temp = unsorted[i];
                int j;
                for (j=i-1;j>=0 && unsorted[j]>=temp;j--){
                    unsorted[j+1]=unsorted[j]; //把比temp大或相等的元素都往后挪一个位置
                }
                //此时j的值已经自减1
                unsorted[j+1]=temp;
            }
        }
        return unsorted;
    }


}
