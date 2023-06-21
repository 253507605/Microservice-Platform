package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 16:23
 * 状态模式
 * 线程状态：新建、就绪、运行、阻塞、死亡
 */
public interface State {

    public void New(Context context);

    public void Start(Context context);

    public void Running(Context context);

    public void Block(Context context);

    public void Dead(Context context);

}
