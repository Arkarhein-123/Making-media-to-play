public class MediaLibrary {
    public Media addMedia(Media mediaItem){
        System.out.println("Added to "+mediaItem.title+" ...");
        return mediaItem;
    }

    public void playMedia(Media mediaItem){
        mediaItem.play();
    }
}
