package hust.soict.hedspi.aims.comparator;

import java.util.*;

import hust.soict.hedspi.aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    
    public int compare(Media m1, Media m2) {
        int titleComparison = m1.getTitle().compareToIgnoreCase(m2.getTitle());
        if (titleComparison == 0) {
            return Float.compare(m2.getCost(), m1.getCost()); // Higher cost first
        }
        return titleComparison;
    }
}
