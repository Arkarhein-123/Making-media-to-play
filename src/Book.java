public class Book extends Media{
    int page;

    public Book(String title, String creator, int page) {
        super(title, creator);
        this.page = page;
    }

    @Override
    public void play(){
        System.out.println("Reading "+title+" by "+creator+" with the page of "+page);
    }
}
