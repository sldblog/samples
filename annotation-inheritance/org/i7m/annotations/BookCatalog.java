package org.i7m.annotations;

public interface BookCatalog {
    @Permissions("get")    void findById(int id);
    @Permissions("create") int  create(String title);
}
