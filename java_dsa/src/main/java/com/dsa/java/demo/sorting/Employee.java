package com.dsa.java.demo.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee  implements Comparable<Employee>{
    private Integer age;
    private String name;
    @Override
    public int compareTo(Employee o) {
        return this.age-o.age;
    }
}
