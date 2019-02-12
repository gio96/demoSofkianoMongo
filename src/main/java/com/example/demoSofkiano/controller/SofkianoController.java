package com.example.demoSofkiano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoSofkiano.model.Sofkiano;
import com.example.demoSofkiano.respositories.SofkianoRepository;

@RequestMapping("/api")
@RestController()
public class SofkianoController {
	
	@Autowired
	private SofkianoRepository sofkianoRepository;
	
	@GetMapping("/allSofkianos")
	public List<Sofkiano> getAllSofkianos(){
		return sofkianoRepository.findAll();
	}
	
	@PostMapping("/saveSofkiano")
	public Sofkiano saveSofkiano(@RequestBody Sofkiano  sofkiano) {
		return sofkianoRepository.save(sofkiano);
	}

}
