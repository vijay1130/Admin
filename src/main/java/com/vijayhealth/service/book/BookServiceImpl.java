package com.vijayhealth.service.book;

import com.vijayhealth.entity.book.BookEntity;
import com.vijayhealth.repository.BookRepository;
import com.vijayhealth.service.kafka.producer.KafkaProducerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class BookServiceImpl implements BookService{

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    private final BookRepository bookRepository;
    private final KafkaProducerServiceImpl kafkaProducerService;

    public BookServiceImpl(BookRepository bookRepository, KafkaProducerServiceImpl kafkaProducerService) {
        this.bookRepository = bookRepository;
        this.kafkaProducerService = kafkaProducerService;
    }

    @Override
    public BookEntity createBook(BookEntity book) {
        logger.debug("Debugging some information...");
        LocalDateTime currentDateTime = LocalDateTime.now();
        book.setName(book.getName());
        book.setPrice(book.getPrice());
        book.setType(book.getType());
        book.setResPublishedAt(currentDateTime);
        book.setResUpdatedAt(currentDateTime);
        book.setResDeleted(false);
        BookEntity saveBook= bookRepository.save(book);
        kafkaProducerService.sendBookMessage(book);
        return saveBook;
    }


}
