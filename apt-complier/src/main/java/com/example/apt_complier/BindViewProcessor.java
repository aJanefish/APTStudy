package com.example.apt_complier;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

@AutoService(Processor.class)
@SuppressWarnings("unused")
public class BindViewProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        return false;
    }
}