package com.dsa.java.demo.shallowdeep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer id;

    public boolean equals(Object o){
        if (o==null || getClass()!=o.getClass()){
            return false;
        }
        if (o==this){
            return true;
        }
        Student student=(Student) o;
        return (this.getId()==student.getId());

    }

}
