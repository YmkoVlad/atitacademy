package com.academy.task_eight.product;

import com.academy.task_eight.Products;

public class Seafood extends Products {

    private String sea;
    private String state;

    public Seafood(int weight, int calories, String sea, String state) {
        super(weight, calories);
        this.sea = sea;
        this.state = state;
    }

    public String getSea() {
        return sea;
    }

    public void setSea(String sea) {
        this.sea = sea;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
