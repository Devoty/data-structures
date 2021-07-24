package com.devoty.data.struct;


/**
 * 摩尔选举法
 */
public class Moore {

    public static String moore(int[] arrays){
        int vote = 0;
        int candidate = 0;
        for (int n: arrays) {
            if(vote == 0){
                candidate = n;
            }
            if(n == candidate){
                vote++;
            }
            if (n != candidate){
                vote--;
            }
        }

        return String.valueOf(candidate);
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,4,4,4,1,2,2,2,2,2,2,2,2};
        System.out.println(moore(arrays));
    }
}
