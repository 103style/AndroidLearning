# Apktools

### 前提
* 配置好java环境 cmd 试试 javac 能不能用， 不能用血药在path路径下添加javac的路径，在java目录下的bin下面


### 步骤

* clone 项目

* 下载一个apk到 [android_tools](https://github.com/103style/Apktools/tree/master/android_tools) 下

* 在android_tools 目录下 执行 
  ```
  apktool.bat d name.apk
  ```
 * 目录下会生成一个`name`的文件夹，该目录为apktool反编译之后的文件夹 
 
 * 修改你要修改的文件
 
 * 重新打包 `name 代表反编译之后的文件夹名字` 
   ```
   apktool.bat b name
   ```
  * 然后会在`name/dist`目录下生成 重新打好的包
  
  * 如果没有签名证书，先生成签名证书
     ```
     keytool -genkey -alias keystorename.keystore -keyalg RSA -validity 20000 -keystore keystorename.keystore
     ```

  * 然后重新签名
    ```
    jarsigner -verbose -keystore keystorename.keystore -signedjar name_signed.apk \name\dist\name.apk keystorename.keystore
    ``
    
#### 参考
  * [Apktool重打包Apk详细介绍](https://blog.csdn.net/u010889616/article/details/78198822#commentBox)
