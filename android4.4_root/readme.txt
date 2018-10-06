3.打开终端运行如下命令
adb shell
root@rk3288:/ # mount -o remount -o rw /system

Ctrl+c 或者#exit 退出root@rk3288:/ #  

adb push D:\rk3288_root\root.tar system/usr/root.tar
adb push D:\rk3288_root\quick_root.sh system/usr/
adb shell 
接着运行
root@rk3288:/ # cd system/usr/                                                 
root@rk3288:/system/usr # chmod 777 quick_root.sh                              
root@rk3288:/system/usr # ./quick_root.sh 


会自动安装和配置相关文件，配置完成后会自动重启，重启后就已经获得ROOT权限了。