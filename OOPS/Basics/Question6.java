// Movie Rating System.
class MRS{
    private String name;
    private String genre;
    private float rating;

    public void SetName(String name){
        this.name=name;
    }
    public void SetGenre(String genre){
        this.genre=genre;
    }
    public void SetRating(float rating){
        this.rating=rating;
    }
    public boolean isHit(){
        if (rating>=8)
        return true;
        return false;
    }
}
class Test{
    public static void main(String args[]){
        MRS m1=new MRS();
        m1.SetName("SHoley");
        m1.SetGenre("Action Thriller Drama");
        m1.SetRating(7.9f);
        boolean hit = m1.isHit();
        System.out.println("Hit : " + hit);

    }
}