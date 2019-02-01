package hackerrank.xylemraj.mmt.hackerrank;

import java.util.Arrays;

public class ElectronicsShop {

    public static void main(String[] args) {

        getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10);
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int result = 0;
        int keyLength = keyboards.length;
        int drivesLength = drives.length;
        int finalCostArr[] = new int[keyLength + drivesLength];

        for (int i = 0; i < keyLength; i++) {
            int keyCost = keyboards[i];
            for (int j = 0; j < drivesLength; j++) {
                int finalCost = keyCost + drives[j];
                if (finalCost <= b && finalCost > finalCostArr[j]) {
                    finalCostArr[j] = finalCost;
                }
            }
        }
        Arrays.sort(finalCostArr);
        result = finalCostArr[finalCostArr.length - 1];
        if (result == 0) {
            result = -1;
        }

        return result;
    }

}
