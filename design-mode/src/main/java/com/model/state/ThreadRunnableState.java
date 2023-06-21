package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 17:15
 */
public class ThreadRunnableState implements State{
    @Override
    public void New(Context context) {

    }

    @Override
    public void Start(Context context) {
        System.out.println("调用start，进入运行状态");
        context.setState(new ThreadRunningState());
    }

    @Override
    public void Running(Context context) {

    }

    @Override
    public void Block(Context context) {

    }

    @Override
    public void Dead(Context context) {

    }
}
