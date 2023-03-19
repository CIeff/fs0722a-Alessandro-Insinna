package com.rilevamentoincendi.rilevamentoincendi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner  implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
       
       ObserverSondaContr logger= new ObserverSondaContr();
       ObserverController observerController= new ObserverController();
       SondaProxy sondaProxy = new SondaProxy(logger);
       observerController.addObserver(sondaProxy);

       Sonda sonda1= new Sonda(1111L,"45.54","54.45",6);
       observerController.notificaObservers(sonda1);

       Sonda sonda2= new Sonda(1112L,"22.45","45.22",4);
       observerController.notificaObservers(sonda2);

    }
    
}
