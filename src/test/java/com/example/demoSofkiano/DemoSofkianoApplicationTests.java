package com.example.demoSofkiano;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demoSofkiano.model.Sofkiano;
import com.example.demoSofkiano.respositories.SofkianoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSofkianoApplicationTests {

	@Mock
	SofkianoRepository mockUserRepository;
	
	@Test
	public void notNullAllSofkianos(){
		assertNotNull("there are data in the databases", mockUserRepository.findAll());
	}
	
	@Test
	public void notErrorSaveUser(){
		Sofkiano sofkiano = new Sofkiano("Jhon","Titor");
		assertNotNull("Insert Succesfully", mockUserRepository.save(sofkiano));
	}

}

