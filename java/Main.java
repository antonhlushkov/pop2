public class Main {
    public static void main(String[] args) {
        int dim = 10;
        int threadNum = 3;
        ArrClass arrClass = new ArrClass(dim, threadNum);

        int min = arrClass.threadMin();
        System.out.println("Min element -> " + min);
        System.out.println("Index min -> " + arrClass.index_min(min));

        // Виводимо всі елементи масиву
        System.out.println("All elements in the array |");
        for (int i = 0; i < dim; i++) {
            System.out.print(arrClass.getArrayElement(i) + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
