package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();
    public BrowseHistory() {}

    public String pop() {
        int lastIndex = urls.size() - 1;
        String value = urls.get(lastIndex);
        urls.remove(lastIndex);
        return value;
    }
    public void push(String val) {
        urls.add(val);
    }
    public List<String> getUrls() {
        return urls;
    }
    public Iterator createIterator() {
        return new ListIterator(this);
    }

    //Inner class that we create implemenation of iterator (can access to private methods of outer class)
    class ListIterator implements Iterator {
        private BrowseHistory history;
        private int index;
        ListIterator(BrowseHistory history) {
            this.history = history;
        }
        @Override
        public String current() {
            return getUrls().get(index);
        }
        @Override
        public boolean hasNext() {
            return index < getUrls().size();
        }
        @Override
        public void next() {
            index++;
        }
    }

}
