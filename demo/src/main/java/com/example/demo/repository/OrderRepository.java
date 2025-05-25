package com.example.demo.repository;

import com.example.demo.data.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    TacoOrder save(TacoOrder tacoOrder);
}
