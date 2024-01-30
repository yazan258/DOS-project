package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Catalog {
    private long id;
    private float price;
    private int quantity;
    private String title;
    private String topic;
}
