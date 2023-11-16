public class Main {
    public static void main(String[] args) {

//      Task 2A
        //        int array[]={10,9,8,7,6,5,4,3,2,1};
//        int min=0;
//        for(int i=0;i<array.length-1;i++){
//            if(array[i]>array[i+1]){
//                min=i+1;
//            }
//        }
//        System.out.print("The minimum value is on the index: "+min);



//      Task 2B
//        int array[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int counter = 0;
//        int min=0;
//        for(int j=0;j<array.length-1;j++) {
//            for (int i = j+1; i < array.length ; i++) {
//                counter++;
//                if (array[j] > array[i]) {
//                    min = i;
//                    counter++;
//                }
//            }
//            if (array[min]!=array[j]) {
//                int temp=array[j];
//                array[j]=array[min];
//                array[min]=temp;
//                counter++;
//            }
//        }
//        for(int value:array){
//            System.out.print(value+" ");
//        }
//        System.out.print(counter);



//      Task 2C
//        int array[] = {10,9,8,7,6,5,4,3,2,1};
        int array[]= {1,2,3,4,5,6,7,8,9,10};
        int counter = 0;
        int max = 0;
        boolean isSorted = true;
        for (int j = 0; j < array.length - 1 && isSorted; j++) {
            isSorted = false;
            for (int i = j + 1; i < array.length; i++) {
                counter++;
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    isSorted=true;
                }
                else if (array[i] <=array[j]){
                    max = j;
                }
                else{
                    isSorted=false;
                }
            }
            counter++;
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print(counter);






    }
}


