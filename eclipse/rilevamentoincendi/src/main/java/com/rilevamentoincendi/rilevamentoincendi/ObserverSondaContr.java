package com.rilevamentoincendi.rilevamentoincendi;

public class ObserverSondaContr implements ObserverSonda {

    @Override
    public void onAlarm(Sonda sonda) {
       /* 
        System.out.println("Allarme rilevato:");
        System.out.println("ID sonda: " + sonda.getId());
        System.out.println("Coordinate: (" + sonda.getLatitudine() + ", " + sonda.getLongitudine() + ")");
        System.out.println("Livello di fumo: " + sonda.getSmokeLevel());
        */
        System.out.println("http://host/alarm?idsonda=" + sonda.getId() + "&lat=" + sonda.getLatitudine() + "&lon=" + sonda.getLongitudine()+ "&smokelevel=" + sonda.getSmokeLevel());
    
    }
    
}
