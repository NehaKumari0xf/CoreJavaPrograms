public class StringComparision
{
    public static void main(String...args)
    {
        String s1="Ram";
        String s2="Ram";
        String s3=new String("Ram");
        //comparing object
        System.out.println("1.=====================");
        if(s1==s2)
        System.out.println("s1 and s2 both refering to same object");
        else
        System.out.println("s1 and s2 are refering to different object");

        System.out.println("2.=====================");
        if(s1==s3)
        System.out.println("s1 and s3 both refering to same object");
        else
        System.out.println("s1 and s3 are refering to different object");

        //comparing content of string object
        System.out.println("3.=====================");
        if(s1.equals(s3))
        System.out.println("s1 and s3 has same content");
        else
        System.out.println("s1 and s2 has different content");

        String s4="ram";
        System.out.println("4.=====================");
        if(s3.equals(s4))
        System.out.println("s3 and s4 has same content");
        else
        System.out.println("s3 and s4 has different content");
        //string's equals() compares string case sensitively

        //comapring string case insensitively/Ignore case

        //string class has equalsIgnoreCase() to compare string content by ignoring case
        System.out.println("5.=====================");
        if(s3.equalsIgnoreCase(s4))
        System.out.println("s3 and s4 has same content");
        else
        System.out.print("s3 and s4 has different content");

        /*strin's compareTo() and compareToIgnore()
         * both function compares the content of string object. and return an integer value
         * return value == 0 both string has same content
         * return value < 0 1st string content is smaller than 2nd string
         * return value > 0 1st string content is larger than 2nd string
        */
        System.out.println("6. =====================");
        if(s3.compareTo(s4)==0)
        System.out.println("s3 and s4 has same content");
        else
        System.out.println("s3 and s4 has differnt content");
    }
}
/* Write a java program in which accept name of 10 students and print all names in ascending order */
/*Write a java program in which create an string array having 25 different strings. Accept an string from user and check the entered string is available in list or not */