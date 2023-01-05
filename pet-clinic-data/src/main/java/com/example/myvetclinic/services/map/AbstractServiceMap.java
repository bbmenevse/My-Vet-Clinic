package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll()
    {
     return new HashSet<>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }

    T save(T object)
    {
        if(object!=null)
        {
            if(object.getId()==null)
            {
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        else
        {
            throw new RuntimeException("AbstractMapService Runtime Exception, object was null");
        }

        return object;
    }

    void deleteById(ID id)
    {
        map.remove(id);
    }

    void delete(T object)
    {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private long getNextId()
    {
        if(map.isEmpty())
        {
            return 1;
        }
        else
        {
            return Collections.max(map.keySet()) +1;
        }

    }
}