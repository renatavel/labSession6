public class Main {
    private static void QuickSort(int array[],int lowIndex,int highIndex){
        if(lowIndex>=highIndex){
            return;
        }

        int pivot=array[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex;

        while(leftPointer<rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            Swap(array, leftPointer, rightPointer);

        }
        Swap(array,leftPointer,highIndex);

        QuickSort(array,lowIndex,leftPointer-1);
        QuickSort(array,leftPointer+1,highIndex);

    }
    private static void Swap(int array[],int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    public static void main(String[] args) {
        int array[]={9,10,4,3,1,6,8,9};
        QuickSort(array,0,array.length-1);
        for(int value:array){
            System.out.print(value+" ");
        }


    }
}