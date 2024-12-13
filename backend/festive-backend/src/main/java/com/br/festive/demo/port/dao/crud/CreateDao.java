package com.br.festive.demo.port.dao.crud;

public interface CreateDao<T> {
    int save(final T entity);
}
