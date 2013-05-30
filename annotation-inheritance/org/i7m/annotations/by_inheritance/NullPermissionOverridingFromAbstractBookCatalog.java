package org.i7m.annotations.by_inheritance;

import org.i7m.annotations.Permissions;

public class NullPermissionOverridingFromAbstractBookCatalog extends AbstractBookCatalog {

    @Override
    @Permissions("awful")
    public void findById(int id) {
    }

    @Override
    public int create(String title) {
        return 0;
    }

}
