package com.example.apt_complier;

import com.example.anno.Test;
import com.google.auto.service.AutoService;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

//这是用来注册注解处理器要处理的源代码版本。
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
@SuppressWarnings("unused")
public class BindViewProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE, "process zhangyu12152");
        messager.printMessage(Diagnostic.Kind.NOTE, "process zhangyu12152");
        messager.printMessage(Diagnostic.Kind.NOTE, "process zhangyu12152");
        messager.printMessage(Diagnostic.Kind.NOTE, "process zhangyu12152");

        return false;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> strings = new HashSet<>();
        strings.add(Test.class.getCanonicalName());
        return strings;
    }
}