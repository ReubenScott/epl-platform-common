package com.kindustry.test.observe;

import java.util.Observable;
import java.util.Observer;

import com.kindustry.framework.service.Worker;
/**
 * 监听
 * */
public class Overseer implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Worker){
			Worker w = (Worker) o;
			if (w.isWorkDone()){
				w.setThreadFinish(true);
			}
		}
	}

}
