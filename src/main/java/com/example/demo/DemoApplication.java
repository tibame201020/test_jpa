package com.example.demo;

import com.example.demo.model.BaseMap;
import com.example.demo.model.BaseUser;
import com.example.demo.model.ProMap;
import com.example.demo.model.ProUser;
import com.example.demo.repo.BaseMapRepo;
import com.example.demo.repo.BaseUserRepo;
import com.example.demo.repo.ProMapRepo;
import com.example.demo.repo.ProUserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner run(BaseUserRepo baseUserRepo, ProUserRepo proUserRepo) {
		return args -> {

			//base map
			BaseMap baseMap = new BaseMap();
			baseMap.setMapName("baseMap1");
			//base user
			BaseUser baseUser = new BaseUser();
			baseUser.setMap(baseMap);
			baseUser.setUserName("baseUser1");
			baseUserRepo.save(baseUser);

			//pro map
			ProMap proMap = new ProMap();
			proMap.setMapName("proMap1");
			proMap.setProMapProp("proMapProp");
			//pro user
			ProUser proUser = new ProUser();
			proUser.setMap(proMap);
			proUser.setUserName("proUser1");
			proUser.setProUserProp("proUserProp");
			proUserRepo.save(proUser);

			//getAllShow
			System.out.println("select pro user : proUserRepo.findAll()");
			for (ProUser proUser1:proUserRepo.findAll()) {
				System.out.print(proUser1.getUserId() + " ");
				System.out.print(proUser1.getUserName()+ " ");
				System.out.print(proUser1.getProUserProp()+ " ");
				System.out.print(proUser1.getMap().getMapName()+ " ");
				System.out.print(proUser1.getMap().getProMapProp()+ " \n");
			}

			System.out.println("select base user : baseUserRepo.findAll()");
			for (BaseUser baseUser1:baseUserRepo.findAll()) {
				System.out.print(baseUser1.getClass() + " ");
				System.out.print(baseUser1.getUserId() + " ");
				System.out.print(baseUser1.getUserName() + " ");
				System.out.print(baseUser1.getMap().getMapName()+ " ");
				System.out.print(baseUser1.getMap().getMapName()+ " \n");
			}


		};
	}

}
