package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        List<String> cocoas = Arrays.asList(
//                "Dairy milk",
//                "Snickers"
//        );
//
//        for(String cocoa : cocoas){
//            Chocolate chocolate = new Chocolate(cocoa);
//            chocolateRepository.save(chocolate);
//        }

        Estate estate1 = new Estate("DairyMilk", "Argentina");
        estateRepository.save(estate1);
        Estate estate2 = new Estate("Twix","France");
        estateRepository.save(estate2);
        Chocolate chocolate1 = new Chocolate("Bob", 90, estate2);
        chocolateRepository.save(chocolate1);
        Chocolate chocolate2 = new Chocolate("Tom", 13, estate1);
        chocolateRepository.save(chocolate2);

        estate1.addChocolate(chocolateRepository.findById(1l).get());


    }
}
