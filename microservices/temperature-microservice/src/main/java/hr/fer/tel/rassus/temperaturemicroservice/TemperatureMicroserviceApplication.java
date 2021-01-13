package hr.fer.tel.rassus.temperaturemicroservice;


import com.opencsv.CSVReader;
import hr.fer.tel.rassus.temperaturemicroservice.model.TemperatureMeasure;
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

		try (CSVReader csvReader = new CSVReader(new FileReader(getClass().getResource("/measures.csv").getPath()))) {
			String[] values = null;
			csvReader.skip(1);
			while ((values = csvReader.readNext()) != null) {
				TemperatureMeasure measure=new TemperatureMeasure();

				if(values[0].equals("")){
					measure.setTemperature(0);
				}else {
					measure.setTemperature(Integer.parseInt(values[0]));
				}

				measureRepository.save(measure);
			}
		}
	}


}
