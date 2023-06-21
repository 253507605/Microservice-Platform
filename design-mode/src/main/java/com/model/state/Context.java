package com.model.state;

/**
 * @Author Jason.Chen
 * @create 2023/5/29 16:15
 *
 *
 */
public class Context {

    public State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void New(){
        state = new ThreadNewState();
        state.New(this);
    }

    public void Start() {
        state.Start(this);
    }


    public void Block() {
        state.Block(this);
    }

    public void Dead() {
        state.Dead(this);
    }
}
