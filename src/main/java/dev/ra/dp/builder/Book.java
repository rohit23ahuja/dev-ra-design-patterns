package dev.ra.dp.builder;

public final class Book {

    private String isbn;

    private String title;

    private String author;

    private Integer price;

    private Integer quantity;

    private Book() {
    }

    public static Book.Builder builder() {
        return new Book.Builder();
    }

    private Book(Builder builder) {
        Book book = new Book();
        if (builder.isbn != null)
            book.isbn = builder.isbn;
        if (builder.title != null)
            book.title = builder.title;
        if (builder.author != null)
            book.author = builder.author;
        if (builder.price != null)
            book.price = builder.price;
        if (builder.quantity != null)
            book.quantity = builder.quantity;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null) {
            return false;
        }
        if (getClass() != o2.getClass()) {
            return false;
        }

        Book book2 = (Book) o2;

        if (title.equals(book2.getTitle())) {
            return author.equals(book2.getAuthor());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hash = 53 * 3;
        hash = hash + (title != null ? title.hashCode() * 3 : 0);
        return hash;
    }

    public static int compareByTitleThenAuthor(Book b1, Book b2) {
        if (b1.getTitle()
                .equals(b2.getTitle())) {
            return b1.getAuthor()
                    .compareTo(b2.getAuthor());
        } else {
            return b1.getTitle()
                    .compareTo(b2.getTitle());
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public static class Builder {

        private String isbn;

        private String title;

        private String author;

        private Integer price;

        private Integer quantity;

        public Builder builder() {
            return new Builder();
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}