package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;


@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	@Autowired
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		
		return bookDao.findAll();
	}

	@Override
	public Optional<Book> getBookById(Integer bookId) {
		
		Optional<Book> book=bookDao.findById(bookId);
		return book;
	}

}
