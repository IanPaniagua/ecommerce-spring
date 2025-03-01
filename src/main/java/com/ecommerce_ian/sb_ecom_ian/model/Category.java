package com.ecommerce_ian.sb_ecom_ian.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "categories")
// Genera automaticamente @Getter, @Setter, @ToString, @EqualsAndHashCode y @RequiredArgsConstructor.
@Data
//Crea un constructor sin argumentos (public Category() {}) para JPA
@NoArgsConstructor
//Crea un constructor con todos los argumentos (public Category(Long categoryId, String categoryName) {})
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;
}
