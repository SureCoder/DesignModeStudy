package com.example.designmodestudy.命令模式;

/**
 * Created by lishuo on 2020/5/11.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class CopyCommand implements ICommand {
    IReciver reciver;

    String commandStr = " 我是CopyCommand";

    public CopyCommand(IReciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void execute() {
        reciver.executeCommand(this);
    }

    @Override
    public String toString() {
        return "CopyCommand{" +
                "reciver=" + reciver +
                ", commandStr='" + commandStr + '\'' +
                '}';
    }
}
