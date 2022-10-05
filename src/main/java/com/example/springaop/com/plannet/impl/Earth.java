package com.example.springaop.com.plannet.impl;

import com.example.springaop.com.plannet.IPlannet;
import com.example.springaop.com.resource.impl.Water;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Earth implements IPlannet {

    private final Water water;

    @Override
    public void revolve() {
        System.out.println("Inside Earth::revolve");
        //water.provide();
    }

}
