/*In C and C++ constant variable is created using const keyword. but Java has no const keyword
 * 
 * final keyword
 * --------------------
 * 1. used to create final/constant variable
 * ex:
 * int i=10;//i is a normal variable
 * final int j=20;//j is final/const variable
 * 
 * 2. Class method can be final
 * ---------------------------------
 * final method can't be overriden
 * ex:
 * class deom
 * {
 * //This method can't be override in sub classes
 *  public final returnType methodName(argLis)
 * {
 * //method defination
 * }
 * }
 * 
 * 3. Class can be final
 * ---------------------------------
 * final class can't be inherited
 * ex:
 * //this class can't be inherited
 * final class Demo
 * {
 * //class body
 * }
 * 
*/
public class final {
    public static void main(String...args)
    {
        int i=10;
        final int j=20;
        System.out.println("i="+i+", j="+j);
        i++;
        //j++;//Error:j is final
        i=50;//correct
        //j=90;//Error
    }
    
}
/*abstract V/s final */

/*1. Interface
 * 2. Inner Class
 * 3. Exception Handling
 * 4. GUI
 */