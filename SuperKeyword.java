// // Super keyword is use to refrence variable to parent afther the extended.
// // This keyword is use to refrence variable to child afther the extended.

// class Abc
// {
//     int a = 10 ;
// }
// class SuperKeyword extends Abc
// {
//     int a = 240 ;
//     void show(int a)
//     {
//         int c;
//         System.out.println(a);
//         System.out.println(c =this.a+super.a);
//         System.out.println(c);
//         System.out.println(super.a);
        
//     }
//     public static void main(String[] args) 
//     {
//         SuperKeyword A = new SuperKeyword();
//         A.show(45);
      
      
        
//         // System.out.println(super.a);

        
//     }

// 

// 
// ...................................................................................

// Super used 2 nd method

class A 
{
    int a;
     A()
    {
        System.out.println("adh");
    }
        
    
}
class SuperKeyword extends A
{
     SuperKeyword()
    {
        super();
        System.out.println("adhu daeling");
        // super.show();

   
    }

    public static void main(String[] args) 
    {
            SuperKeyword AB = new SuperKeyword();
            // AB.dep();
        
    }
}








