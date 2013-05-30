package org.i7m.annotations.by_implementation;

import org.i7m.annotations.BookCatalog;

public class NullBookCatalog implements BookCatalog {

    @Override
    public void findById(int id) {
    }

    @Override
    public int create(String title) {
        return 0;
    }

}
