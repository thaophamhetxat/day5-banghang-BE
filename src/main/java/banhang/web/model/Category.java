package banhang.web.model;

public class Category {
    long id;
    String nameCategory;   //tên thể loại
    String description;       //mô tả

    @OneToMany
}
