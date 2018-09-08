package bookList.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="list")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //須於mysql內將id 設為 primary key, unique
	@Column(name="id")
	private Integer id;
	@Column(name="bookname")
	private String bookname;
	@Column(name="point")
	private String point;
	@Column(name="page")
	private Integer page;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	
	public BookEntity(String bookname, Integer page) {
		super();
		this.bookname = bookname;
		this.page = page;
	}
	@Override
	public String toString() {
		return "Book List:  Id: " + id + ", 書名: " + bookname + ", 重點: " + point + ", 上次頁數: " + page + " ";
	}
	public  BookEntity() {}
	
	
	
	
	
}
