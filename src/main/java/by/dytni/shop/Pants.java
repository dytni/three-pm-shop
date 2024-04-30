package by.dytni.shop;

public class Pants {
    Integer id;
    String name;
    String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Pants(Integer id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }
}
