package com.dsa.java.demo.shallowdeep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    private Integer id;
    private String name;

    public boolean equals(Object o){
        if (o==null|| getClass()!=o.getClass()){
            return false;
        }
        if (o==this){
            return true;
        }
        Emp emp=(Emp)o;
        return (this.getId()==emp.getId());


    }
}
