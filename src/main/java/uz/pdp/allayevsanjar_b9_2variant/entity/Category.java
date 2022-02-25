package uz.pdp.allayevsanjar_b9_2variant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Sanjarbek Allayev, пт 8:59. 25.02.2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(nullable = false,unique = true)
    private String name;

    @ManyToOne
    private Library library;
}
