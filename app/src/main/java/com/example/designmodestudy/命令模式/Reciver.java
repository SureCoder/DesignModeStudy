package com.example.designmodestudy.命令模式;

import android.util.Log;

/**
 * Created by lishuo on 2020/5/11.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class Reciver implements IReciver {
    @Override
    public void executeCommand(ICommand command) {
        Log.e("命令模式",command.toString()+" 我是命令的接收者");
    }
}
