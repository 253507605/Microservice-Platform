package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 17:20
 */
public class ThreadRunningState implements State{
    @Override
    public void New(Context context) {

    }

    @Override
    public void Start(Context context) {

    }

    @Override
    public void Running(Context context) {
        System.out.println("已经在运行中");
    }

    @Override
    public void Block(Context context) {
        System.out.println("调用block方法，进入阻塞状态");
        context.setState(new ThreadBlockState());
    }

    @Override
    public void Dead(Context context) {

    }
}
