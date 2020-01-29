package digitalLibrary;

import java.util.Comparator;

public class CustomComparator implements Comparator<MediaEntity> {

    @Override
    public int compare(MediaEntity o1, MediaEntity o2) {
        return o2.getNoOfDownloads().compareTo(o1.getNoOfDownloads());
    }
}
