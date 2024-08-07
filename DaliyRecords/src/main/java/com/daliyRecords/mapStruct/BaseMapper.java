package com.daliyRecords.mapStruct;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface BaseMapper<T,E> {
    /**
     * 获取指定类型的映射器实例。
     * @param <T>   DTO 类型
     * @param <E>   Entity 类型
     * @param clazz 映射器接口类型
     * @return 映射器实例
     */
    static <T, E> BaseMapper<T, E> getMapper(Class<? extends BaseMapper<T, E>> clazz) {
        return Mappers.getMapper(clazz);
    }

    E toEntity(T dto);
    T toDto(E entity);

    List<E> toEntityList(List<T> dtoList);
    List<T> toDtoList(List<E> dtoList);
}
