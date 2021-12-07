package com.hemocentro.Hemocentro.config;


import com.hemocentro.Hemocentro.entity.TipodeSangueEntity;
import com.hemocentro.Hemocentro.repository.TipodeSangueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private TipodeSangueRepository tipodeSangueRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<TipodeSangueEntity> tipo = tipodeSangueRepository.findAll();
        Random random =new Random();
        if (tipo.isEmpty()){
            TipodeSangueEntity tipoO = new TipodeSangueEntity();
            tipoO.setTipo("O");
            int o = random.nextInt(30);
            tipoO.setQuantidade(o+20);
            tipodeSangueRepository.save(tipoO);
            TipodeSangueEntity tipoA = new TipodeSangueEntity();
            tipoA.setTipo("A");
            int a = random.nextInt(34);
            tipoA.setQuantidade(a+40);
            tipodeSangueRepository.save(tipoA);
            TipodeSangueEntity tipoAB = new TipodeSangueEntity();
            tipoAB.setTipo("AB");
            int ab = random.nextInt(28);
            tipoAB.setQuantidade(ab+45);
            tipodeSangueRepository.save(tipoAB);
            TipodeSangueEntity tipoB = new TipodeSangueEntity();
            tipoB.setTipo("B");
            int b = random.nextInt(14);
            tipoB.setQuantidade(b+30);
            tipodeSangueRepository.save(tipoB);
            TipodeSangueEntity tipoOn = new TipodeSangueEntity();
            tipoOn.setTipo("O-");
            int on = random.nextInt(25);
            tipoOn.setQuantidade(on + 50);
            tipodeSangueRepository.save(tipoOn);
            TipodeSangueEntity tipoAn = new TipodeSangueEntity();
            tipoAn.setTipo("A-");
            int an = random.nextInt(10);
            tipoAn.setQuantidade(an+40);
            tipodeSangueRepository.save(tipoAn);
            TipodeSangueEntity tipoABn = new TipodeSangueEntity();
            tipoABn.setTipo("AB-");
            int abn = random.nextInt(45);
            tipoABn.setQuantidade(abn+45);
            tipodeSangueRepository.save(tipoABn);
            TipodeSangueEntity tipoBn = new TipodeSangueEntity();
            tipoBn.setTipo("B-");
            int bn = random.nextInt(40);
            tipoBn.setQuantidade(bn+30);
            tipodeSangueRepository.save(tipoBn);

    }
}
}
