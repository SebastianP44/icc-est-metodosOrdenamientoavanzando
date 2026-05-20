public class App {
    public static void main(String[] args) throws Exception {
        int[] num = {8, 3, 5, 1, 8, 6};
        MergeSort mergeSort = new MergeSort();

        System.out.println("Arreglo original: ");
        printArray(num);

        mergeSort.sort(num);

        System.out.println("Arreglo ordenado: ");
        printArray(num);
    }

    public static void printArray(int[] array) {
        for(int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}