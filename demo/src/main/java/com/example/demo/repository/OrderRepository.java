package com.example.demo.repository;

import com.example.demo.data.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder tacoOrder);
}
