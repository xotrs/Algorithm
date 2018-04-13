public class MainApp {
    public static void main(String args[]){
        int data[] = {8, 31, 48, 73, 3, 65, 20, 29, 11, 15};

        System.out.println("Previous");
        for (int element: data) {
            System.out.print(element + " ");
        }

        Sort sort = new Sort();
        sort.selectionSort(data, data.length);

        System.out.println("\nAfter");
        for (int element: data) {
            System.out.print(element + " ");
        }

    }


}




