public class Movie extends Media{
    int durationInMinute;

    public Movie(String title, String creator, int durationInMinute) {
        super(title, creator);
        this.durationInMinute = durationInMinute;
    }

    @Override
    public void play(){
        System.out.println("Watching "+title+" by "+creator+". Duration :"+durationInMinute);
    }
}
