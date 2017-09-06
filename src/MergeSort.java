import java.util.Arrays;

/**
 * Created by zhiyuan on 9/6/17.
 */
public class MergeSort {
    public void sort(int[] a,int left,int right){
        if (left>=right){
            return;
        }
        int middle = (left+right)/2;
        sort(a,left,middle);
        sort(a,middle+1,right);
        merge(a,left,middle,right);
    }



    //对于两个有序的数组，我们将其合并为一个有序的数组
    public void merge(int[] a,int l, int m,int r){
        int[] left = new int[m-l+1];
        int[] right = new int[r-m];
        int[] result = new int[r-l+1];


        for (int x=0,index =l;index<=m;index++,x++){
            left[x] = a[index];
        }

        for (int y=0,index =m+1;index<=r;index++,y++){
            right[y] = a[index];
        }

        System.out.println("left "+Arrays.toString(left));
        System.out.println("right "+Arrays.toString(right));


        int i=0,j=0,k=0;
        for (;i<left.length&&j<right.length;k++){
            if (left[i]<right[j]){
                result[k]=left[i];
                i++;
                continue;
            }else {
                result[k]=right[j];
                j++;
                continue;
            }
        }
        //如果是左边的结束，那么将右边剩下的全部加到result数组里面，如果是右边的先结束则情况相反
        if (i==left.length){
            for (;j<right.length;j++,k++){
                result[k]=right[j];

            }
        }else {
            for (;i<left.length;i++,k++){
                result[k]=left[i];
            }
        }
        System.out.println("res "+Arrays.toString(result));
        for (int x=0;l<=r;l++,x++){
            a[l]=result[x];
        }

    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] temp = {88,59,79,78,15,13};
        ms.sort(temp,0,temp.length-1);


    }
}
