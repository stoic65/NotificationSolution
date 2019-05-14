package com.varun.notificationsolution.domain;

import java.util.Comparator;

public class EntryComparator implements Comparator<Entry> {
  public int compare(Entry e1, Entry e2) {
    if(e1.dateOfJourney.compareTo(e2.dateOfJourney) > 0) {
      return 1;
    } else if(e1.dateOfJourney.compareTo(e2.dateOfJourney) < 0) {
      return -1;
    } else return 0;
  }
}
