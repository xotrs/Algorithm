public class Sort {
    public void selectionSort(int data[], int MAX){
        int temp, minIndex;

        for(int i=0; i<MAX-1; i++){
            minIndex = i;

            for(int j=i+1; j<MAX; j++){
                if(data[minIndex] > data[j]){
                    minIndex = j;
                }
            }

            temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }
}
