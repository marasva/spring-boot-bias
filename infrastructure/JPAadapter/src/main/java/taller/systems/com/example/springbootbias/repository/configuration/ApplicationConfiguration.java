package taller.systems.com.example.springbootbias.repository.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taller.systems.com.example.springbootbias.api.BiasService;
import taller.systems.com.example.springbootbias.api.BiasServiceImpl;
import taller.systems.com.example.springbootbias.repository.JPABiasRepositoryImpl;
import taller.systems.com.example.springbootbias.spi.BiasRepository;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public BiasRepository biasRepository(){
        return new JPABiasRepositoryImpl();
    }

    @Bean
    public BiasService biasService(BiasRepository biasRepository){
        return new BiasServiceImpl(biasRepository);
    }

    /*
    // Here the implementation of JPA should be, so JPABiasRepositoryImpl
    private JPABiasRepositoryImpl jpaBiasRepository;


     */

}

