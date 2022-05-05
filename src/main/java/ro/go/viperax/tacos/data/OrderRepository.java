package ro.go.viperax.tacos.data;

import org.springframework.data.repository.CrudRepository;
import ro.go.viperax.tacos.TacoOrder;

public interface OrderRepository 
         extends CrudRepository<TacoOrder, Long> {

}
