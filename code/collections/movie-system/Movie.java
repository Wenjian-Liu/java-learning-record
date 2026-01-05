package com.itheima.chap01.demo8test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Movie {
    private String name;
    private String actor;
    private double price;
    private double score;
}
