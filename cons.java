class cons 
{
    public cons()
    {
        System.out.println("This is my constructor");
    }
    //paramiterized constructor
    public cons(int a,int b)
    {
        System.out.println("Addition is:"+(a+b));
    }
    public static void main(String[] args){
        cons c=new cons();
        cons cl=new cons(10,50);
    }
}