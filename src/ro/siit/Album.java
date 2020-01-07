package ro.siit;

public class Album extends Book {
    private String paperQuality;

    public Album(String name, int numberOfPages, String paperQuality){
        super(name,numberOfPages);
        this.paperQuality=paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() + ", paper quality: " + paperQuality;
    }
}
