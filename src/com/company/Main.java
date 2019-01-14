package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc= new Scanner(System.in);

        //int num=sc.nextInt();
        String str=sc.nextLine();

        StringBuilder sb=new StringBuilder("");

        System.out.println(rem_dup(str,sb));
//
//
//        for(int i=0;i<str.length();i++){
//
//            if(str.charAt(i)=='a'){
//                sb.append(0);
//            }else{
//                sb.append(1);
//            }
//        }

        //int n = str.length();

        //System.out.println(sb);
        //String str2=sb.toString();

        //System.out.println(findFlips(str2, n));



//
//        int [] arr=new int [num];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=sc.nextInt();
//        }
//
//        int num1=sc.nextInt();
//        System.out.println(lastIndex(arr,0,arr.length-1,num1));

        // rev_array(arr);


        //System.out.println(febo(num));
        //odd_even(num);
    }


    public static String dup(String str,StringBuilder ans){
        if(str.length()==1){
            ans.append(str.charAt(0));
            return ans.toString();
        }


        char ch=str.charAt(0);
        char ch2=str.charAt(1);
        str=str.substring(1);

        if(ch==ch2){
            ans.append(ch);
            ans.append("*");



        }else {
            ans.append(ch);

        }

        return dup(str,ans);

    }

    public static String rem_dup(String str,StringBuilder ans){
        if(str.length()==1||str.length()==0){
            if(str.length()==0){
                return ans.toString();
            }
            ans.append(str.charAt(0));
            return ans.toString();
        }



        char ch=str.charAt(0);
        char ch2=str.charAt(1);


        if(ch==ch2){
            ans.append(ch);
            str=str.substring(2);



        }else {
            ans.append(ch);
            str=str.substring(1);

        }

        return rem_dup(str,ans);

    }


    static int findFlips(String str, int n)
    {
        char last = ' '; int res = 0;

        for (int i = 0; i < n; i++) {

            // If last character is not equal
            // to str[i] increase res
            if (last != str.charAt(i))
                res++;
            last = str.charAt(i);
        }

        // To return min flips
        return res / 2;
    }

    public static int  febo(int num){
        if(num<=1){
            return num;
        }
        return febo(num-1)+febo(num-2);
    }

    public static void odd_even(int num){
        int odd=0;
        int even=0;
        int count=0;
        while(num!=0){
            count++;
            if(count%2!=0){
                odd+=num%10;
                num=num/10;
            }else {
                even+=num%10;
                num=num/10;
            }

        }

        if(count%2==0){

            System.out.println(odd);
            System.out.println(even);
        }else {

            System.out.println(odd);
            System.out.println(even);
        }
    }

    public static void rev_array(int [] arr){
        int num=0;
        for (int i = 0; i <arr.length/2 ; i++) {
            num=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=num;

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int lastIndex(int []arr,int start,int end,int num){

        if(start==end){
            if(arr[start]==num){

                return start;

            }else {

                return -1;
            }
        }

        if(arr[start]==num){

            if(lastIndex(arr,start+1,end,num)==-1){
                return start;
            }else {
                return lastIndex(arr,start+1,end,num);
            }

        }else {

            return lastIndex(arr,start+1,end,num);

        }
    }
}
