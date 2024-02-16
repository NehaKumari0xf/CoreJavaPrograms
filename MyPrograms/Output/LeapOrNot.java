public class LeapOrNot {
    public static void main(String arr[])
    {
        int year=2023;
        if(year%4==0 && year%100!=0 || year%400==0)
        System.out.print("Leap year");
        else
        System.out.print("Not a leap year");
    }
}
