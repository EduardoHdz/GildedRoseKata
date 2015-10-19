package gildedrose;

/**
 * Created by SLIFER on 19/10/2015.
 */
public class Metodos {

    void venta(Item item){
        if (item.getSellIn() < 11) {

            calidad(item);
        }
        if (item.getSellIn() < 6) {

            calidad(item);
        }
    }

    void decreCalidadEspe(Item item){
        if (item.getQuality() > 0) {
            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                decrementarCalidad(item);
            }
        }
    }

    void calidad(Item item){
        if (item.getQuality() < 50) {
            // Aumenta la calidad del item a +1
            aumentarCalidad(item);
        }
    }


    void ItemSulfuras(Item item){
        if (item.getName() != "Sulfuras, Hand of Ragnaros") {
            //Resta el precio de venta -1
            decrementarPrecio(item);

        }
    }

    void aumentarCalidad(Item item){
        item.setQuality(item.getQuality() + 1);
    }

    void decrementarCalidad(Item item) {

        item.setQuality(item.getQuality() - 1);

    }
    void decrementarPrecio(Item item){
        item.setSellIn(item.getSellIn() - 1);
    }
}
