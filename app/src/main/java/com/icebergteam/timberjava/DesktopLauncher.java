package com.icebergteam.timberjava;


import org.jetbrains.annotations.NotNull;

public class DesktopLauncher {

    public static void main(String[] arg) {
        initLogger();
        Timber.e("%s", "Hello world!");
    }

    private static void initLogger() {
        Timber.plant(new LineNumberDebugTree() {

            @Override

            protected void wtf(String tag, @NotNull String message) {
                System.out.println(tag + ": " + message);
            }

            @Override
            protected void println(int priority, String tag, @NotNull String message) {
                switch (priority) {
                    case ASSERT:
                        System.err.println(tag + ": " + message);
                        break;
                    case DEBUG:
                        System.out.println(tag + ": " + message);
                        break;
                    case ERROR:
                        System.err.println(tag + ": " + message);
                        break;
                    case INFO:
                        System.out.println(tag + ": " + message);
                        break;
                    case VERBOSE:
                        System.out.println(tag + ": " + message);
                        break;
                    case WARN:
                        System.out.println(tag + ": " + message);
                        break;
                }
            }
        });
    }
}

