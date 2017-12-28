package lesson6.ex3;

public class StringMas {
    public static void main(String[] args) {
        String[][] arr = new String[3][6];
        char c = 'a';
        for (int i = 0; i < 3; i++, c++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = c + "" + (j + 1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}