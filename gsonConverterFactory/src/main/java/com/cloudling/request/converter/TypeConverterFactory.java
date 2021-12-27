package com.cloudling.request.converter;

/**
 * 描述: 成功/失败回调参数解析类型为Type
 * 联系: 1966353889@qq.com
 * 日期: 2021/12/27
 */
public abstract class TypeConverterFactory<S, F> extends DefaultConverterFactory<S, F> {

    @Override
    public Class<S> getSuccessClassType() {
        return null;
    }

    @Override
    public Class<F> getFailClassType() {
        return null;
    }
}
