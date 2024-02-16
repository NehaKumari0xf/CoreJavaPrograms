public class ex2 {
    public static void main(String args[])
    {
        System.out.println("Sum is: "+add(10,20,30,40,50,60,70,80,90,100));
        System.out.println("Sum is: "+add(10,20));
        System.out.println("Sum is: "+add(10.5,20.5));

        ex2 obj=new ex2();
        System.out.println("Product of two num is: "+obj.multiply(5,2 ));
        System.out.println("Product of total nums is: "+obj.multiply(5,2,3,4,5,6,2 ));
    }
    
    private static int add(int... nums){
        if(nums.length==0)return 0;
        int sum=nums[0];
        for(int n : nums){
            sum+=n;
        }return sum;
    }

    private static double add(double num1, double num2){
        return num1+num2;
    }

    private static int add(int num1, int num2){
        return num1+num2;
    }   

    int multiply(int num1, int num2){
        return num1*num2;
    }

    int multiply(int...nums){
        if(nums.length==0)return 0;
        int res=nums[0];
        for(int n: nums){
            res*=n;
        }return res;
    }
}


