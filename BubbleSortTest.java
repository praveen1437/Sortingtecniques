package org.ie.practice;

import java.util.Arrays;

public class BubbleSortTest {
    public static void main(String[] args) {
        int [] a= new int[1500];
        int flag=0;
        for(int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*1000);
        }
        long time1= System.nanoTime();
      //  System.out.println(time1);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                   // flag=1;
                }
            }
            //if(flag!=1) break;
        }
        long time2= System.nanoTime();
      //  System.out.println(time2);
        System.out.println(time2-time1);
        System.out.println(Arrays.toString(a));
    }

    }

