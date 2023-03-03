package Medium.FruitIntoBaskets;

public class Basket {
    public int totalFruit(int[] fruits) {
        int count = 1;
        int[] types = fruits;
        int prev = types[fruits.length - 1];
        for (int i = fruits.length - 1; i > 0; i--) {
            int cur = types[i];
            if (cur == prev){
                count++;
            }
            else {

            }
            prev = cur;
        }

        return count;
    }
}
