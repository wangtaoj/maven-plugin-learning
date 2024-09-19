package com.wangtao.sayhi;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Execute;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 当使用命令行执行这个goal时
 * mvn com.wangtao:demo-maven-plugin:1.0-SNAPSHOT:execute
 * 提示: 如果省略版本号, 将默认使用仓库的最新版本
 *
 * 因为Execute注解中指定了阶段为package
 *
 * 执行过程为, 先build到package阶段(这会触发中间各个阶段绑定的goal), 然后执行sayhi这个goal
 */

@Mojo(name = "execute")
@Execute(phase = LifecyclePhase.PACKAGE)
public class ExecuteMojo extends AbstractMojo {

    @Parameter(property = "sayhi.greeting", defaultValue = "Hello World!" )
    private String greeting2;

    public void execute() {
        getLog().info("=====================ExecuteMojo execute===================");
        getLog().info(greeting2);
    }

    public void setGreeting2(String greeting2) {
        this.greeting2 = greeting2;
    }
}
