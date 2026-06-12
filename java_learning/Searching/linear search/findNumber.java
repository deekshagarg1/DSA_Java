// leetcode -- 1295. Find Numbers with Even Number of Digits--Given an array nums of integers, return how many of them contain an even number of digits.

// Example 1-
// Input: nums = [12,345,2,6,7896]
// Output: 2

class findNumber {
    public static int findNumbers(int[] nums) {
        int count =0 ;
      for( int num : nums){
          if(even(num)){
            count++;
        }
      }
        return count;
    }

    static boolean even(int num ){
        int numberOfDigit =  digitCount(num);
        return numberOfDigit % 2 == 0;
    }

    static int digitCount(int num){
        if(num == 0){
            return 1;
        }

        if(num < 0){
            num  = num *-1;
        }

        // int digit =0;
        // while(num>0){
        //     num = num/10;
        //     digit++;
        // }
        // return digit;

        return (int)(Math.log10(num)+1); //optimal way without iterations
    }

public static  void main(String[] args){
  int[]  nums = {12,345,2,6,7896};

    int ans = findNumbers(nums);
    System.out.print(ans);

}
    

}