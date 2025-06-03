package com.ncapas.parcial.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface iGenericRepository<T, ID> extends JpaRepository<T, ID> {

    private String getClassName() {
        return this.getClass()
                .getGenericInterfaces()[0]
                .getTypeName()
                .replace("org.ncapas.parcial.Repository.iGenericRepository<", "")
                .replace(">", "");
    }

}
