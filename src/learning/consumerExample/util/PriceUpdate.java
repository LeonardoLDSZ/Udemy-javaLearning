package consumerExample.util;

import consumerExample.entities.ProductConsumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<ProductConsumer> {
    @Override
    public void accept(ProductConsumer p) { //atualiza preço
        p.setPrice(p.getPrice() * 1.1);

    }

}
