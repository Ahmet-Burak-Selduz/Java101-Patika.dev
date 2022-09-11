public class Main {
    static boolean isFind(int[] list, int n){
        for (int i : list){
            if (i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 5, 4, 0, 1, 3, 4, 6, 8};
        int[] test = new int[list.length];
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (i != j && list[i] == list[j] && list[i] % 2 == 0 && !isFind(test, list[i]))
                    test[i] = list[i];
            }
        }
        for (int value : test){
            if (value != 0)
                System.out.println(value);
        }
    }
}
