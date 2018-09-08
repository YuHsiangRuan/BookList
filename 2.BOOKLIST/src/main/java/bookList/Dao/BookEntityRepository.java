package bookList.Dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bookList.Model.BookEntity;

public interface BookEntityRepository extends JpaRepository<BookEntity,Integer> {

	BookEntity findById(Integer id);
	
	Integer deleteById(Integer id);

}
