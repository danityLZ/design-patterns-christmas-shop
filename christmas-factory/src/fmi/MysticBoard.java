package fmi;

import java.util.ArrayList;
import java.util.List;

public class MysticBoard implements Observable {
	
	private List<Observer> observers;
	private String toyRequested;
	
	public MysticBoard() {
		this.observers = new ArrayList<>();
	}
	
	 public void getToy(String toyRequested) {
	        System.out.println("The Mystic Board says Santa wished for: " + toyRequested);
	        this.toyRequested = toyRequested;
	        this.notifyObservers();
	    }
	 
	 @Override
	 public void subscribe(Observer observer) {
		 this.observers.add(observer);
		 observer.setMysticBoard(this);
	 }
	 
	 @Override 
	 public void unsubscribe(Observer observer) {
		 this.observers.remove(observer);
		 observer.setMysticBoard(null);
	 }
	 
	  @Override
	    public void notifyObservers() {
	        for (Observer observer : this.observers) {
	            observer.update();
	        }
	    }

	    @Override
	    public String getToyRequested() {
	        return toyRequested;
	    }
	}

