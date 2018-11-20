package pl.michalgellert.springbootcourse.service;

import pl.michalgellert.springbootcourse.persistence.model.BaseEntity;
import pl.michalgellert.springbootcourse.persistence.repository.BaseRepository;

import java.io.Serializable;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseServiceImpl<T extends BaseEntity, K extends Serializable, R extends BaseRepository<T, K>> implements BaseService<T, K, R> {

    public abstract R getRepository();

    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T delete(K id) {
        T entity = getOne(id);
        entity.setActive(false);
        return save(entity);
    }

    @Override
    public T getOne(K id) {
        T t = getRepository().getOne(id);
        if(t.getActive())
            return t;
        else
            return null;
    }

    @Override
    public Collection<T> getAll() {
        return getRepository().findAll()
                .stream()
                .filter(BaseEntity::getActive)
                .collect(Collectors.toList());
    }
}
