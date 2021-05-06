package com.icebergteam.timberjava;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class LineNumberDebugTree extends Timber.DebugTree {

    @Nullable
    @Override
    protected String createStackElementTag(@NotNull StackTraceElement element) {
        return String.format("%s #%s", element, element.getMethodName());
    }
}