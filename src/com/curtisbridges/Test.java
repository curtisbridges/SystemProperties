package com.curtisbridges;

import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties prop = System.getProperties();
        prop.list(System.out);
    }
}
