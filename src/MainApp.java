public class MainApp {
    public static void main(String args[]) throws Exception {
//        int data[] = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};
//        int data[] = {5, 2, 7, 3, 6, 1, 4};
//        int data[] = {9, 4, 3, 10, 5, 8, 7, 6, 2, 1};
//        int data[] = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
//        int data[] = {1, 3, 5, 7, 9, 11, 13, 15, 14, 12, 10, 8, 6, 4, 2};
        int data[] = {6, 4, 3, 7, 5, 1, 2};

        System.out.println("Previous");
        for (int element: data) {
            System.out.print(element + " ");
        }

        Sort sort = new Sort();
        Search search = new Search();
//        sort.selectionSort(data, data.length);
//        sort.bubbleSort(data, data.length);
//        sort.improveBubbleSort(data, data.length);
//        sort.insertionSort(data, data.length);
//        int targetIndex = search.binarySearch(data, data.length);
//        System.out.println("target index : "+targetIndex );
//        sort.heapSort(data, data.length);
        sort.mergeSort(data, 0, data.length - 1);
        System.out.println("\nAfter");
        for (int element: data) {
            System.out.print(element + " ");
        }

    }


}




