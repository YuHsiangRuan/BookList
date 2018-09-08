package bookList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookList.Model.BookEntity;
import bookList.Service.BookService;

@RestController
public class BookListController {

	@Autowired
	BookService bookService;
	
	//@RequestMapping("/bookList")
	//public String list(Model model) {
	//	List<BookEntity> be = bookService.queryAll();
	//	model.addAttribute("books", be);
	//	return "bookEntity/bookList";
	//}
	
	@GetMapping("save-task")
	public String saveTask(@RequestParam String bookname, @RequestParam Integer page) {
		BookEntity be = new BookEntity(bookname, page);
		bookService.save(be);
		return "saved!";
	}
	
	@GetMapping("delete-task")
	public String saveTask(@RequestParam int id) {
		bookService.delete(id);
		return "deleted!";
	}
}
