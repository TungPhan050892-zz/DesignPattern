package com.tungphan.designpatternsample.behavioral.iterator;

/**
 * Created by phant on 06-02-18.
 */

public class BookCollection implements IContainer {

    private String[] titles = {"Design pattern", "1", "2", "3", "4"};

    public IIterator createIterator() {
        return new BookIterator();
    }

    private class BookIterator implements IIterator {

        private int position;

        @Override
        public boolean hasNext() {
            return position < titles.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return titles[position++];
            }
            return null;
        }

    }

}
