package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	BookMyShowRepository bookmyshowRepo;

	@Override
	public Mono<BookRequest> findById(String bookingId) {
		return bookmyshowRepo.findById(bookingId);
	}

	@Override
	public Flux<BookRequest> findAll() {
		return bookmyshowRepo.findAll();
	}

	@Override
	public Mono<BookRequest> save(BookRequest bookRequest) {
		return  bookmyshowRepo.save(bookRequest) ;
	}

	@Override
	public Mono<Void> deleteById(String bookingId) {
		return bookmyshowRepo.deleteById(bookingId);
	}

	@Override
	public Mono<BookRequest> update(BookRequest bookrequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<BookRequest> update(BookRequest bookrequest, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
	
	
}
