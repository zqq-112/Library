package com.example.library.service;

import com.example.library.common.ServerResponse;
import com.example.library.pojo.BookInfo;

import java.util.List;


public interface IBookService {

    List<BookInfo> getAllBook();

    ServerResponse getBook();

}