class Q44{
    public static void main(String[]args){
        int n=28, a=-21, an;
        int d=-18-(-21);
        an= a+(n-1)*d;
        System.out.println("d- "+d);
        System.out.println("nth term of AP (an)= "+an);
        int s=n/2*(a+an);
        System.out.println("Sum of last term is =  " + s);
    }
}