package com.br.festive.demo.port.dao.crud;

public interface DeleteDao {
    void deleteById(final int id);

    void deleteAllAccountMeetups(final int account_id);
}