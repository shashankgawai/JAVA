// this keyword uses

class ThisKeyword
{
    int s;
    int set(int i)
    {
        
//    1st use to refrence in instace varibale //    this.i=i;
            s=i;
            // return this;

    }
    void get()
    {
        System.out.println("This is number "+s);
    }
    public static void main(String[] args) {
        System.out.println("This is new");
        ThisKeyword K = new ThisKeyword();
        K.set(15);
        K.get();



    }





}