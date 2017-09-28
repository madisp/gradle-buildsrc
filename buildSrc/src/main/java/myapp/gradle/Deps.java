package myapp.gradle;

public class Deps {
    public static final String androidPlugin = "com.android.tools.build:gradle:3.0.0-beta6";

    public static final String kotlinVersion = "1.1.50";
    public static final String kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:" + kotlinVersion;
    public static final String kotlinRuntime = "org.jetbrains.kotlin:kotlin-stdlib-jre7:" + kotlinVersion;

    public static final String appCompat = "com.android.support:appcompat-v7:26.1.0";
    public static final String constraintLayout = "com.android.support.constraint:constraint-layout:1.0.2";

    public static final String junit = "junit:junit:4.12";
}
