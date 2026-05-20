import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int medio = arr.length / 2;

        int[] izq = mergeSort(Arrays.copyOfRange(arr, 0, medio));
        int[] der = mergeSort(Arrays.copyOfRange(arr, medio, arr.length));

        return merge(izq, der);
    }

    private static int[] merge(int[] izq, int[] der) {
        int[] resultado = new int[izq.length + der.length];
        int i = 0, j = 0, k = 0;

        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                resultado[k++] = izq[i++];
            } else {
                resultado[k++] = der[j++];
            }
        }

        while (i < izq.length) resultado[k++] = izq[i++];
        while (j < der.length) resultado[k++] = der[j++];

        return resultado;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] ordenado = mergeSort(arr);

        for (int x : ordenado) System.out.print(x + " ");
    }
}