package com.example.productservice.models;

import com.example.productservice.fakestoreapi.models.FSRating;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating extends BaseModel {
    private Double rate;
    private Integer count;

    public Rating(FSRating rating) {
        this.rate = rating.getRate();
        this.count = rating.getCount();
    }
}
