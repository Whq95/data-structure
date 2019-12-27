package main;

public class Structure {

    public static int removeDuplicates(int[] nums){

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){
                 if( nums[i] > nums[j]){
                     int a = nums[j ];
                     nums[j] = nums[i];
                     nums[i] = a;
                 }
            }

        }

        int p = 0;
        int q = 1;
        for(int e = 0; e < nums.length && q < nums.length; e++){
            if(nums[p] != nums[q]){
                int a = nums[p];
                int b = nums[q];
                nums[p + 1] = nums[q];
                q++;
                p++;
            }else{
                q++;
            }
        }

        return p;
    }


    public static void main(String[] args) {

        int[] nums = {1,1,2,4,8,1,5};

        System.out.println("不同元素长度为：" + (removeDuplicates(nums)+1));
    }

}
