package com.company;

import java.util.Arrays;

public class BallsInCells {

    public void boxesCells(int balls, int cells){
        if(cells> 1){
            for(int i=0; i<= balls; i++){
                System.out.print(balls-i);
                boxesCells(i,cells-1);
            }
       /* }else if(cells == 0) {
            System.out.println(0);*/
        }else{
            System.out.println(balls);

        }
    }


    public void combination(int balls, int cells){
        int[] arr = new int[cells];
        boolean end = true;
        int num = balls;
        int step = 0;
        if(cells > 0) {
            arr[0] = balls;
            System.out.println(Arrays.toString(arr));
        }
        while(arr[cells-1] != balls){
            if(step >= cells-1) {
                if(arr[step-1] == 0) {
                    step = 0;
                    num = arr[0];
                    arr = new int[cells];
                } else{
                    step --;
                }

                arr[step] = num;
            }
            num = --arr[step];
            if(step ==0){
                arr[step+1] = balls-num;
            } else {
                arr[step + 1]++;
            }
            step++;

            System.out.println(Arrays.toString(arr));

        }
    }

    public static void main(String[] args){
        BallsInCells gener = new BallsInCells();
        gener.combination(3,3);

    }
}
