public class Main {
    public static void main(String[] args) {
        // ------------------- Task1 Homework-5 -------------------
        int [] arr1 = new int [3]; // создание 1-го массива

        for (int i = 0; i < 3; i++) { // инициализация массива в цикле
            arr1[i] = i + 1;
        }

        float [] arr2 = {1.57f, 7.654f, 9.986f}; // создание и инициализация 2-го массива
        byte [] arr3 = new byte [57]; // создание 3-го массива
        arr3[0] = 1;
        arr3[56] = 57;

        // ------------------- Task2 Homework-5 -------------------
        System.out.println("\n------------------- Task2 Homework-5 -------------------");
        String str = "";

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(str + arr1[i]);
            str = ", ";
        }

        str = "";
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(str + arr2[i]);
            str = ", ";
        }

        System.out.println();
        // та же логика, но без использования String (нет "," в конце)
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr3.length-1){
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }

        // ------------------- Task3 Homework-5 -------------------
        System.out.println("\n------------------- Task3 Homework-5 -------------------");
        str = "";
        for (int i = arr1.length - 1; i >= 0 ; i--) {
            System.out.print(str + arr1[i]);
            str = ", ";
        }

        str = "";
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(str + arr2[i]);
            str = ", ";
        }

        str = "";
        System.out.println();
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.print(str + arr3[i]);
            str = ", ";
        }

        // ------------------- Task4 Homework-5 -------------------
        System.out.println("\n\n------------------- Task4 Homework-5 -------------------");

        // если эл-т массива нечетный, то к нему прибавляем +1
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0){
                arr1[i] += 1;
            }
        }

        // вывод массива в консоль
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}