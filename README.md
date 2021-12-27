先看接入步骤：
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```java
    dependencies {
	        implementation 'com.github.linpeixu:GsonConverterFactory:1.0.3'
            //或者implementation 'com.gitlab.linpeixu:GsonConverterFactory:1.0.3'
	}
```

若编译过程中报Duplicate class错误，可能是你的项目也引入了Gson，尝试在module下的gradle文件下
的android标签里加入如下：

```java
    configurations {
            cleanedAnnotations
            compile.exclude group: 'com.google.code.gson' , module:'gson'
    }
```
