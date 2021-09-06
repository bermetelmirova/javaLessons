package com.company.jaxrs.dao;

import com.company.jaxrs.model.Sport;

public interface SportDao {
    Sport saveSport (Sport sport);
    Sport findById (Long id);
    Sport deleteById (Sport sport);
    Sport update (Sport sport);
}
