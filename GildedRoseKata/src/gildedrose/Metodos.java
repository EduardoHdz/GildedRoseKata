package gildedrose;

/**
 * Created by SLIFER on 19/10/2015.
 */
public class Metodos {

    void venta(Item item){
        //Si el precio es menor que 6
        if (item.getSellIn() < 11) {
            calidad(item);
        }
        //si la precio es menor que 6
        if (item.getSellIn() < 6) {

            calidad(item);
        }
    }

    void decreCalidadEspe(Item item){
        //Si la calidad es mayor que 0
        if (item.getQuality() > 0) {
            //Si el item se llama distinto a :
            if (item.getName() != "Sulfuras, Hand of Ragnaros") {
                decrementarCalidad(item);
            }
        }
    }

    void calidad(Item item){
        //Si la calidad es menor que 50
        if (item.getQuality() < 50) {
            // Aumenta la calidad del item a +1
            aumentarCalidad(item);
        }
    }

    void Item(Item item){
        //Si el item se llama distinto de :
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
    void decrementarCalidadNew(Item item) {

        item.setQuality(item.getQuality() - 2);

    }
}
