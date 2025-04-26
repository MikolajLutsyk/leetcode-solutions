package org.example.LeetCode75.Array_String;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int counter = 0;

        if(flowerbed.length == 1){
            if(n == 0){
                return true;
            }
            return flowerbed[0] != 1;
        }

        if(flowerbed[1] == 0 && flowerbed[0] == 0){
            flowerbed[0] = 1;
            counter++;
        }

        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            flowerbed[flowerbed.length - 1] = 1;
            counter++;
        }

        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                flowerbed[i] = 1;
                counter++;
            }
        }

        return counter >= n;
    }
}
