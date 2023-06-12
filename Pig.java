

import java.io.*;
import java.util.*;
public class Pig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int unknown=0;
            int knownM=0, ava=0, rem =0;
            boolean isfst = true;
            int arr[] = new int [n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i] != 2){
                    if(rem <= 0){
                        unknown++;
                        ava++;
                    } else {
                        unknown++;
                        rem--;
                    }
                } else {
                    if(unknown > 0 && isfst){
                        knownM = unknown-1;
                        unknown = 0;
                        isfst = false;
                        if(knownM % 2 == 0){
                            rem = ava - (knownM/2) - 1;
                        } else {
                            rem = ava - (knownM/2) - 2;
                        }
                    } else if(unknown > 0){
                        knownM += unknown;
                        unknown=0;
                        if(knownM % 2 == 0){
                            rem = ava - (knownM/2)-1;
                        } else {
                            rem = ava - (knownM/2)-2;
                        }
                    }
                }
            }
            System.out.println(ava);
        }
    }
}