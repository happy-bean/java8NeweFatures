package org.happybean.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author wgt
 * @date 2018-09-11
 * @description list中应用
 **/
public class LambdaList {

    public static void main(String[] args) {

        String[] a = {"a", "b", "c"};
        List<String> list = Arrays.asList(a);
        forEach(list);
    }

    public static void forEach(List<String> list) {

        list.stream().forEach(str -> {
            System.out.println(str);
        });
    }
}
