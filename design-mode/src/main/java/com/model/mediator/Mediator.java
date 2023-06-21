package com.model.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/16 13:48
 */
public interface Mediator {

    public void addColleague(Colleague colleague);

    public void notifyOthers(Colleague colleague);
}
