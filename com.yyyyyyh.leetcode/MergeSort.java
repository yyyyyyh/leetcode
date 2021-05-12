public class MergeSort {

    /**
     // 归并排序算法, A 是数组，n 表示数组大小
     merge_sort(A, n) {
     merge_sort_c(A, 0, n-1)
     }

     // 递归调用函数
     merge_sort_c(A, p, r) {
     // 递归终止条件
     if p >= r  then return

     // 取 p 到 r 之间的中间位置 q
     q = (p+r) / 2
     // 分治递归
     merge_sort_c(A, p, q)
     merge_sort_c(A, q+1, r)
     // 将 A[p...q] 和 A[q+1...r] 合并为 A[p...r]
     merge(A[p...r], A[p...q], A[q+1...r])
     }
     */

    public static void main (String[] args) {
        sort(new int[]{9,5,1,3,7,4,8,6}, 0, 8);
    }

    public static int[] sort(int[] a,int low,int high){
        int mid = (low+high)/2;
                                                                                                                                                           if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }

}
