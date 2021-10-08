package com.hz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 罗远
 * @date 2021-08-06-16:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int sid;
    private String sname;
    private int sage;
}
