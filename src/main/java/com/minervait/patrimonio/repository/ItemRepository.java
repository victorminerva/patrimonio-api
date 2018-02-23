package com.minervait.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minervait.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
