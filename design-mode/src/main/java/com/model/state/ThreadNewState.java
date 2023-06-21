package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 16:52
 */
public class ThreadNewState implements State{
    @Override
    public void New(Context context) {
        System.out.println("新建一个线程");
        context.setState(new ThreadRunnableState());
    }

    @Override
    public void Start(Context context) {

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
