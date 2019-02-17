/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat1.talabat1.rest.converter;

/**
 *
 * @author wadie
 */
public interface AbstractConverter<T, VO> {

    public T toItem(VO vo);

    public VO toVO(T t);

}
