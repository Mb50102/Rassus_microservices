package hr.fer.tel.rassus.temperaturemicroservice;


import com.opencsv.CSVReader;
import hr.fer.tel.rassus.temperaturemicroservice.model.Measure;
import hr.fer.tel.rassus.temperaturemicroservice.repositories.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.FileReader;


@SpringBootApplication
@EnableEurekaClient
public class TemperatureMicroserviceApplication implements CommandLineRunner {

	@Autowired
	private MeasureRepository measureRepository;


	public static void main(String[] args) {

		SpringApplication.run(TemperatureMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try (CSVReader csvReader = new CSVReader(new FileReader("src/main/resources/measures.csv"))) {
			String[] values = null;
			csvReader.skip(1);
			while ((values = csvReader.readNext()) != null) {
				Measure measure=new Measure();

				if(values[0].equals("")){
					measure.setTemperature(0);
				}else {
					measure.setTemperature(Integer.parseInt(values[0]));
				}

				if(values[1].equals("")){
					measure.setPressure(0);
				}else {
					measure.setPressure(Integer.parseInt(values[1]));
				}

				if(values[2].equals("")){
					measure.setHumidity(0);
				}else {
					measure.setHumidity(Integer.parseInt(values[2]));
				}

				if(values[3].equals("")){
					measure.setCo(0);
				}else {
					measure.setCo(Integer.parseInt(values[3]));
				}

				if(values[4].equals("")){
					measure.setNo2(0);
				}else {
					measure.setNo2(Integer.parseInt(values[4]));
				}

				if(values[5].equals("")){
					measure.setSo2(0);
				}else {
					measure.setSo2(Integer.parseInt(values[5]));
				}

				measureRepository.save(measure);
			}
		}
	}


}
