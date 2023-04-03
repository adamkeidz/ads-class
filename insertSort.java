public class insertSort{
    public static void main(String[] args){
        int[] array = {11, 53, 92, 214, 635, 66, 57, 12348, 529, 810};
        int length = array.length;
        for(int i = 1; i < length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        for(int i = 0; i < length; i++){
            System.out.println(array[i]);
        }
    }
}
// for(int i = 1; i < length; i++){
//     int temp = array[i];
//     int j = i - 1;
//     while(j >= 0 && array[j] > temp){
//         array[j+1] = array[j];
//         j--;
//     }
//     array[j+1] = temp;
// }
