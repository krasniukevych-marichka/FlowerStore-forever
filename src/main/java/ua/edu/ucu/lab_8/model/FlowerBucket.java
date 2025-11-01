package ua.edu.ucu.lab_8.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerBucket extends Item {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlowers(List<Flower> newFlowers) {
        flowers.addAll(newFlowers);
    }

    @Override
    public double price() {
        return flowers.stream()
                .mapToDouble(Flower::getPrice)
                .sum();
    }
}
