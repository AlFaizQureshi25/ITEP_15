class Q39{
    public static void main(String args []){
        int h=4,l=5;
        double r,area,pie=3.14f,cost=10;
        r=(float)(Math.sqrt(Math.pow(l,2)-Math.pow(h,2)));
        area=(float)pie*Math.pow(r,2);
        cost=cost*area;
        System.out.println("r="+r);
        System.out.printf("area= %.2f\n",area);
        System.out.printf("cost=RS %.2f",cost);
        
    }
    
}