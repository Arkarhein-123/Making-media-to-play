//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("****Media Player****");
        Book theLastDayOfPompie = new Book("The Last Day Of Pompie","OrinOn",452);
        Movie inceptionMovie = new Movie("Inception","Arkar",120);
        Music somewhereOnlyWeKnow= new Music("SomewhereOnlyWeKnow","Knee","Rock");

        MediaLibrary library =new MediaLibrary();
        Media addedBook=library.addMedia(theLastDayOfPompie);
        Media addedMoive=library.addMedia(inceptionMovie);
        Media addedMusic=library.addMedia(somewhereOnlyWeKnow);

        library.playMedia(addedBook);
        library.playMedia(addedMoive);
        library.playMedia(addedMusic);

    }
}