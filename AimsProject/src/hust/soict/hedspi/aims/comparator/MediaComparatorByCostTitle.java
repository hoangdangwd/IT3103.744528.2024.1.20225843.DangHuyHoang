package hust.soict.hedspi.aims.comparator;

import java.util.*;

import hust.soict.hedspi.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    
    public int compare(Media m1, Media m2) {
        int costComparison = Float.compare(m2.getCost(), m1.getCost()); // Higher cost first
        if (costComparison == 0) {
            return m1.getTitle().compareToIgnoreCase(m2.getTitle()); // Alphabetical order
        }
        return costComparison;
    }
}
