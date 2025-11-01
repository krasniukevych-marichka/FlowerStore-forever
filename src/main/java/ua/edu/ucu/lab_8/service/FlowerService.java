package ua.edu.ucu.lab_8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.lab_8.model.Flower;
import ua.edu.ucu.lab_8.repository.FlowerRepository;

@Service
public class FlowerService {

    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }


    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower addFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
    
}
