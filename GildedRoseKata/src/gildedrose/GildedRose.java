package gildedrose;

import java.util.List;

public class GildedRose extends Metodos {


	public void updateQuality(List<Item> items) {
		for (Item item : items) {

			//Si el item no equivale a "Aged Brie" y "Back passes to TAFKAL80ETC concert y Sulfuras,Hand of Ragnaros
			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && !item.getName().equals("Sulfuras, Hand of Ragnaros")){
				//Si la cantidad del item es mayor que 0
				if (item.getQuality() > 0) {
					decrementarCalidad(item);
				}

		}else {
				calidad(item);
                    //Si item equivale a 
					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						venta(item);
					}

			}
            //====================================================================================================\\
            //Si el nombre del item no es igual a:
			ItemSulfuras(item);
			//if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                
                //Resta el precio de venta -1
			//	decrementarPrecio(item);
			//}

            //Si el precio de venta es menor a 0
			if (item.getSellIn() < 0) {


               // Si el nombre del item no es :
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						decreCalidadEspe(item);
					//	if (item.getQuality() > 0) {
					//		if (item.getName() != "Sulfuras, Hand of Ragnaros") {
					//			item.setQuality(item.getQuality() - 1);
					//		}
					//}
					} else {
						item.setQuality(item.getQuality() - item.getQuality());
					}
				}
				else {
						calidad(item);
				}
			}
		}
	}

}
