public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] trans = new int[3][2];
        System.out.println("Matris : ");
        for (int[] row : arr){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("Transpoze : ");
        for (int i = 0; i < arr.length+1; i++){
            for (int j = 0; j < arr.length; j++){
                trans[i][j] = arr[j][i];
            }
        }
        for (int[] row : trans){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}