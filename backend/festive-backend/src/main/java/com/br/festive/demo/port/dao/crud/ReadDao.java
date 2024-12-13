package com.br.festive.demo.port.dao.crud;

import java.util.List;

public interface ReadDao<T> {
    T readById(final int id);

    List<T> readAll();
}
