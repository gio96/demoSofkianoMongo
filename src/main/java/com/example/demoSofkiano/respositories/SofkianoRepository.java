package com.example.demoSofkiano.respositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demoSofkiano.model.Sofkiano;


public interface SofkianoRepository extends MongoRepository<Sofkiano, String>{
	
}
