package com.hyomee.core.utils;



import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class ConvertUtils {
    @SuppressWarnings("unchecked")
    public static <T> Map<String, String> convertToMap(T source) {

        Map<String, String> result = new HashMap<>();

        Set<Field> fields = ReflectionUtils.getFields(source.getClass()) ;

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                if (Objects.nonNull(field.get(source))) {
                    result.put(field.getName() , String.valueOf(field.get(source)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
