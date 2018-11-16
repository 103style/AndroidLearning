###  git ssh 设置步骤


* 配置用户名和邮箱地址，在桌面右键点击`git bash here`,然后输入以下命令
  ```
  git config --global user.name "superGG1990"
  git config --global user.email "superGG1990@163.com"
  ```

* 生成密钥对, 输入以下命令。 回车--Y--回车
  ```
  ssh-keygen -t rsa -C "your_email@youremail.com"
  ```

* 配置ssh。 生成的目录在 `C:\Users\用户名\.ssh`下，用notepad++打开然后copy密钥对到对应的ssh配置里。
