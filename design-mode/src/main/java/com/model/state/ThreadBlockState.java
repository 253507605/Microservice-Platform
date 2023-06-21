package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 16:52
 */
public class ThreadBlockState implements State{
    @Override
    public void New(Context context) {

    }

    @Override
    public void Start(Context context) {
        System.out.println("已经在阻塞中！！");
    }

    @Override
    public void Running(Context context) {
        System.out.println("已经在阻塞中！！");
    }

    @Override
    public void Block(Context context) {
        System.out.println("已经在阻塞中！！");
    }

    @Override
    public void Dead(Context context) {
        System.out.println("调用dead方法，线程死亡");
    }
}
