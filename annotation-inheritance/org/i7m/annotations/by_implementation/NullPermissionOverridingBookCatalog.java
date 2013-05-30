package org.i7m.annotations.by_implementation;

import org.i7m.annotations.BookCatalog;
import org.i7m.annotations.Permissions;

public class NullPermissionOverridingBookCatalog implements BookCatalog {

    @Override
    @Permissions("awful")
    public void findById(int id) {
    }

    @Override
    public int create(String title) {
        return 0;
    }

}
