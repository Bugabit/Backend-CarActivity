package com.activity.car;

import com.activity.car.service.CarService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarApplicationTests {
	CarService carService = new CarService();

	@Test
	void contextLoads() {
		carService.restart();
		int i=0;
		int j=100;
		boolean termino=true;
		while(j>i && termino){
			int numero = (int)(Math.random()*4);
			switch (numero){
				case 0:
					carService.move("w");
					i++;
					if(carService.getCarData().get("vidas")<1 || carService.getCarData().get("vidas")>10 ){
						termino=false;
					}
					break;
				case 1:
					carService.move("a");
					i++;
					if(carService.getCarData().get("vidas")<1 || carService.getCarData().get("vidas")>10 ){
						termino=false;
					}
					break;
				case 2:
					carService.move("s");
					i++;
					if(carService.getCarData().get("vidas")<1 || carService.getCarData().get("vidas")>10){
						termino=false;
					}
					break;
				case 3:
					carService.move("d");
					i++;
					if(carService.getCarData().get("vidas")<1 || carService.getCarData().get("vidas")>10){
						termino=false;
					}
			}
		}
		boolean tieneSentido=true;
		if(carService.getCarData().get("vidas")>20||carService.getCarData().get("vidas")<-10 || carService.getCarData().get("posX")<-1||carService.getCarData().get("posX")>12 || carService.getCarData().get("posY")<-1||carService.getCarData().get("posY")>12){
			 tieneSentido=false;
		}

		assertEquals(true,tieneSentido);
	}

}
