package com.wangtao.sayhi;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author wangtao
 * Created at 2024-09-19
 */
@Mojo(name = "bindPhase", defaultPhase = LifecyclePhase.PACKAGE)
public class BindPhaseMojo extends AbstractMojo {

    @Parameter(property = "sayhi.greeting", defaultValue = "Hello World!" )
    private String greeting1;

    public void execute() {
        getLog().info("====================BindPhaseMojo execute===================");
        getLog().info(greeting1);
    }

    public void setGreeting1(String greeting1) {
        this.greeting1 = greeting1;
    }
}
