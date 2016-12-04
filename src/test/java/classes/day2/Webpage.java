package classes.day2;

/**
 * Created by Galek on 04.12.2016.
 */
public class Webpage {
    private String title;

    public Webpage(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Webpage webpage = (Webpage) o;

        return title != null ? title.equals(webpage.title) : webpage.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Webpage title=" + title;
    }
}
