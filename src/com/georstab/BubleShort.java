package com.georstab;

public class BubleShort {
    int [] arrayToShort;

    public BubleShort(int[] arrayToShort) {this.arrayToShort = arrayToShort;}

    public void shortArray() {
        int index = 0;
        int counter = arrayToShort.length;


        while(counter!=1) {
            for (int i=1; i < counter; i++) {
                if (arrayToShort[index] > arrayToShort[i]) {
                    int temp = arrayToShort[i];
                    arrayToShort[i] = arrayToShort[index];
                    arrayToShort[index] = temp;
                }
                index++;
            }
            counter--;
            index = 0;
        }
    }

    public void printArray(){
        for (int i = 0; i <arrayToShort.length ; i++) {
            System.out.println(arrayToShort[i]);
        }
    }

}