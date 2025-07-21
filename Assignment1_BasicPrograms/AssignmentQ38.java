class Q38{
    public static void main(String[]args){
        int p=36, a=10,b=9;
        int c;
        c= p-(a+b);
        System.out.println("c= "+c);
        double s=p/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area of triangle = "+area);
    }
}