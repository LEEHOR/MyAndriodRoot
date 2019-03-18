package com.framework.myandriodroot.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 * Dagger2可以通过自定义注解限定注解作用域，来管理每个对象实例的生命周期。
 * **@Qualifier: **当类的类型不足以鉴别一个依赖的时候，我们就可以使用这个注解标示。
 * 例如：在Android中，我们会需要不同类型的context，所以我们就可以定义
 * qualifier注解“@perApp”和“@perActivity”，这样当注入一个context的时候，
 * 我们就可以告诉 Dagger我们想要哪种类型的context。

 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerApp {
}
