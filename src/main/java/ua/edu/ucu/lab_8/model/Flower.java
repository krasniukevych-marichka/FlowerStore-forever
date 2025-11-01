package ua.edu.ucu.lab_8.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flowers")
public class Flower extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "flowertype")
    private String flowerType;

    @Column(name = "flowercolor")
    private String flowerColor;

    private double price;
    private boolean available;

    @Override
    public double price() {
        return price;
    }

    @Override
    public String getDescription() {
        return flowerType;
    }
    
}
