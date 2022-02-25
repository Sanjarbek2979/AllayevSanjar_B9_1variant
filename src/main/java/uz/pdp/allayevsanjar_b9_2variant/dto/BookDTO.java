package uz.pdp.allayevsanjar_b9_2variant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sanjarbek Allayev, пт 9:13. 25.02.2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDTO{
        private String name;
        private String author;
        private Integer category;
        }
