package com.itheima.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

public interface BookService extends IService<Book> {


    IPage<Book> getPage(int current, int size, Book book);








}
