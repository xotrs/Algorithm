import java.util.Arrays;

public class Sort {

    public void insertionSort(int data[], int MAX){
        for(int i=1; i<MAX; i++){
            int temp = data[i];
            int j = i - 1;

            while((j >= 0) && (data[j] > temp)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }

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

    public void heapSort(int data[], int MAX){
        MAX -= 1;

        makeHeapTree(data, MAX);
        for(int i = MAX; i >= 1; i--){
            System.out.println("test : "+i);

            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;

            MAX -= 1;

            heapify(data, 0, MAX);
        }
        System.out.println(Arrays.toString(data));
    }

    private void heapify(int data[], int i, int MAX){
        int leftNodeIndex = i * 2 + 1;
        int rightNodeIndex = i * 2 + 2;


        System.out.println("parentNodeIndex : "+i);
        System.out.println("leftNodeIndex : "+leftNodeIndex);
        System.out.println("rightNodeIndex : "+rightNodeIndex);
        System.out.println("---------------------------------");


        System.out.println("parentNodeValue : "+data[i]);
        if(leftNodeIndex < MAX){
            System.out.println("leftNodeValue : "+data[leftNodeIndex]);
        }

        if(rightNodeIndex < MAX){
            System.out.println("rightNodeValue : "+data[rightNodeIndex]);
        }

        int largestIndex;

        if(leftNodeIndex > MAX || rightNodeIndex > MAX){
            System.out.println("Have a no child");

            return;
        }

        if(data[leftNodeIndex] >= data[rightNodeIndex]){
            largestIndex = leftNodeIndex;
        }else{
            largestIndex = rightNodeIndex;
        }

        if(data[i] >= data[largestIndex]) {
            return;
        }else{
            int temp = data[i];
            data[i] = data[largestIndex];
            data[largestIndex] = temp;

            heapify(data, largestIndex, MAX);
        }

        System.out.println(Arrays.toString(data));



    }

    public void makeHeapTree(int data[], int MAX) {
        for (int i = MAX / 2; i >= 0; i--) {
            System.out.println("\n");
            System.out.println(MAX);
            System.out.println(i);
            heapify(data, i, MAX);
        }
    }
}
