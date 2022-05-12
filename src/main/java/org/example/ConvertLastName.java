package org.example;

import com.opencsv.bean.AbstractBeanField;
import org.apache.commons.lang3.StringUtils;

public class ConvertLastName<T, I> extends AbstractBeanField<T, I> {

    @Override
    protected Object convert(String value) {
        if (value == null || StringUtils.isAllEmpty())
            return null;
        return value.split(",")[0];
    }
}
