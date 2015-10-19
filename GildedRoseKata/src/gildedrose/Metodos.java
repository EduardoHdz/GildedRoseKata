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


    void calidad(Item item){
        if (item.getQuality() < 50) {
            // Aumenta la calidad del item a +1
            aumentarCalidad(item);
        }
    }

    void aumentarCalidad(Item item){
        item.setQuality(item.getQuality() + 1);
    }

    void decrementarCalidad(Item item) {

        item.setQuality(item.getQuality() - 1);

    }
}
