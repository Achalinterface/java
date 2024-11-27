package Practice;

public class Test_3 {
   public static void main(String[] args) {
    int a = 0;
    int b = 1;
    int c;

    System.out.print(a +" "+ b + " ") ;
    for(int i = 3 ; i <= 10; i++){
        c = a + b;
        System.out.print(c + " ");
        a = b;
        b = c;
    }
   }
}

// package Practice;

// public class Test_3 {
//    public static void main(String[] args){
    
//     for(int i = 0; i <=  10 ;  i++){
//         System.out.print(febonacci(i) + " ");
//             }
//            }
        
//          public static int febonacci(int i) {
//             if (i <= 1) {
//                 return i;
//             }
//             return febonacci(i-1) + febonacci(i- 2);
           
//         } 
// }
