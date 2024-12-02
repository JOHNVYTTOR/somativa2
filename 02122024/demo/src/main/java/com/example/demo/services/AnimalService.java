package com.example.demo.services;
import java.util.List;
import com.example.demo.entities.Animal;
import com.example.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
private final AnimalRepository animalRepository;
	
@Autowired
public AnimalService(AnimalRepository animalRepository) {
this.animalRepository = animalRepository;
}
public List<Animal> getAllAnimais(){
	return animalRepository.findAll();
}			
public Animal saveAnimal(Animal animal) {
return animalRepository.save(animal);
}
	
public Animal getAnimalById(Long id) {
return animalRepository.findById(id).orElse(null);
}
	
}
