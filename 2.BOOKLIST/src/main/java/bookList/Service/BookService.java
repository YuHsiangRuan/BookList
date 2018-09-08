package bookList.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import bookList.Dao.BookEntityRepository;
import bookList.Model.BookEntity;

@Service
public class BookService {
	
	@Autowired
	BookEntityRepository bookEntityRepository;
	
	public List<BookEntity>queryAll() {
		return bookEntityRepository.findAll();
	}
	
	public BookEntity findUserById(Integer id) {
        return bookEntityRepository.findById(id);
    }
	
	public void save(BookEntity bookEntity) {
		bookEntityRepository.save(bookEntity);
	}
	
	public void edit(BookEntity bookEntity) {
		bookEntityRepository.save(bookEntity);
	}
	
	public void delete(int id) {
		bookEntityRepository.delete(id);
	}

	
}
