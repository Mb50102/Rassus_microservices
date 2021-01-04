package hr.fer.tel.rassus.humiditymicroservice;


import com.opencsv.CSVReader;
import hr.fer.tel.rassus.humiditymicroservice.model.HumidityMeasure;
import hr.fer.tel.rassus.humiditymicroservice.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.FileReader;


@SpringBootApplication
@EnableEurekaClient

public class HumidityMicroserviceApplication implements CommandLineRunner {

	@Autowired
	private MeasureRepository measureRepository;

	public static void main(String[] args) {
		SpringApplication.run(HumidityMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try (CSVReader csvReader = new CSVReader(new FileReader("src/main/resources/measures.csv"))) {
			String[] values = null;
			csvReader.skip(1);
			while ((values = csvReader.readNext()) != null) {
				HumidityMeasure measure=new HumidityMeasure();

				if(values[2].equals("")){
					measure.setHumidity(0);
				}else {
					measure.setHumidity(Integer.parseInt(values[2]));
				}
				measureRepository.save(measure);
			}
		}
	}


}
