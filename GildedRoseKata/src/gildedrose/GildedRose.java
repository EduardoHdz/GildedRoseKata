package gildedrose;

import java.util.List;

public class GildedRose {
	
	//Lista global
	List<Item> items;

	public void aumentarCalidad(String producto){
	
	}


	public void updateQuality() {
		for (Item item : items) {
            //Si el item no equivale a "Aged Brie" y "Back passes to TAFKAL80ETC concert"
			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                
                //Si la cantidad del item es mayor que 0
				if (item.getQuality() > 0) {
                    
                    //si el item no equivale 
					!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                    // resta la calidad del item -1
					item.setQuality(item.getQuality() - 1);
		}
				}
			} else {
                // si la cantidad del item es menor que 50
				if (item.getQuality() < 50) {
                    //Aumenta la cantidad 1 mas
					item.setQuality(item.getQuality() + 1);

                    //Si item equivale a 
					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        
                        //Si el precio de venta es menor a 11
						if (item.getSellIn() < 11) {
                            
                            //Si la calidad del item es menor que 50
							if (item.getQuality() < 50) {
                                
                                //Aumenta la calidad +1
								item.setQuality(item.getQuality() + 1);
							}
						}

                        //Si el precio de venta es menor a 6
						if (item.getSellIn() < 6) {
                            
                            // Si la calidad del item es menor a 50
							if (item.getQuality() < 50) {
                                
                                // Aumenta la calidad del item a +1
								item.setQuality(item.getQuality() + 1);
							}
						}
					}
				}
			}
            
            //Si el nombre del item no es igual a:
			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                
                //Resta el precio de venta -1
				item.setSellIn(item.getSellIn() - 1);
			}

            //Si el precio de venta es menor a 0
			if (item.getSellIn() < 0) {
                
                //Si el nombre del item no es :
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0) {
							if (item.getName() != "Sulfuras, Hand of Ragnaros") {
								item.setQuality(item.getQuality() - 1);
							}
						}
					} else {
						item.setQuality(item.getQuality() - item.getQuality());
					}
				} else {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}
	}

}
