package com.st.demo.ejb;

import javax.ejb.Stateless;
import javax.inject.Named;
import java.io.Serializable;

@Named
@Stateless
public class HelloEJB implements Serializable {

    public HelloEJB() {
    }

    public String getValue() {
        return "Hello";
    }
}
