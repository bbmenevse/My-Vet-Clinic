package com.example.myvetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* Eğer farklı bir yerde paket açıp bazı dosyaları oraya taşısaydık, @ComponentScan(basepackage={"com.example.myvetclinic;","yeni adresi" })  şeklinde ekleyerek tanıtmamız gerekirdi
*  Öte yandan, yukarıda autoconfigure de bunu yapabiliyor sanırım, gerekirse araştırılabilir.
* */
@SpringBootApplication
public class MyVetClinicApplication {
	public static void main(String[] args) {
		System.out.print(" Main application started ");
		SpringApplication.run(MyVetClinicApplication.class, args);

	}

}
