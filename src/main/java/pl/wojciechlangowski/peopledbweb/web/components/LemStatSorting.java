package pl.wojciechlangowski.peopledbweb.web.components;

import pl.wojciechlangowski.peopledbweb.web.model.LemProductStatistics;

import java.util.Comparator;

public class LemStatSorting {
    Comparator<LemProductStatistics> comparator = new Comparator<LemProductStatistics>() {
        @Override
        public int compare(LemProductStatistics o1, LemProductStatistics o2) {
            return o1.getPartNumber().compareTo(o2.getPartNumber());

        }

    };
}
