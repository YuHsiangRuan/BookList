package bookList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bookList.Dao.BookEntityRepository;
import bookList.Model.BookEntity;
import bookList.Service.BookService;

@Controller

public class MainController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	//@GetMapping("/bookList")
	//public String bookList() {
	//	return "bookList";
	//}
	
	@RequestMapping("/bookList")
	public String list(Model model) {
		List<BookEntity> be = bookService.queryAll();
		model.addAttribute("books", be);
		return "bookList";
	}
	
	@RequestMapping("/toAdd")
    public String toAdd() {
        return "bookAdd";
    }

    @RequestMapping("/add")
    public String add(BookEntity bookentity) {
    	bookService.save(bookentity);
        return "redirect:/bookList";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id) {
    	BookEntity be = bookService.findUserById(id);
        model.addAttribute("books", be);
        return "bookEdit";
    }

    @RequestMapping("/edit")
    public String edit(BookEntity bookentity) {
    	bookService.edit(bookentity);
        return "redirect:/bookList";
    }


    @RequestMapping("/delete")
    public String delete(Integer id) {
        bookService.delete(id);
        return "redirect:/bookList";
    }
	
	
	
}
