public class day_5 {
    public static void main(String[] args){
        String a="varshi";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.substring(0)); //complete string
        System.out.println(a.substring(0,3)); 
        System.out.println(a.substring(3,3)); //empty
        System.out.println(a.substring(1,3)); //1 to 3 indexed strings
        System.out.println("hello".equals("Hello")); //false
        System.out.println(a.length()-1);
        System.out.println(a.substring(a.length()-1)); //last letter print
        System.out.println(a.substring(a.length()-3)); //last 3 digits print

        // strig concatinaton
        System.out.println("hello"+2+2); //hello22
        System.out.println("hello"+(2+2)); //hello4


        //for loops
        for(int i=0;i<10;i++){
            System.out.println("my name is varshitha");
        }


     /*    Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"   */

 //logic

 /* 
 public String stringTimes(String str, int n) {
    String result="";
    for(int i=0;i<n;i++){
      result=result+str;
    }
    return result;
  }
  
 */





    }
}
