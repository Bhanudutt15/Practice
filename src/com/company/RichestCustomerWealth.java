package com.company;

public class RichestCustomerWealth {

    public static void main (String args[]) {

        int [][] accounts = {{1,0,4},{3,1,5},{2,1,4}};
        int sum=0;
        int temp=0;
        int col = 0;
        for(int i=0;i<accounts.length;i++) {
            col = accounts[i].length;
            int count = 0;
            for (int j = 0; j < col; j++) {
                temp = accounts[i][j];
                count = count + temp;
            }
            if (sum < count) {

                sum = count;
            }
        }
        System.out.println(sum);
}
}
