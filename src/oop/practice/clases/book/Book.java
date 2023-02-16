package oop.practice.clases.book;

import java.util.Arrays;

public class Book {
    private long id;
    private String name;
    private String[] authors;
    private String publishingHouse;
    private int yearOfPublish;
    private int pageCount;
    private BindingType type;

    public Book(long id, String name, String[] authors, String publishingHouse, int yearOfPublish, int pageCount, BindingType type) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.pageCount = pageCount;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public BindingType getType() {
        return type;
    }

    public void setType(BindingType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Name: " + name +
                ", Authors: " + Arrays.toString(authors) +
                ", PublishingHouse: " + publishingHouse +
                ", YearOfPublish: " + yearOfPublish +
                ", PageCount: " + pageCount +
                ", Type: " + type;
    }
}
