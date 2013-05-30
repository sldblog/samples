package org.i7m.annotations.by_inheritance;

import org.i7m.annotations.BookCatalog;
import org.i7m.annotations.Permissions;

public abstract class AbstractBookCatalog implements BookCatalog {

    @Override
    @Permissions("get-class")
    public void findById(int id) {
    }

    @Override
    @Permissions("create-class")
    public int create(String title) {
        return 0;
    }

}
