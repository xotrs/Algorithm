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

    public void bubbleSort(int data[], int MAX){
        int temp;

        for(int i=MAX-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public void improveBubbleSort(int data[], int MAX){
        int temp;

        for(int i=MAX-1; i>=0; i--){
            boolean sorted = true;
            for(int j=0; j<i; j++){
                if(data[j] > data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) return;
        }
    }
}
