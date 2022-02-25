package uz.pdp.allayevsanjar_b9_2variant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.allayevsanjar_b9_2variant.entity.Book;
import uz.pdp.allayevsanjar_b9_2variant.entity.Library;

/**
 * @author Sanjarbek Allayev, пт 9:10. 25.02.2022
 */
public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
