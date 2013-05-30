package org.i7m.annotations.by_inheritance;

public class NullBookFromAbstractCatalog extends AbstractBookCatalog {

    @Override
    public void findById(int id) {
    }

    @Override
    public int create(String title) {
        return 0;
    }

}
