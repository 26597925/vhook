3.���ն�������������
adb shell
root@rk3288:/ # mount -o remount -o rw /system

Ctrl+c ����#exit �˳�root@rk3288:/ #  

adb push D:\rk3288_root\root.tar system/usr/root.tar
adb push D:\rk3288_root\quick_root.sh system/usr/
adb shell 
��������
root@rk3288:/ # cd system/usr/                                                 
root@rk3288:/system/usr # chmod 777 quick_root.sh                              
root@rk3288:/system/usr # ./quick_root.sh 


���Զ���װ����������ļ���������ɺ���Զ���������������Ѿ����ROOTȨ���ˡ�