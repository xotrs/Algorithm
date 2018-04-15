public class MainApp {
    public static void main(String args[]) throws Exception {
        int data[] = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

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
        int targetIndex = search.binarySearch(data, data.length);
        System.out.println("target index : "+targetIndex );

//        System.out.println("\nAfter");
//        for (int element: data) {
//            System.out.print(element + " ");
//        }

    }


}




